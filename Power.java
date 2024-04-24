package DSA.Recursion;
import java.util.Scanner;

public class Power {
    
    public static int power(int p , int q){
        int result=0;
        if (q == 0) {
            return 1;
        }
        else if(q == 1){
            return p;
        }
        else
        {
          result = p*power(p, q-1);
        }
        System.out.println("p = "+ p +"q = "+ q);
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
         
        System.out.println("Enter the Power");
        int n = sc.nextInt();
        //                                                     Approch:- 1
        int result= power(x,n);
        System.out.println("Nth position number of fibonacci series "+ result);
    
    }
}
