package com.romio;

public class FrequenceofElement {
    int sum=0;
    public int getFrequence(int []arr,int k){
        for (int i=0;i<arr.length;i++){
            if (k==arr[i]){
                sum=sum+1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        FrequenceofElement obj=new FrequenceofElement();
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int j=obj.getFrequence(arr,1 );
        System.out.println(j);

    }
}
