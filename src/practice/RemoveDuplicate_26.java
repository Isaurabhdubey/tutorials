package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate_26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i);
        return i + 1;
    }

    public static int removeDuplicatesLogic(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i);
        return i + 1;
    }
    public static int removeDuplicate(int[] nums){
        Map<Integer, Boolean> numberExistIntoMap = new HashMap<>();
        List<Integer> array = new ArrayList<>();
        for (int num: nums) {
            if(numberExistIntoMap.get(num) == null) {
                array.add(num);
                numberExistIntoMap.put(num, true);
            }
        }
        return array.size();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
