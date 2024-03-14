package learning;

import java.util.Arrays;

import static java.util.Collections.swap;
import static learning.ArraySum.a;

public class SortAllTheNagativeNumberOneSide {
    int temp=0;
    public int[] sortNagative(int arr[]) {
        int i=0; int j=arr.length-1;
        while(i<j){
                if(arr[i]>0 && arr[j]<0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;

                    if (arr[i] < 0) {
                        i++;

                    }
                    if (arr[j] > 0) {
                        j--;


                    }
                }
            }

        return arr;
    }
    }


