package DSA.Searching;
import java.util.Arrays;
import java.util.Scanner;
import polymorism.introPoly;

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
          int low = 0;
          int high = arr.length-1;

         while(low <= high){
            int mid = low + (high-low)/2;    // we are using this rather than ( high + low)/2 both 
          if( arr[mid] == target)            // are give same result
          {            
            return mid;
          }
          else if (arr[mid] < target){ 
            low = mid + 1;
          }
          else{
            high = mid -1;
          }        
    }
        return -1;
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
        System.out.println("Enter the target element");
        int x = sc.nextInt();

        int result =  binarySearch(arr,x);
        
         if( result != -1)
         {
            System.out.println("This is the position of Searching element in array "+ result);
         }
         else{
            System.out.println("Search element is not giving in array");  
         }       
            
        
                       
    }
}
