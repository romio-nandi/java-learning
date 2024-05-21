package learning;

import java.util.Arrays;


public class ExtractDuplicate {

    public int[] removeingElement(int[]arr){
        int count=0;int k=0;
        int[] res= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    res[k]=arr[j];
                    count=count+1;
                    k++;
                }
            }
        }
        int[] res1=new int[count];
        for(int h=0;h<count;h++){
            res1[h]=res[h];
        }

        return res1;
    }

}
