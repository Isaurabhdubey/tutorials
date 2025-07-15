package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 10, 12, 13, 17, 19, 22};
        int target = 22;
        System.out.println(indexOf(arr, target));
    }
    private static int indexOf(int[] arr, int target) {
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
