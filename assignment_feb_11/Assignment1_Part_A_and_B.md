## Assignment 1
## Part A: Conceptual Questions

1. **Define Stack and explain LIFO principle:**  
   A stack is a linear data structure that stores elements in a **Last-In-First-Out (LIFO)** manner. The last element inserted is the first one to be removed.

2. **What is Stack Overflow and Stack Underflow?**  
   - **Stack Overflow:** Occurs when pushing an element into a full stack.  
   - **Stack Underflow:** Occurs when popping an element from an empty stack.

3. **Write real-life examples of Stack:**  
   - Undo feature in text editors  
   - Browser history navigation  
   - Call stack in programming  

4. **Time complexity of Push and Pop operations:**  
   - Push: O(1)  
   - Pop: O(1)
   
## Part B: Dry Run Activity (Stack Size = 5)

**Initial Stack:**  
TOP = -1  
[ _ _ _ _ _ ]

### 1️⃣ Push(10)
TOP = 0  
[ 10 _ _ _ _ ]

### 2️⃣ Push(20)
TOP = 1  
[ 10 20 _ _ _ ]

### 3️⃣ Push(30)
TOP = 2  
[ 10 20 30 _ _ ]

### 4️⃣ Pop()
Popped element = 30  
TOP = 1  
[ 10 20 _ _ _ ]

### 5️⃣ Push(40)
TOP = 2  
[ 10 20 40 _ _ ]

### 6️⃣ Peek()
Peek element = 40  
TOP = 2  
[ 10 20 40 _ _ ]

**Conclusion:** Dry run helps visualize stack operations and track TOP correctly.

## Part C: Stack Using Array (Conclusion)

Stack using arrays allows **user input and dynamic operations** (Push, Pop, Peek) with **constant time complexity** for basic operations.


## Part D: Balanced Parentheses Using Stack (Conclusion)

Stack is ideal for **parentheses matching**, validating balanced expressions efficiently. It ensures opening and closing brackets are matched in correct order.

   
