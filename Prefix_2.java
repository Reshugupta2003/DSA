package DSA.Array_2D;
import java.util.Scanner;
import java.util.*;
                               // Prefix Sum using Optimize approch
public class Prefix_2{
// Time complexity = O(m*n)
  public static void prefixSum(int arr[][]){
    int m = arr.length;
    int n = arr[0].length;
    // Traverse row - wise to write prefixSum
    for(int i=0; i<m; i++){
        for(int j=1; j<n; j++){
         arr[i][j] += arr[i][j-1];
        }
    } 
// traverse column-wise to write prefix Sum
    for(int j=0; j<n; j++){
        for(int i=1; i<m; i++){
            arr[i][j] += arr[i-1][j];
        }
    }
  }
    public static int findSumMatrix(int arr[][], int r1, int c1, int r2, int c2){
    
        int sum =0; int up =0; int left =0; int repeat =0; int result =0;
      
    for(int i= 1; i<=arr.length; i++){
        for(int j= 1; j<= arr[0].length ; j++){
            sum = arr[r2][c2];
            if(r1 == 0 && c1==0){
               return sum;
            } 
            
       
      up =  arr[r1-1][c2];
      left = arr[r2][c1-1];
      repeat = arr[r1-1][c1-1];
        }
    }
    return result = sum -up -left + repeat;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix");
        int m = sc.nextInt();
    
        System.out.println("Enter the column of matrix");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter Matrix element");
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
            int r1, c1, r2, c2;
        System.out.println("Enter the value of r1");
         r1 = sc.nextInt();

        System.out.println("Enter the value of c1");
         c1 = sc.nextInt(); 

         System.out.println("Enter the value of r2");
         r2 = sc.nextInt();
         
         System.out.println("Enter the value of c2");
         c2 = sc.nextInt();
         prefixSum(arr);
         
         int result = findSumMatrix(arr, r1, c1, r2, c2);
         System.out.println("Prefix sum of Matrix: "+result);
    }
}