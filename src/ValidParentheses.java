import java.util.*;
public class ValidParentheses {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        System.out.println(isValid(s));
        input.close();
    }

    public static boolean isValid(String s) {
        int length = s.length();

        if (length == 0) return true;
        else if (length % 2 != 0) return false;
        else if (s.charAt(length - 1) == '(' || s.charAt(length - 1) == '[' || s.charAt(length - 1) == '{'
                || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
            return false;
        }
        else{

            int close = 0;
            int open = 0;
            int index = 0;

            while(index < length){
                if(s.charAt(index) == '(' || s.charAt(index) == '[' || s.charAt(index) == '{'){
                    open++;
                }
                else{
                    close++;
                }
                index++;
            }

            if (open != close){
                return false;
            }

            Stack<Character> stack = new Stack<>();
            index = 0;
            do {
                if(s.charAt(index) == '(' || s.charAt(index) == '[' || s.charAt(index) == '{'){
                    stack.push(s.charAt(index));
                    index++;
                }
                else {
                    if(s.charAt(index) == ')' && !stack.isEmpty()){
                        if (stack.pop() != '('){
                            return false;
                        }
                        else index++;
                    }
                    else if(s.charAt(index) == ']' && !stack.isEmpty()){
                        if (stack.pop() != '['){
                            return false;
                        }
                        else index++;
                    }
                    else if(s.charAt(index) == '}' && !stack.isEmpty()){
                        if (stack.pop() != '{'){
                            return false;
                        }
                        else index++;
                    }
                }
            }
            while(!stack.isEmpty() || index < length );
            return stack.isEmpty();
        }
    }
}