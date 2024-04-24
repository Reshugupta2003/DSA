package DSA.Array;

import java.util.Scanner;

import API.foreach;

public class MissingEle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array"); 
        int size = sc.nextInt();
         
        int array []= new int[size];
        System.out.println("Enter the element of array");
        for(int i =0; i<size; i++){
            System.out.println("Element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
      int n = array.length;
      int sum_natural_num = (n+1)*(n+2)/2;
    
      int sum =0;
      for(int i =0; i<n; i++){
        sum += array[i];
      }
      int Missing_num = sum_natural_num - sum; 
      System.out.println("Missing number is:- "+Missing_num);
    }
}