package assignment_10_Feb;

import java.util.*;

class LinkedListQueueTask {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");
        queue.add("Customer4");
        queue.add("Customer5");

        queue.poll();
        queue.poll();

        System.out.println("Remaining Queue: " + queue);
    }
}
