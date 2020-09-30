package leetcode.arrays;

import java.util.HashMap;

public class TwoSumClass {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        TwoSumClass object = new TwoSumClass();
        int[] output = object.twoSum(input, 18);
            System.out.print(output[1]);
            System.out.print( " " + output[0]);
        }
}

