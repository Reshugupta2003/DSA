package DSA.Recursion;
import java.util.Scanner;

public class Power2 {
    
    public static int power(int p , int q){
        int result=0; int mid =0; int finalresult =0 ; 
    
        if(q == 1){
            return p;
        }
        else
        {
          result = power(p, q/2);
          finalresult = result*result;
          if( q%2 == 0){
             return finalresult;
          }
          else{
            return p*finalresult;
          }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
         
        System.out.println("Enter the Power");
        int n = sc.nextInt();
        //                                                     Approch:- 1
        int result= power(x,n);
        System.out.println("The result of a number  "+ x +" With the power of "+ n +" is = "+ result);
    
    }
}
