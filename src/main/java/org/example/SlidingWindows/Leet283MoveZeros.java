package org.example.SlidingWindows;

public class Leet283MoveZeros {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        for(int val:arr){
            System.out.print(val + " ");
        }

    }
    public static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
        for (int i = 0; i < n; i++)
            if (arr[i] != 0) {
                System.out.print(count + " ");
                arr[count++] = arr[i];
            }

        while (count < n)
            arr[count++] = 0;
    }
}
