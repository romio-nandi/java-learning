package learning;

import java.util.Arrays;

public class ReverseTheArray {
   public int[] reverseArray(int[] a){
       int[] res = new int[a.length];
       int j = 0;
      for(int i=(a.length-1);i>=0;i--){
          res[j]=a[i];
          j++;
       }
     return res;
   }

    public static void main(String[] args) {
        ReverseTheArray obj=new ReverseTheArray();
        int[] a={10,15,25,54};
         //int[] z =obj.reverseArray(a);
        System.out.println(Arrays.toString(obj.reverseArray(a)));
        //Arrays.toString(int[] a)

    }
}
