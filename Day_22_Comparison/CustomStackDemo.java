package Day_22_Comparison;

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomStack {
    StackNode head;

    void push(int value) {
        StackNode node = new StackNode(value);
        node.next = head;
        head = node;
        System.out.println(value + " pushed to stack");
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int removedValue = head.data;
        head = head.next;
        return removedValue;
    }
}

class GenericStackNode<T> {
    T data;
    GenericStackNode<T> next;

    GenericStackNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class GenericStack<T> {
    GenericStackNode<T> head;

    void push(T value) {
        GenericStackNode<T> node = new GenericStackNode<>(value);
        node.next = head;
        head = node;
        System.out.println(value + " pushed to generic stack");
    }

    T pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return null;
        }
        T removedValue = head.data;
        head = head.next;
        return removedValue;
    }
}

public class CustomStackDemo {
    public static void main(String[] args) {

        CustomStack intStack = new CustomStack();
        intStack.push(100);
        intStack.push(200);
        System.out.println(intStack.pop());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        System.out.println(stringStack.pop());
    }
}
