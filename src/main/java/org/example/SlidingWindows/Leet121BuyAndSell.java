package org.example.SlidingWindows;

public class Leet121BuyAndSell {
    public static void main(String[] args) {

        int[] arr= new int[]{7,1,5,3,6,4};
        int n=arr.length;
        System.out.println(BuyAndSell(arr,n));
    }

    private static int BuyAndSell(int[] arr, int n) {
        int buy=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if(buy>arr[i]){
            buy=arr[i];
            } else if (arr[i]-buy>profit) {
                profit=arr[i]-buy;
                
            }


        }
        return profit;
    }
}
