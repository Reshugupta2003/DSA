import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    
     //input Array size
     System.out.println("Enter the size of array");
     int n = sc.nextInt();
     
     int arr[] = new int[n];

     //input Array 
     System.out.println("Enter the array element");
     for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
     }

     // input target value
     System.out.println("Enter the target value");
     int target = sc.nextInt();
    
     sc.close();
     
     //Create a hashMap where value is i and key is arr[i]
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i<n; i++){
        map.put(arr[i], i);
     }
     
     // Define result array
     int result[] = {-1, -1};

     for(int i=0; i<n; i++){

        // if array contain 0 and target element
        if(arr[i] == target && map.containsKey(0)){
            result[0] = i;
            result[1] = map.get(0);
            break;
        }

        if(map.containsKey(target - arr[i])){
             
         // non- repeatable element
         if(map.get(target - arr[i]) > i){
            
            result[0] = i;
            result[1] = map.get(target - arr[i]);
         }
          else{
            System.out.println("Index is repeatable");
            return;
          }
       }
     }
     System.out.println("Index = "+"["+ result[0] + ","+ result[1]+ "]");     
   }
}