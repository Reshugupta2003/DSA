import java.util.*;

public class ImplementStack {    // Implementing stack using queue

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x){

        if(!q1.isEmpty()){
            for(int i =0; !q1.isEmpty(); i++){
                q2.add(q1.remove());
            }
            q1.add(x);
            for(int j =0; !q2.isEmpty(); j++){
                q1.add(q2.remove());
            }
           return;
        }
        else{
            q1.add(x);
            return;
        }
    }
    public int pop()
    {
        return q1.remove();
    }
    public boolean empty()
    {
        return q1.isEmpty();
    }
    public void print(){
        System.out.println(q1);
    }
    public static void main(String[] args) {
    
        ImplementStack qx = new ImplementStack();

        qx.push(3);
        qx.push(6);
        qx.push(1);
        qx.print();

        qx.pop();
        qx.print();
    }
}
