package sorting;

public class MergeSort {
    private static void mergeSort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftArrSize = mid-left+1;
        int rightArrSize = right-mid;
        int[] leftArr = new int[leftArrSize],
                rightArr = new int[rightArrSize];
        for (int x = 0; x<leftArrSize; x++){
            leftArr[x]= arr[left+x];
        }
        for (int x=0; x< rightArrSize; x++) {
            rightArr[x] = arr[mid+1+x];
        }

        int i=0,j=0, k=left;
        while(i<leftArrSize && j<rightArrSize) {
            if(leftArr[i]<=rightArr[j]) {
              arr[k] =  leftArr[i];
              i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<leftArrSize) {
            arr[k ]= leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrSize) {
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,4,6,2};
        for (int n: arr) {
            System.out.print(n + " ");
        }
            System.out.println();
        mergeSort(arr, 0, arr.length -1);
        for (int n: arr) {
            System.out.print(n + " ");
        }
    }


}
