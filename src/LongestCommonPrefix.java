import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String [] array = {"flower","fow","fight"};
        System.out.println("The prefix is: " + longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs){
        List<Character> prefixList = new ArrayList<>();
        int length = strs.length;
        int shortestString = 0;
        String result = "";

        //Finding the shortest string in the array
        for(int i = 0; i < length; i++){
            if(i < length - 1 && strs[i].length() > strs[i+1].length()){
                shortestString = strs[i + 1].length();
            }
        }

        for(int i = 0; i < shortestString; i++){
            for(int j = 0; j < length; j++){
                if (j < length -1 && strs[j].charAt(i) != strs[j+1].charAt(i)){ // The problem is here
                    return result;
                }
            }
            prefixList.add(strs[i].charAt(i));
            result = prefixList.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }

        return result;
    }
}