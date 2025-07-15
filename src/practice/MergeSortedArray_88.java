package practice;

public class MergeSortedArray_88 {
    public static void mergeSort(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int count=0;
        int i=0, j = 0;
        while(i < m && j < n) {
           if(nums1[i]<nums2[j]) {
               arr[count] = nums1[i];
               i++;
               count++;
           } else if (nums1[i] == nums2[j]) {
               arr[count++] = nums1[i];
               arr[count++] = nums1[i];
               i++;
               j++;
           } else {
               arr[count] = nums2[j];
               j++;
               count++;
           }
        }
        while(i<m) {
            arr[count] = nums1[i];
            i++;
            count++;
        }
        while(j<n) {
            arr[count] = nums2[j];
            j++;
            count++;
        }
        for (int x=0;x<nums1.length;x++) {
            nums1[x] = arr[x];
        }
        return;
    }
    public static void main(String[] args) {
        int[] nums1=new int[]{1,2,3,0,0,0},
        nums2= new int[]{2,5,6};
        int m = 3,
                n=3;
        mergeSort(nums1, m, nums2, n);
        for (int x: nums1) {
            System.out.println(x);
        }
    }
}
