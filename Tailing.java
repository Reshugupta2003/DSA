package DSA.BackTracing;

public class Tailing {
    public static int tailing(int n){
        int result =0;

        if (n <= 3)
        {
            return n;
        } 
        else 
        {
            result = tailing(n -1) + tailing(n -2); 
        }
        return result;
    }
    public static void main(String[] args)
    {
       int result = tailing(10);
        System.out.println("No. of getways = " + result);
    }
}
