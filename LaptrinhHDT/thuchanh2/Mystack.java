package mystack;

import java.util.EmptyStackException;
import java.util.LinkedList;
   
        

public class Mystack<T> {

    private final LinkedList<T> stack;
    public Mystack() {
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
        Mystack<String> mystack = new Mystack();
        mystack.push("1");
        mystack.push("2");
        mystack.push("3");
        mystack.push("4");
        mystack.push("5");
        System.out.printf("Pop elements from stack : ");
        while (!mystack.isEmpty()) {
            System.out.printf(" %s", mystack.pop());
        }
    }
    
    
    
  
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfIStrings();
    }
}