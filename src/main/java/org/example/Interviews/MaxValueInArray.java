package org.example.Interviews;

import java.util.Arrays;


public class MaxValueInArray {
    public static void main(String[] args) {
        int[] values= {5,3,7,9,100,80};
        int valueBy8 =Arrays.stream(values).max().getAsInt();
        System.out.println("Java 8----------> "+valueBy8);
        int maxValueOfArray=maxValueOfArray(values);
        System.out.println("Java ----------> "+maxValueOfArray);
    }

    private static int maxValueOfArray(int[] values) {
        int n=values.length;
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(values[i]>maxValue){
                maxValue=values[i];
            }
        }
        return maxValue;
    }

}
