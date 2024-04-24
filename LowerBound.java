package DSA.Searching;
import java.util.Scanner;

 public class LowerBound {
    public static int firstOccurance(int arr[], int target){
        int low =0;
        int high = arr.length -1;
        int  result = -1; 
        while (low<= high) {
            // TO avoid Overflow
            int mid = low + (high - low)/2;           
            if (arr[mid] == target) {      
                high = mid - 1;
                result = mid;
                // Continue searching on the left side of the array4
            } 
        else if(arr[mid] < target){
             low = mid + 1;
        }
        else{
            high = mid -1;
        }
      }
       return result;
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

        int result = firstOccurance(arr, x);
        if (result == -1) {
            System.out.println("Target element is not present in array");
        } else {
            System.out.println("Target element first occurance index is "+ result);
        }
    }
}



