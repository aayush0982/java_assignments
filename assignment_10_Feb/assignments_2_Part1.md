## Assignment-1 Part 1 – Concept Analysis 

### Comparison Between ArrayList and LinkedList

| Feature | ArrayList | LinkedList |
|--------|-----------|------------|
| Internal Structure | Dynamic array | Doubly linked list |
| Access Time Complexity | O(1) – direct index access | O(n) – sequential traversal |
| Insertion Time Complexity | O(n) – elements need shifting | O(1) – if node position is known |
| Deletion Time Complexity | O(n) – shifting required | O(1) – direct node removal |
| Memory Usage | Less memory (stores only data) | More memory (data + next & previous pointers) |

---

### Choosing the Correct Data Structure

1. **Student record system** → **ArrayList**  
   Fast random access using index or roll number.

2. **Browser history** → **LinkedList**  
   Efficient forward and backward navigation.

3. **Online shopping cart** → **ArrayList**  
   Frequent access, updates, and iteration.

4. **Undo/Redo feature** → **LinkedList**  
   Efficient insertion and deletion operations.








   
## Assignment-2 Part 1 – Scenario Based Analysis

### 1. Real-time chat message storage  
**Chosen Data Structure:** LinkedList  
**Justification:**  
Messages are added frequently at the end. Insertion is O(1) in LinkedList, making it efficient for continuous message flow.

---

### 2. Music playlist where songs are frequently reordered  
**Chosen Data Structure:** LinkedList  
**Justification:**  
Frequent insertion and deletion operations are required. LinkedList supports O(1) insertion and deletion when position is known.

---

### 3. Student database with frequent searching by index  
**Chosen Data Structure:** ArrayList  
**Justification:**  
ArrayList provides O(1) access time using index, making searching faster.

---

### 4. Browser back and forward navigation  
**Chosen Data Structure:** LinkedList  
**Justification:**  
LinkedList allows efficient traversal and navigation in both directions, suitable for browser history.

---

### 5. Online exam system storing answers sequentially  
**Chosen Data Structure:** ArrayList  
**Justification:**  
Data is stored sequentially with minimal insertions or deletions. ArrayList offers fast access and better memory efficiency.
   