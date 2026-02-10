package assignment_10_Feb;

import java.util.*;

class MergeSortedLinkedLists {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node h1, Node h2) {
        ArrayList<Integer> list = new ArrayList<>();

        while (h1 != null) {
            list.add(h1.data);
            h1 = h1.next;
        }

        while (h2 != null) {
            list.add(h2.data);
            h2 = h2.next;
        }

        Collections.sort(list);

        Node dummy = new Node(0);
        Node temp = dummy;

        for (int v : list) {
            temp.next = new Node(v);
            temp = temp.next;
        }

        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        Node result = merge(a, b);
        print(result);
    }
}
