package leetcode.arrays;

public class RemoveElementClass {
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[currentIndex++] = nums[i];
            }
        }
        return currentIndex;
    }


    public static void main(String[] args) {
        int[] input = {3,2,2,3};
        RemoveElementClass object = new RemoveElementClass();
        int output = object.removeElement(input, 3);
        System.out.print(output);
    }

}
