package DSA.Array;

public class Reversal{
    public static void main(String[] args) {
        
        int arr[] = {1,4,23,54,33,85};
        int n = arr.length;
        for(int i=0; i<n/2; i++)
        { 
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Reversal array is here");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
    }
}