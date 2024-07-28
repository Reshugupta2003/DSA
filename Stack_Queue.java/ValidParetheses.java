import java.util.*;
public class ValidParetheses {
    
    public static boolean isValid(String str){

     char [] CharArray = str.toCharArray();

     Stack<Character> stk =  new Stack<>();

     for(char ele: CharArray){
        if(ele == '(' || ele == '[' || ele == '{'){
            stk.push(ele);
            System.out.println("hy");
            continue;
        }

       else if(stk.empty()){
            return false;
        }
       char top = stk.pop();
        if(top == '[' && ele != ']'){
          return false;

       }
       else if(top == '(' && ele != ')'){
        return false;
       }
       else if(top == '{' && ele != '}'){
        return false;
       }
     }

     return (stk.empty() == true);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //input of string
        System.out.println("Ehter the String");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Is it a valid Parentheses ? "+ isValid(str));
    }
}
