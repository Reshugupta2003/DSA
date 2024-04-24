package DSA.Recursion;
import java.util.Scanner;

public class Fabonacci{

    public static int Fab(int n){
        int result = 0;
        // Base case condition 
        if(n <= 1){
            return n;
        }
        else{
            result = Fab(n-1) + Fab(n-2);
        }
        return result;
    }
    // Series   0, 1, 1, 2 ,3, 5, 8, 13,...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Fibonacci Series");
        int x = sc.nextInt();
         
        int result= Fab(x);
        System.out.println("Nth position number of fibonacci series "+ result);
    }
}