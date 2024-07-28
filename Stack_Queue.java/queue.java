import java.util.*;

public class queue {   
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=5; i++){
            q.add(i);
        }
        System.out.println(q); 
        System.out.println("Remove element from queue = "+ q.remove()); 
        System.out.println("Top eleemnt = "+ q.peek());
        System.out.println("Size of queue = "+ q.size());
        System.out.println(q);
        System.out.println("Poll element and show true/ false = "+q.remove(5));
        System.out.println(q);

    }
}
