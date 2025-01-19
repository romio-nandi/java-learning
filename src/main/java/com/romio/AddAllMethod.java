package com.romio;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {

    public List<Integer> getAllNumber(int[] a, int[]b){
        List<Integer> arry=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            arry.add(a[i]);
        }

        List<Integer> brr=new ArrayList<>();
        for (int j=0;j<a.length;j++){
            brr.add(b[j]);
        }
       arry.addAll(brr);


    return arry;

        }


    public static void main(String[] args) {
        AddAllMethod ad=new AddAllMethod();
        int[]a={2,3,4,6,7};
        int[]b={9,8,2,6,7};
       List<Integer> c= ad.getAllNumber(a,b);
       int has=c.hashCode();

        System.out.println(c);
        System.out.println(has);
    }
}
