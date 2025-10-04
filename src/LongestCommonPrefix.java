import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String [] array = {"flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs){
        List<Character> prefixList = new ArrayList<>();
        int length = strs.length;
        int shortestString = 0;
        String result = "";

        //Basic checking
        if(length == 1){
            return strs[0];
        }
        else if(length == 0){
            return "";
        }

        //Finding the shortest string in the array
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        shortestString = strs[0].length();
        System.out.println(shortestString);

        //Getting the prefix
        for(int i = 0; i < shortestString; i++){
            for(int j = 0; j < length; j++){
                if (j < length -1 && strs[j].charAt(i) != strs[j+1].charAt(i)){ // The problem is here
                    return result;
                }
            }
            prefixList.add(strs[0].charAt(i));
            result = prefixList.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }

        return result;
    }
} 