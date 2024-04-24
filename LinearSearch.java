package DSA.Searching;
import java.util.Scanner;

import polymorism.introPoly;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element");
        int x = sc.nextInt();

        int idx = -1;
        for(int i = 0; i<n; i++){
            if(arr[i]==x){
                idx = x;
                System.out.println("This is the position of input element "+arr[i]);
            }
        }
         System.out.println("Search element is not giving in array");                 
    }
}
