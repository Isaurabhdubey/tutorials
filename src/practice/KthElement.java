package practice;

import java.util.HashMap;
import java.util.Map;

public class KthElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,4,1};
        int k = 2;
        // output should be 5;
//        int[] arrTemp = new int[k];
//        int templegth = 0;
//        Map<Integer, Integer> mapped = new HashMap<>();
//        for (int i=0;i<arr.length; i++) {
//            System.out.println(arr[i]);
//            if(templegth == 2 && arr[i] > arrTemp[1]) {
//                System.arraycopy(arrTemp, 1, arrTemp, 0, arrTemp.length - 1);
//                arrTemp[arrTemp.length - 1] = arr[i];
//            } else if (templegth < 2) {
//
//            }
//        }
        sortArray(arr);

    }
    public static int[] sortArray(int[] array) {
        return array;
    }
}
