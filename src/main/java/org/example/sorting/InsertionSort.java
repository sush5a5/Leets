package org.example.sorting;

public class InsertionSort {
    public static void main(String[] args) {
    int[] arr;
    arr= new int[]{5, 3, 4, 5, 9,90,6,980};
    int n=arr.length;
    insertionSort(arr,n);
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] +",");
    }
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = temp;
        }
    }
}
