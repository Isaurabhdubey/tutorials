package practice;

import java.util.Arrays;

public class CountSubarrays {
    public static long countSubarrays(int[] nums, int k) {
        int test = Arrays.stream(nums).filter(v-> v==k).findFirst()
                .orElse(-1);
        return (long) test;
    }
    public static void main(String[] args) {
        long l1= countSubarrays(new int[]{61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82}, 2);
        System.out.println(l1);
    }
}
