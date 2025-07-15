package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 10, 12, 13, 17, 19, 22};
        int target = 19;
        System.out.println(indexOf(arr, target));
        System.out.println(searchByRecursion(arr, target, 0, arr.length-1));
    }
    private static int indexOf(int[] arr, int target) {
        if(arr.length==0) {
            return -1;
        }
        int startIndex = 0,
                endIndex = arr.length-1;
        while(startIndex<=endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if(arr[startIndex]== target) {
                return startIndex;
            } else if (arr[endIndex] == target) {
                return endIndex;
            } else if(arr[mid]==target) {
                return mid;
            } else if(arr[mid] > target) {
                endIndex = mid -1;
            } else {
                startIndex = mid+1;
            }
        }
        return -1;
    }

    private static int searchByRecursion(int[] arr, int target,int startIndex,int endIndex) {
        int mid = (startIndex + endIndex) / 2;
        if (startIndex<=endIndex) {
            if (arr[startIndex] == target) {
                return startIndex;
            } else if (arr[endIndex] == target) {
                return endIndex;
            } else if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return searchByRecursion(arr, target, startIndex, mid - 1);
            } else {
                return searchByRecursion(arr, target, mid + 1, endIndex);
            }
        }
        return -1;
    }
}
