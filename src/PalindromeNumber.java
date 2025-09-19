public class PalindromeNumber {
    public static void main(String[] arg){
        int x = 22222;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x){
        String str = String.valueOf(x);
        int i = str.length() - 1; // The last index
        int j = 0;

        if (x < 0) return false; // Negative numbers are not palindrome

        while(i > j){
            if (str.charAt(j) != str.charAt(i)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
