package DSA.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Selection{
    public static void SelectionSort(int arr[]){
        int n = arr.length;
      
        for(int i=0; i<n; i++){
           int minIndx =i;
           for(int j=i+1; j<n; j++){
            if (arr[j]< arr[minIndx]) {
                minIndx =j;
            }
           }
           if(i != minIndx){
              int temp = arr[minIndx];
              arr[minIndx] = arr[i];
              arr[i] = temp;
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
        SelectionSort(arr);
        System.out.print("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
      }
}