package DSA.Searching;
import java.util.Scanner;
public class Squre {
    public static int SqureRoot(int arr[], int target){
        int low =0;
        int high = arr.length -1;
        int squre =0;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            squre = arr[mid] * arr[mid];
            if(target == squre){
                return arr[mid];
            }
          else  if(target < squre){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int x = sc.nextInt();

        int arr[] = new int[x+1];
        for(int i = 0; i<=x; i++){
            arr[i]= i;
        }
      int result = SqureRoot(arr, x);
      System.out.println("The squreRoot of "+ x +" is = "+ result);
      System.out.println(result);
     
    }
}
