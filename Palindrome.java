package DSA.Array;

public class Palindrome{
    public static void main(String[] args) {
         
        int [] array = {1,3,5,3,1};
         int flag =0;
         int n = array.length;
    
        for(int i=0; i<n/2; i++){
            if(array[i] != array[n-1-i]){
             System.out.println("This array is not a palidrone");
             flag=1;
             break;
            }
        }
          if(flag==0){
            System.out.println("This is palidrone");
           }     
    }
}