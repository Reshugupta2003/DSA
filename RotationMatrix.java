package DSA.Array_2D;
import java.util.Arrays;

public class RotationMatrix{
    public static void rotateMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0; i<m; i++){
         for(int j =i; j<n; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
         }   
        int li =0;
        int ri= n-1;
       while(li< ri){
        int x =arr[i][li];
        arr[i][li] =arr[i][ri];
        arr[i][ri] = x;

        li++;
        ri--;
       }
     }
    }
    public static void main(String[] args) {
    int arr[][] ={ {1,2,3},
                   {4,5,6},
                   {7,8,9} };
    rotateMatrix(arr);
    for(var mat:arr){
        System.out.println(Arrays.toString(mat));
      }
    }
}