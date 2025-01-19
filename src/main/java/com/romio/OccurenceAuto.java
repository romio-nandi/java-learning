package com.romio;

public class OccurenceAuto {
    int count=0;
    public int OccurNumber(int[]num ){
        for (int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(num[i]==num[j]){
                    // System.out.println(num[j]);
                    count=count+1;
                    num[j]='a';
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        OccurenceAuto obj=new OccurenceAuto();
        int []num={1,3,2,6,3,5,3,9};
        int q=obj.OccurNumber(num);
        System.out.println(q);
    }
}
