package org.example.Interviews;

public class LongestPrefix {
    public static void main(String[] args) {
        System.out.print(longestCommonPrefix(new String[]{"flow","flower","floor"}));
    }

    public static String longestCommonPrefix(String[] arr)
    {
        int n = arr.length;
        String result = arr[0];
        for(int i = 1; i < n; i++){
            while(arr[i].indexOf(result) != 0){
                result = result.substring(0, result.length()-1);
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
}
