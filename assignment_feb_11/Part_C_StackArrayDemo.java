package assignment_feb_11;

import java.util.Scanner;

class ArrayStack {
    int[] stack;
    int top;
    int size;

    ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top--] + " popped");
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }
}

public class Part_C_StackArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(5);

        boolean running = true;
        while (running) {
            System.out.println("1.Push 2.Pop 3.Peek 4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        sc.close();
        System.out.println("Program exited.");
    }
}
