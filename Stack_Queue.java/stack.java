import java.util.*;
public class stack{
    public static void main(String[] args) {
        
        Stack<Integer> Stack_1 = new Stack<>();

        //push element in stack
        Stack_1.push(3);
        Stack_1.push(4);
        Stack_1.add(5);
        Stack_1.push(7);

        //Print top most element in stack
        System.out.println("Top most element in stack Before deletion = "+ Stack_1.peek());

        //pop the eelment from stack
        Stack_1.pop();
        System.out.println("Top most element in stack after deletion = "+ Stack_1.peek());

        //Search Element in stack
        //Search function return -1 if element not present in stack
        System.out.println("Element 3 is present at a postion = "+ Stack_1.search(3));

        //Difference btn add and push method
         System.out.println(Stack_1.push(9));
         System.out.println(Stack_1.add(12));

         //Print stack
        System.out.println(Stack_1);

    }
}