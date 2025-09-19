import java.util.Locale;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in roman form: ");
        String romNum = input.nextLine();
        System.out.println(romanToInteger(romNum.toUpperCase()));
        input.close();
    }

    public static int romanToInteger(String s){
        int res = 0;
        int l = s.length();

        if (l == 1){
            switch (s){
                case "I" : res = res + 1;
                break;
                case "V" : res = res + 5;
                break;
                case "X" : res = res + 10;
                break;
                case "L" : res = res + 50;
                break;
                case "C" : res = res + 100;
                break;
                case "D" : res = res + 500;
                break;
                case "M" : res = res + 1000;
                break;
                default: System.out.println("Invalid number");
            }
            return res;
        }

        for (int i = 0; i < l; i++){
            char character = s.charAt(i);

            if (i < l- 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                res = res + 4;
                i++;
            }
            else if (i < l- 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                res = res + 9;
                i++;
            }
            else if (i < l- 1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                res = res + 40;
                i++;
            }
            else if (i < l- 1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                res = res + 90;
                i++;
            }
            else if (i < l- 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                res = res + 400;
                i++;
            }
            else if (i < l- 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                res = res + 900;
                i++;
            }
            else {
                if (character == 'I') res = res + 1;
                else if (character == 'V') res = res + 5;
                else if (character == 'X') res = res + 10;
                else if (character == 'L') res = res + 50;
                else if (character == 'C') res = res + 100;
                else if (character == 'D') res = res + 500;
                else if (character == 'M') res = res + 1000;
            }

        }
        return res;
    }
}
