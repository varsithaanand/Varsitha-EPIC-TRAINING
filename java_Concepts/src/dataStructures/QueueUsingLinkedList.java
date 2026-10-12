import java.util.Scanner;

public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enQueue(Scanner in) {
        System.out.print("Enter value: ");
        int val = in.nextInt();

        Node newNode = new Node(val);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    static void deQueue() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
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
        } else {
            Node temp = front;

            while (temp != null) {
                System.out.print(temp.data + " ");
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
