package DSA.1D_Array;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size = sc.nextInt();

      int arr[] = new int[size];
     for(int i =0; i<size; i++){
        System.out.println("Enter the element: "+(i+1));
        arr[i] = sc.nextInt();
     }
     int array []= new int[10];
     int a =0;
        for(int i=0; i<size; i++){
            for(int j=1; j<size-i; j++){
                   if(arr[i]==arr[i+j]){
                    int x = arr[i];
                    array[a] = x;
                    a++;
                   // System.out.println("It contain duplicate number Which is  :" +x);
                   }
            }
        }
     System.out.print("It contain duplicate number Which is ");
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                System.out.print(array[i]+", ");
            }
         
        }
        sc.close();
    }
}
