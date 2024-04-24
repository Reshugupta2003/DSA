package DSA.BackTracing;
import java.util.*;

public class Example {
    public static void Print(int[] arr , int index, ArrayList<Integer> tempArr){

        if (index == arr.length) {
            
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }
        Print(arr, index+1, tempArr);

        tempArr.add(arr[index]);

        Print(arr, index + 1, tempArr);

        tempArr.remove(tempArr.size() -1);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2};
        System.out.println("For a array - " + Arrays.toString(arr));
        Print(arr, 0, new ArrayList<>());
    }
}
