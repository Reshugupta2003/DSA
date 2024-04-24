package DSA.Recursion;

import java.util.Scanner;

public class Factorial {
    public static int FactorialNum(int n){
        int result =0;
        if(n==0 || n ==1){
            return 1;
        }
        else{
            result = n*FactorialNum(n-1);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program to find factorial");
        System.out.println("Enter the number");
        int x = sc.nextInt();  
        int y = FactorialNum(x);
        System.out.println("Factorial of X is: "+y);
    }
}