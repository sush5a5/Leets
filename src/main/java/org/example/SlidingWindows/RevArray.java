package org.example.SlidingWindows;

public class RevArray {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0};
        int n = arr.length;
        reverseArray(arr, n);
        for(int val:arr){
            System.out.print(val);
        }
    }

    private static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
             arr[i] = arr[n-i];
            arr[n-i]=temp;
            n--;

        }
    }
}
