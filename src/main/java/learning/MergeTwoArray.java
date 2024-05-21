package learning;

import java.util.Arrays;

public class MergeTwoArray {
    public int [] MergeingArrays(int []a, int []b){
        int[] res= new int[a.length+b.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            res[j]=a[i];
            j++;
        }
        for(int i=0;i<b.length;i++){
            res[j]=b[i];
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        MergeTwoArray obj=new MergeTwoArray();
        int[] a={1,2,3,4};
        int[] b={4,5,6,7,8};
        int[] z=obj.MergeingArrays(a,b);
        System.out.println(Arrays.toString(z));
    }
}
