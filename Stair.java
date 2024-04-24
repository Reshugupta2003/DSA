package DSA.Recursion;
import java.util.Scanner;

public class Stair{
    public static int CountStair(int x){
        int result = 0;
        if(x == 0 || x == 1){
            return 1;
        }
        else{
            result = CountStair(x-1) + CountStair(x-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Stair");
        int n = sc.nextInt();
        int result = CountStair(n);
           try {     
                if (n==0) {
                throw new Exception();
            }
            System.out.println("Number of ways to reach on "+ n +" Stair = "+ result);
           } catch (Exception e) {
            System.out.println("0 Stair is Invaild input");
           }
   }
}