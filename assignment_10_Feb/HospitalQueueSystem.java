package assignment_10_Feb;

import java.util.*;

class HospitalQueueSystem {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();

		queue.add("Patient1");
		queue.add("Patient2");
		queue.add("Patient3");
		queue.add("Patient4");
		queue.add("Patient5");

		queue.addFirst("EmergencyPatient");

		queue.poll();
		queue.poll();

		System.out.println("Current Hospital Queue: " + queue);
	}
}
