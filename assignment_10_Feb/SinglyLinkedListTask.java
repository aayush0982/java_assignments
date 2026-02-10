package assignment_10_Feb;

class SinglyLinkedListTask {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void insertAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	boolean search(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key)
				return true;
			temp = temp.next;
		}
		return false;
	}

	void reverse() {
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		SinglyLinkedListTask list = new SinglyLinkedListTask();

		list.insertAtBeginning(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);

		list.traverse();

		System.out.println("Search 20: " + list.search(20));

		list.reverse();
		System.out.print("Reversed List: ");
		list.traverse();
	}
}
