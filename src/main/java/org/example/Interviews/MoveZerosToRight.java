package org.example.Interviews;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.print("------------- ");
        for(int val:arr){
            System.out.print(val + " ");
        }

    }
    public static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
        for (int i = 0; i < n; i++)
            if (arr[i] != 0) {
               arr[count++] = arr[i];
            }
        while (count < n)
            arr[count++] = 0;
    }
}
