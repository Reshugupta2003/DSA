import java.util.*;

public class Non_repeatable_String {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //input of String
        System.out.println("Enter the String");
        String str = sc.next();
 
        //Define a array
        char arr[] = new char[str.length()];

        // Create Array for these String
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
       
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i <str.length(); i++){

            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
    
        int result = -1;

        for(int i =0; i< str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println("First non-repeating element = "+ str.charAt(i));
                result = 1;
                break;
            }
        }
        if(result == -1){
            System.out.println("There is no repeating element in string");
        }

        sc.close();
    }
}
