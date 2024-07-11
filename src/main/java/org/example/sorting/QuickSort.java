package org.example.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{5, 3, 4, 5, 9,90,6,980};
        int n=arr.length;
        QuickSorting(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +",");
        }
        }

    private static void QuickSorting(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }
}
