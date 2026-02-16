package Feb_16_Prac;

class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] < heap[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    private void heapifyDown(int index) {
        int largest = index;

        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return max;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class MaxHeapPrac {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);

        h.insert(30);
        h.insert(10);
        h.insert(20);
        h.insert(5);

        System.out.print("Heap: ");
        h.printHeap();

        System.out.println("Extracted Max: " + h.extractMax());

        System.out.print("Heap after extraction: ");
        h.printHeap();
    }
}
