/*
 SafeDivide 
Project Background

A fintech startup named SafeDivide Systems is building a lightweight backend module for its loan calculation engine.
One of its key operations involves dividing two integers — for instance, calculating the 
EMI ratio, interest percentage, or loan-to-income ratio.

However, division errors like dividing by zero can crash the system. To ensure reliability, 
the developers must handle this case gracefully using Java Exception Handling.
Task Description

You are part of the SafeDivide engineering team. Your task is to write a Java program that 
performs integer division using static inputs (hardcoded values).

The program should:

    Attempt to divide the two integers.
    Catch ArithmeticException if the divisor is zero.
    Print a meaningful message instead of letting the program crash.

Functional Requirements
Static Input

Hardcode two integers in the code:

int dividend = 9;
int divisor = 3; // Change to 0 to test exception

Exception Handling Logic

    Wrap the division in a try block.
    Catch ArithmeticException.
    If caught → print:

    Division by zero is not allowed

    Otherwise → print the result of the division.

Expected Behavior
Example 1 — Division by Zero

Input:

dividend = 10;
divisor = 0;

Output:

Division by zero is not allowed

Explanation: The program catches ArithmeticException and prints a clear message, avoiding system crash.
Example 2 — Valid Division

Input:

dividend = 9;
divisor = 3;

Output:

3

Explanation: Since divisor ≠ 0, the result is printed normally using integer division.
Technical Notes

    Follow integer division semantics (truncates toward zero).
    Use try-catch for safe error handling.
    All inputs are 32-bit signed integers.
    Exception message must be exactly:

    Division by zero is not allowed

Concepts Demonstrated

    Exception Handling in Java
    ArithmeticException and control flow
    Static Input Processing
    Safe Coding Practices in Financial Applications
 */

package Feb_19_Prac;
import java.util.*;

@SuppressWarnings("serial")
class ArithException extends Exception {
    ArithException(String msg) { 
        super(msg);
    }
}

public class SafeDIvePracProg {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        try {
            int op = n1 / n2;
            System.out.println(op);
        }
        catch (ArithmeticException e) { 
            try {
                throw new ArithException("Division by zero is not allowed");
            } catch (ArithException ex) {
                System.out.println(ex.getMessage());
            }
        }

        s.close();
    }
}
