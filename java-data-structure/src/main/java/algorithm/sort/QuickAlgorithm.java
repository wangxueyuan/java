package algorithm.sort;

import java.util.Arrays;

public class QuickAlgorithm {
    public static void quickSort(int[] arr,int left,int right) {
        if (left >= right) {
            return;
        }
        int l=left;
        int r=right;
        int pivot = arr[l];
        while (l < r) {
            while(l < r && arr[r] >= pivot) {
                r--;
            }
            if (l < r) {
                arr[l] = arr[r];
            }
            while(l < r && arr[l] <= pivot) {
                l++;
            }
            if (l < r) {
                arr[r] = arr[l];
            }
        }
        arr[l]=pivot;
        quickSort(arr, left, l - 1);
        quickSort(arr,l+1,right);

    }

    public static void main(String[] args) {
        int[] arr = {13, 22, 1, 343, 12, 8, 9,324,22,13};
        QuickAlgorithm.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
