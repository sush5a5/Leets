package org.example.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{5, 3, 4, 5, 9};
        int n=arr.length;
        bubbleSort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +",");
        }
    }
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}
