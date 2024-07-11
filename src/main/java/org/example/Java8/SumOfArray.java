package org.example.Java8;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,10};
        int n=SumHere(arr);
        System.out.println(n);

        String[] arrStr=new String[]{"1","2","10"};
        long val=SumHereStrings(arrStr);
        System.out.println(n);
    }
    public static int SumHere(int[] arr) {
        int val=Arrays.stream(arr).sum();
        return val;
    }

    public static int SumHereStrings(String[] arr) {
        int val=Arrays.stream(arr).mapToInt(x->x.length()).sum();
        return val;
    }

}
