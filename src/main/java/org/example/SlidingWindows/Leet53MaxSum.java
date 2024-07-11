package org.example.SlidingWindows;

//Maximum Subarray
public class Leet53MaxSum {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);

        }
        return maxSum;
    }

}
