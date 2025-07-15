package practice;

public class MedianofTwoSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int[] tempArr = new int[nums1.length + nums2.length];
        int count =0;
        int left=0, right = 0;
        while (left<nums1.length && right < nums2.length) {
            if(nums1[left] < nums2[right]) {
                tempArr[count++] = nums1[left++];
            } else if (nums1[left] > nums2[right]) {
                tempArr[count++] = nums2[right++];
            } else {
                tempArr[count++] = nums2[right++];
                tempArr[count++] = nums1[left++];
            }
        }
        while(left<nums1.length) {
            tempArr[count++] = nums1[left++];
        }
        while(right<nums2.length) {
            tempArr[count++] = nums2[right++];
        }
        for (int i: tempArr) {
        }
        int index = tempArr.length / 2;
        double sum = tempArr[index];
        if(tempArr.length % 2 == 0) {
            sum = (sum + tempArr[index-1])/2;
        }
        System.out.println(sum);
    }
}
