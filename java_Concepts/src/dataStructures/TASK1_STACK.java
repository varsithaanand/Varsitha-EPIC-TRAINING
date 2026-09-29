import java.util.Scanner;

class StackImplementation {

    public int push(char val, int top, char[] stack, int n) {
        if (top >= n - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
        return top;
    }

    public int pop(char[] stack, int top) {
        if (top != -1) {
            char val = stack[top--];
            System.out.println(val);
        } else {
            System.out.println("Stack underflow");
        }
        return top;
    }

    public void display(int top, char[] stack) {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void top(int top, char[] stack) {
        if (isEmpty(top)) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println(stack[top]);
        }
    }

    public boolean isEmpty(int top) {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StackImplementation in = new StackImplementation();

        String str = s.next();

        char[] stack1 = new char[str.length()]; 
        char[] stack2 = new char[str.length()]; 

        int Atop = -1;
        int top = -1;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                Atop = in.push(ch, Atop, stack1, str.length());
            } else {
                top = in.push(ch, top, stack2, str.length());
            }
        }

        while (true) {

            System.out.println("\n1. pop a symbol");
            System.out.println("2. pop an alphabet");
            System.out.println("3. display alphabet");
            System.out.println("4. display symbol");
            System.out.println("5. Peek Symbol");
            System.out.println("6. Peek alphabet");
            System.out.println("7. IsEmpty Symbol");
            System.out.println("8. IsEmpty alphabet");
            System.out.println("9. Exit");

            int ch = s.nextInt();

            switch (ch) {

                case 1:
                    top = in.pop(stack2, top);
                    break;

                case 2:
                    Atop = in.pop(stack1, Atop);
                    break;

                case 3:
                    in.display(Atop, stack1);
                    break;

                case 4:
                    in.display(top, stack2);
                    break;

                case 5:
                    in.top(top, stack2);
                    break;

                case 6:
                    in.top(Atop, stack1);
                    break;

                case 7:
                    System.out.println(in.isEmpty(top));
                    break;

                case 8:
                    System.out.println(in.isEmpty(Atop));
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
