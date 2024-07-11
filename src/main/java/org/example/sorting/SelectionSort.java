package org.example.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{5, 3, 4, 5, 9,90,6,980};
        int n=arr.length;
        selectionSort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +",");
        }
    }

    // We sort by using two partitions using sort and unsorted
    //sort starts with arr[-1] i.e. where no elements are available

    private static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
