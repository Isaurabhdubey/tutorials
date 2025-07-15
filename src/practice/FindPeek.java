package practice;

public class FindPeek {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,4,5,6,7, 12,9};
        int left = 0;
        int right = array.length-1;
        while (left<=right) {
            int mid = left + (right-left) /2;
            if((mid == 0 || array[mid] > array[mid-1]) &&
                    (mid == array.length-1 || array[mid] > array[mid+1])) {
                System.out.println(array[mid]);
                break;
            } else if(mid > 0 && array[mid - 1] > array[mid]) {
                right = mid - 1;
            } else {
                left = mid +1;
            }
        }
    }
}
