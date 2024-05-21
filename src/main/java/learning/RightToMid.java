package learning;

import java.util.Arrays;

public class RightToMid {
   public  int [] findRightToMid(int[] arr){
       int size= arr.length/2;
       int j=0;
       int [] res =new int[size];
       for(int i=arr.length-1;i>=size;i--){
           res[j]=arr[i];
           j++;

       }
       return res;
   }

    public static void main(String[] args) {
       RightToMid obj= new RightToMid();
        int[] arr={5,8,4,9,4,4};
        int[] z= obj.findRightToMid(arr);
        System.out.println(Arrays.toString(z));
    }

}












