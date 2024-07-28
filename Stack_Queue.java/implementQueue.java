import java.util.*;

public class implementQueue {    // Implementing queue using stack
 
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        public int Enqueue(int x){
            stk1.push(x);
            return x;
        }
        public int Dequeue(){

            if(stk1.empty() && stk2.empty()){
                System.exit(0);
            }
            int size1 = stk1.size();
            for(int i=0; i<size1; i++){

                
                stk2.push(stk1.pop());
            }

           int pop = stk2.pop();
            int size2 = stk2.size();

            for(int i=0; i< size2; i++){
                stk1.push(stk2.pop());
            }
            return pop;
        }
        public void print(){
            System.out.println(stk1);
        }
    
    public static void main(String[] args) {
        
        implementQueue q = new implementQueue();

        for(int i =1; i< 6; i++){
            q.Enqueue(i);
        }
        // Print a queue
        q.print();
        
        // remove front element of queue
        System.out.println("Pop front element from queue = " + q.Dequeue());
        System.out.print("Queue after poping the element = ");
        q.print();

      
    }
}