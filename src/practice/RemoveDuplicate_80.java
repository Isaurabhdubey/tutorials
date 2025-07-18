package practice;

public class RemoveDuplicate_80 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int currentCount = 0;
        for (int j=1; j<nums.length; j++) {
            if(currentCount == 0) {
                currentCount ++;
            }
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
                currentCount = 0;
            } else if(nums[j]==nums[i] && currentCount < 2) {
                i++;
                nums[i] = nums[j];
                currentCount++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}
