package Feb_16_Prac;
import java.util.*;

class BST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insert(root.left, data);
        else if (data > root.data) root.right = insert(root.right, data);
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }
}

public class BSTAndHeapDemo {

    public static void main(String[] args) {

        BST tree = new BST();
        int[] elements = {50, 30, 70, 20, 40, 60, 80};

        for (int x : elements) {
            tree.root = tree.insert(tree.root, x);
        }

        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        System.out.println();

        System.out.println(tree.search(tree.root, 40));
        System.out.println(tree.search(tree.root, 100));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            minHeap.add(rand.nextInt(100));
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}


/*
 Binary Search Tree (BST) Operations

Insert:
Insertion starts from the root of the BST. The value to be inserted is compared with the current node.
If the value is smaller, it moves to the left child; if greater, it moves to the right child.
This process continues until a null position is found, where the new node is inserted.

Search:
Searching in a BST follows the same comparison rule as insertion.
At each node, the key is compared with the node value.
If the key is smaller, search continues in the left subtree; if larger, in the right subtree.
The search ends when the key is found or a null node is reached.

Traversal:
Traversal is the process of visiting all nodes of the tree.
Inorder Traversal: Left subtree → Root → Right subtree (produces sorted order in BST)
Preorder Traversal: Root → Left subtree → Right subtree
Postorder Traversal: Left subtree → Right subtree → Root


Time Complexity of BST Operations

Insert:
Best / Average Case: O(log n)
Worst Case: O(n)

Search:
Best / Average Case: O(log n)
Worst Case: O(n)

Traversal:
All Traversals: O(n)


Min-Heap Operations

Insert:
A new element is inserted at the end of the heap.
Heapify-up is performed to maintain the min-heap property.

Delete (Poll):
The minimum element (root) is removed.
The last element is moved to the root and heapify-down is applied.

Get Minimum:
The minimum element is accessed directly from the root.


Time Complexity of Min-Heap Operations

Insert: O(log n)
Delete (Poll): O(log n)
Get Minimum (Peek): O(1)
Build Heap: O(n)


 */
