package learning;

import java.util.Arrays;

public class MoveTheAll_0 {
    public int[] sortingTheNumber(int[] number) {
      //  int []res=new int [number.length];
        int i=0;int j=number.length-1;
        while(i<j) {
            if (number[i] > 0 && number[j] <= 0) {
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
            if (i <= 0) {
                i++;
            }
            if (j >  0) {
                j--;
            }
        }
       // for (int k=0;k<number.length;k++){
         //   res[k]=number[k];

    return number;
    }

    public static void main(String[] args) {
        MoveTheAll_0 obj=new MoveTheAll_0();
        int[] number={0,2,0,0,5,0,4,0,6};
        int[] x=obj.sortingTheNumber(number);
        System.out.println(Arrays.toString(x));
    }
}
