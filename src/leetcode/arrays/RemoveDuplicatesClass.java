package leetcode.arrays;

public class RemoveDuplicatesClass {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[currentIndex++] = nums[i+1];
            }
        }
        return currentIndex;
    }


    public static void main(String[] args) {
        int[] input = {0,0,1,1,1,2,2,3,3,3,4};
        RemoveDuplicatesClass object = new RemoveDuplicatesClass();
        int output = object.removeDuplicates(input);
        System.out.print(output);
    }
}
