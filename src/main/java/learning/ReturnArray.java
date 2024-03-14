package learning;

import java.util.Arrays;

public class ReturnArray {
    public int[] arryReturn(int []a){
        int i=0; int j=a.length-1;
       for(;i<j;){
           int temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           i++;
           j--;
        }
       return a;
    }

}
