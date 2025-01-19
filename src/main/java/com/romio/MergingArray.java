package com.romio;

import java.util.Arrays;

public class MergingArray {
    int j = 0;

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            if (nums1[i] != 0) {
                array[i] = nums1[i];
            } else {
                array[i] = nums2[j];
                j++;
            }
        }
        for(int k=0;k<=array.length;k++){
            for (int l=k+1;l<array.length;l++){
                if(array[k]>array[l]){
                    int t= array[k];
                    array[k]=array[l];
                    array[l]=t;
                }
            }
        }
        return array;

    }

    public static void main(String[] args) {
        MergingArray solution = new MergingArray();
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int[] nums2 = {2, 5, 6};
            int[] result= solution.merge(nums1,6,nums2,3);
          System.out.println(Arrays.toString(result));
        }


}