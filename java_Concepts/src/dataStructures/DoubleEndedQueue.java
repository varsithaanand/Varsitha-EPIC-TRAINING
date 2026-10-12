import java.util.Scanner;

public class Main {

    static int[] dq = new int[5];
    static int front = -1;
    static int rear = -1;

    static void insertFront(Scanner in) {

        System.out.print("Enter value: ");
        int val = in.nextInt();

        if (front == -1) {
            front = rear = 0;
            dq[front] = val;
        } else {
            for (int i = rear; i >= front; i--) {
                dq[i + 1] = dq[i];
            }

            dq[front] = val;
            rear++;
        }
    }

    static void insertRear(Scanner in) {

        System.out.print("Enter value: ");
        int val = in.nextInt();

        if (rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }

        dq[rear] = val;
    }

    static void deleteFront() {

        if (front == -1) {
            System.out.println("Deque is empty");
        } else {

            for (int i = 0; i < rear; i++) {
                dq[i] = dq[i + 1];
            }

            dq[rear] = 0;
            rear--;

            if (rear == -1) {
                front = rear;
            }
        }
    }

    static void deleteRear() {

        if (rear == -1) {
            System.out.println("Deque is empty");
        } else {

            dq[rear] = 0;
            rear--;

            if (rear == -1) {
                front = rear;
            }
        }
    }

    static void display() {

        if (rear == -1) {
            System.out.println("Deque is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(dq[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = in.nextInt();

            switch (choice) {

                case 1:
                    insertFront(in);
                    break;

                case 2:
                    insertRear(in);
                    break;

                case 3:
                    deleteFront();
                    break;

                case 4:
                    deleteRear();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        in.close();
    }
}
