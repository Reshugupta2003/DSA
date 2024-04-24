package DSA.Array_2D;

import java.util.Arrays;
import java.util.Scanner;
                             // The Program to give the transpose of 2-D Matrix
public class Transpose {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
       
        System.out.println(Arrays.deepToString(arr));
        for(int i=0; i<3; i++){
            for(int j=i; j<3; j++){
              int temp= arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
            System.out.print("{");
            for(int j=0; j<3; j++){
                System.out.print(arr[0][j]+",");
            }
            System.out.println("}");
            System.out.println();
            System.out.print("{");
            for(int j=0; j<3; j++){
                System.out.print(arr[1][j]+",");
            }
            System.out.println("}");
            System.out.println();
            System.out.print("{");
            for(int j=0; j<3; j++){
                System.out.print(arr[2][j]+",");
            }
            System.out.print("}");
            System.out.println();
    }
}
