import java.util.Scanner;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] arg){
        int [] nums = {3, 2, 4};
        int target = 6;

        int [] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] res = {};
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int [] {i, j};
                }
            }
        }
        return new int [] {};
    }
}