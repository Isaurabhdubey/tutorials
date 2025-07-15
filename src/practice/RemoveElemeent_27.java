package practice;

public class RemoveElemeent_27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    private static int removeElement(int[] nums, int val) {
        int i=0;
        for (int num: nums) {
            if(num != val) {
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}
