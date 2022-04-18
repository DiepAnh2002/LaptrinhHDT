package stackn;

import java.util.EmptyStackException;
import java.util.LinkedList;
   
        

public class Stackn<T> {

    private final LinkedList<T> stack;
    public Stackn() {
        stack = new LinkedList();
    }
    
    public void push(T element) {
        stack.addFirst(element);
    }
    
    public T pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    return stack.removeFirst();
    }
    
    public int size() {
        return stack.size();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private static void stackOfIStrings() {
        Stackn<String> stackn = new Stackn();
        stackn.push("One");
        stackn.push("Two");
        stackn.push("Three");
        System.out.println("1.1 Size of stack after push operations: " + stackn.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stackn.isEmpty()) {
            System.out.printf(" %s", stackn.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stackn.size());
    }
    
    
    
  
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfIStrings();
    }
}