## Assignment 2

## Part A: Application-Based Questions

1. **Explain how stack is used in function calls (Call Stack):**  
   When a function is called, its execution context (local variables, return address) is pushed onto the call stack. When the function finishes, it is popped from the stack, and control returns to the calling function. This ensures proper order of function execution and supports recursion.

2. **How is stack used in Undo/Redo operations?**  
   Undo and Redo features use two stacks:  
   - **Undo stack:** Stores previous actions. When an undo is performed, the action is popped from the undo stack and pushed to the redo stack.  
   - **Redo stack:** Stores undone actions. When a redo is performed, the action is popped from the redo stack and pushed back to the undo stack.

3. **Why is stack useful in expression evaluation?**  
   Stack helps in managing operator precedence and parentheses when evaluating expressions. It is used in converting infix to postfix/prefix and in actual evaluation of postfix expressions efficiently using LIFO order.

4. **Differentiate between Infix, Prefix, and Postfix expressions:**  
   | Expression Type | Example   | Order of Operators & Operands                  |
   |-----------------|-----------|-----------------------------------------------|
   | **Infix**       | A + B * C | Operators between operands (human-readable)  |
   | **Prefix**      | + A * B C | Operators before operands                     |
   | **Postfix**     | A B C * + | Operators after operands                       |

## Part B: Coding Activity 1 – Balanced Parentheses

**Problem:** Check whether a given expression has balanced parentheses using Stack.

**Algorithm:**
1. Create an empty stack of characters.
2. Traverse each character of the expression:
   - If it is an opening bracket `(`, `{`, `[`, push it to the stack.
   - If it is a closing bracket `)`, `}`, `]`:
     - If stack is empty, return Not Balanced.
     - Pop the top element and check if it matches the corresponding opening bracket.
3. After traversal, if the stack is empty → Balanced, else → Not Balanced.

**Test Cases:**
- Input: `(A+B)` → Output: Balanced  
- Input: `(A+B` → Output: Not Balanced

## Part C: Coding Activity 2 – Infix to Postfix Conversion

**Problem:** Convert an Infix expression to Postfix expression using Stack.

**Algorithm:**
1. Create an empty stack for operators.
2. Initialize an empty string for postfix expression.
3. Traverse the infix expression character by character:
   - If it is an operand (letter or digit), append it to postfix string.
   - If it is `(`, push to stack.
   - If it is `)`, pop from stack and append to postfix until `(` is found.
   - If it is an operator (+, -, *, /, ^):
     - While stack is not empty and top has higher or equal precedence, pop and append to postfix.
     - Push current operator to stack.
4. After traversal, pop all remaining operators from stack and append to postfix.

## Part D: Stack Challenge Problem – Reverse Array

**Problem:** Reverse an integer array using Stack.

**Algorithm:**
1. Create an empty stack of integers.
2. Traverse the array and push each element to the stack.
3. Traverse the array again, pop elements from the stack, and assign them back to the array.
4. The array is now reversed.

## Part E: Analytical Task – Time Complexity

**Time Complexity of Stack Operations:**

- **Push:** O(1) – Add element to the top of stack.  
- **Pop:** O(1) – Remove element from the top of stack.  
- **Peek:** O(1) – Access the top element without removing it.  
- **Balanced Parentheses Check:** O(n) – Traverse the expression once using stack operations.  
