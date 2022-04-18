package stackmang;

import java.util.Stack;

public class Stackmang {

     static int evaluatePostfix(String exp) 
    { 
        Stack<Integer> stackmang=new Stack<>();
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
            if(Character.isDigit(c)) 
            stackmang.push(c - '0');
            else
            { 
                int val1 = stackmang.pop(); 
                int val2 = stackmang.pop(); 
                  
                switch(c) 
                { 
                    case '+' -> stackmang.push(val2+val1); 
                      
                    case '-' -> stackmang.push(val2- val1); 
                      
                    case '/' -> stackmang.push(val2/val1); 
                      
                    case '*' -> stackmang.push(val2*val1); 
              } 
            } 
        } 
        return stackmang.pop();     
    }
    
    public static void main(String[] args) {
       String exp="221*+9-"; 
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
    
}