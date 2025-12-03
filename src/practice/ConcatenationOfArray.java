package practice;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = getConcatenation(new int[]{1,2,1});
        for (int i=0; i<nums.length-1; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        System.out.println(nums.length);
        if (nums.length==0){
            return nums;
        }
        int[] numbers = new int[nums.length *2+1];
        for(int i=0; i<nums.length; i++) {
            numbers[i] = nums[i];
            numbers[i+nums.length] = nums[i];
        }
        return numbers;
    }
}
