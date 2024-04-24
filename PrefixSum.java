package DSA.Array_2D;
import java.util.Scanner;
                               // Prefix Sum using brute force approch
public class PrefixSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i and j where arr[i][j] ");
        int i1 =sc.nextInt();
        int j1 =sc.nextInt();
        System.out.println(" Again enter the value of i and j where arr[i][j] ");
        int i2 =sc.nextInt();
        int j2 =sc.nextInt();
        int arr[][] = {{1,1,1,1}, {1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int x1 = Math.min(i1,i2);
        int x2 = Math.max(i1,i2);
        int y2 = Math.max(j1,j2);
        int y1 = Math.min(j1, j2);
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){             
                if( i<=x2 && i>=x1 && j>=y1 && j<=y2){              
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("----------------------------------------------------------");
        System.out.println(sum);
    }
}