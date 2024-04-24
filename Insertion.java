package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion{
    public static void InsertionSort(int arr[]){
        int n = arr.length;

        for(int i= 1; i< n; i++){        
            // Sorting from starting to end
           int j= i; 
           while(j >0 && arr[j]<arr[j-1]){          
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;           
            j--;
          }     
        }
    }
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
       
        //Function calling
        InsertionSort(arr);
        System.out.print("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
      }
}