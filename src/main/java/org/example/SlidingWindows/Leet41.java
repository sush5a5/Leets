package org.example.SlidingWindows;

import java.util.Arrays;

public class Leet41 {
    public static void main(String[] args) {
        System.out.print("miss"+findMiss(new int[]{15,56,2,3,8,6}));
    }

    private static int findMiss(int[] values) {
        sortValues(values);
        Arrays.stream(values).forEach(i -> System.out.print(i + ", "));
        int ans = 1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == ans) {
                ans++;
            }
        }
        return ans;
    }

    private static void sortValues(int[] values) {
        int n=values.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-i-1; j++) {
                if (values[j] > values[j+1]) {
                    int temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                }

            }
        }
    }
}
