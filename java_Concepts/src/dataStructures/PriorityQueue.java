import java.util.Scanner;

public class Main {

    static class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enQueue(Scanner in) {

        System.out.print("Enter value: ");
        int val = in.nextInt();

        System.out.print("Enter priority: ");
        int p = in.nextInt();

        Node newNode = new Node(val, p);

       
        if (front == null) {
            front = rear = newNode;
        }

       
        else if (p < front.priority) {
            newNode.next = front;
            front = newNode;
        }

        
        else {
            Node temp = front;

            while (temp.next != null &&
                   temp.next.priority <= p) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            if (newNode.next == null) {
                rear = newNode;
            }
        }
    }

    static void deQueue() {

        if (front == null) {
            System.out.println("Queue is empty");
        } 
        else {
            System.out.println("Deleted: " + front.data);

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    static void display() {

        if (front == null) {
            System.out.println("Queue is empty");
        } 
        else {
            Node temp = front;

            while (temp != null) {
                System.out.print(
                    temp.data + "(P" + temp.priority + ") "
                );

                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = in.nextInt();

            switch (choice) {

                case 1:
                    enQueue(in);
                    break;

                case 2:
                    deQueue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        in.close();
    }
}
