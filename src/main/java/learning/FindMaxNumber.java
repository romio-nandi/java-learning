package learning;

import java.util.Arrays;

public class FindMaxNumber {
   public int maxNumber(int arr[]) {
       int max =arr[0];
       int i=1;
       for( i=1;i<arr.length;i++){
           int curr=arr[i];
           if (max<curr){
               max=curr;
           }
       }
       return max;
   }

    public static void main(String[] args) {
       FindMaxNumber obj=new FindMaxNumber();
       int[] arr = {10,12,13,14,80,56};
       int x=obj.maxNumber(arr);
        System.out.println(x);
    }
}
