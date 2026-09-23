package thread;
import java.util.Scanner;

//BankAccount class
class BankAccount {

 private int balance;

 // Constructor
 BankAccount(int balance) {
     this.balance = balance;
 }

 // Synchronized deposit method
 synchronized void deposit(int amount) {

     balance = balance + amount;

     System.out.println(
         Thread.currentThread().getName()
         + " | ID: " + Thread.currentThread().getId()
         + " | Deposited: ₹" + amount
         + " | Balance: ₹" + balance
     );
 }

 // Synchronized withdrawal method
 synchronized void withdraw(int amount) {

     if (balance >= amount) {

         balance = balance - amount;

         System.out.println(
             Thread.currentThread().getName()
             + " | ID: " + Thread.currentThread().getId()
             + " | Withdrawn: ₹" + amount
             + " | Balance: ₹" + balance
         );

     } else {

         System.out.println(
             Thread.currentThread().getName()
             + " | ID: " + Thread.currentThread().getId()
             + " | Insufficient balance"
         );
     }
 }

 // Synchronized display method
 synchronized void displayBalance() {
     System.out.println("Final Balance: ₹" + balance);
 }
}


//DepositThread extends Thread
class DepositThread extends Thread {

 private BankAccount account;
 private int amount;
 private int count;

 DepositThread(BankAccount account, int amount, int count) {
     this.account = account;
     this.amount = amount;
     this.count = count;
 }

 // run() contains the work of the thread
 public void run() {

     for (int i = 1; i <= count; i++) {

         account.deposit(amount);

         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Deposit thread interrupted");
         }
     }
 }
}


//WithdrawTask implements Runnable
class WithdrawTask implements Runnable {

 private BankAccount account;
 private int amount;
 private int count;

 WithdrawTask(BankAccount account, int amount, int count) {
     this.account = account;
     this.amount = amount;
     this.count = count;
 }

 // run() contains the work of the thread
 public void run() {

     for (int i = 1; i <= count; i++) {

         account.withdraw(amount);

         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println("Withdraw thread interrupted");
         }
     }
 }
}


//Parent class
class SomeClass {

 void show() {
     System.out.println("This is SomeClass");
 }
}


//Demonstrates:
//extends SomeClass + implements Runnable
class DemoClass extends SomeClass implements Runnable {

 public void run() {
     System.out.println(
         "DemoClass extends SomeClass and implements Runnable"
     );
 }
}
public class ThreadLifeCycle1 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read initial balance
        System.out.print("Enter Initial Balance: ");
        int initialBalance = sc.nextInt();

        // Read deposit details
        System.out.print("Enter Deposit Amount: ");
        int depositAmount = sc.nextInt();

        System.out.print("Enter Deposit Count: ");
        int depositCount = sc.nextInt();

        // Read withdrawal details
        System.out.print("Enter Withdrawal Amount: ");
        int withdrawAmount = sc.nextInt();

        System.out.print("Enter Withdrawal Count: ");
        int withdrawCount = sc.nextInt();

        // Create ONE BankAccount object
        BankAccount account = new BankAccount(initialBalance);

        // Create DepositThread object
        DepositThread depositThread =
            new DepositThread(account, depositAmount, depositCount);

        // Create WithdrawTask object
        WithdrawTask withdrawTask =
            new WithdrawTask(account, withdrawAmount, withdrawCount);

        // Create Thread object for Runnable
        Thread withdrawThread =
            new Thread(withdrawTask);

        // Give names to threads
        depositThread.setName("Deposit Thread");
        withdrawThread.setName("Withdraw Thread");

        // Display NEW state
        System.out.println();
        System.out.println("Before starting:");
        System.out.println(
            depositThread.getName() + " : "
            + depositThread.getState()
        );

        System.out.println(
            withdrawThread.getName() + " : "
            + withdrawThread.getState()
        );

        // Start both threads
        System.out.println();
        System.out.println("Starting threads...");

        depositThread.start();
        withdrawThread.start();

        // Display current states
        System.out.println();
        System.out.println("During execution:");
        System.out.println(
            depositThread.getName() + " : "
            + depositThread.getState()
        );

        System.out.println(
            withdrawThread.getName() + " : "
            + withdrawThread.getState()
        );

        // Main thread waits for both threads
        try {

            depositThread.join();
            withdrawThread.join();

        } catch (InterruptedException e) {

            System.out.println("Main thread interrupted");
        }

        // Display final states
        System.out.println();
        System.out.println("After completion:");

        System.out.println(
            depositThread.getName() + " : "
            + depositThread.getState()
        );

        System.out.println(
            withdrawThread.getName() + " : "
            + withdrawThread.getState()
        );

        // Display final balance
        System.out.println();
        account.displayBalance();

        // Demonstrate extends + implements
        System.out.println();
        DemoClass demo = new DemoClass();
        demo.show();

        Thread demoThread = new Thread(demo);
        demoThread.start();

        try {
            demoThread.join();
        } catch (InterruptedException e) {
            System.out.println("Demo thread interrupted");
        }

        sc.close();
    }

}
