package assignment_10_Feb;

import java.util.*;

class RemoveDuplicates {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(3);

        list.removeDuplicates();
        list.print();
    }
}
