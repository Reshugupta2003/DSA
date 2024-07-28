import java.util.*;
class HashMapFun{
    public static void main(String[] args) {
        
        HashMap<Integer,String> hashMap = new HashMap<>();
        // functionality of put function
        hashMap.put(1, "Reshu");
        hashMap.put(2, "Saurabh");
        hashMap.put(3, "Ankit");
        hashMap.put(4, "Akash");
        hashMap.put(5, "Saytam");    
        
        System.out.println("Hash Map is:- "+ hashMap);

        // functionality of get function
        String result = hashMap.get(3);
        System.out.println("Value of a given key:- "+ result);

        //fuctionality of containKey function
        Boolean x = hashMap.containsKey(4);
        System.out.println("TRue or False:- "+ x);

        //functionality of removefunction
        hashMap.remove(5);
        System.out.println("Updated HashMap "+ hashMap);

        // functionality of entrySet
        System.out.println("HashMap is:- ");
        for(Map.Entry<Integer,String> e: hashMap.entrySet()){
            System.out.println(e.getKey()+ " "+ e.getValue());
        }

        // Print hashmap using referance variable
        System.out.println("Key-value pair of HashMap : " + hashMap);
    }
}