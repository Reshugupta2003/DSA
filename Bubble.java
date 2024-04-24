package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble{
    public static void BubbleSort(int arr[]){
        int n = arr.length;
      
        for(int i= 0; i< n; i++){
            boolean swapped = false;
            // because in every iteration biggest element shifted to end of array
           for(int j= 0; j<n - i - 1; j++){          
            if (arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

                swapped = true;
            }
           }
           if(!swapped){
              break;
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
        BubbleSort(arr);
        System.out.print("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
      }
}