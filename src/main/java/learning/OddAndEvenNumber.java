package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAndEvenNumber {
    int sum = 0;
    int odd = 0;

    public List<Integer> getOddNumber(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + 1;
            }
            else {
                odd = odd + 1;
            }
        }
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(sum);
        arrlist.add(odd);
        return arrlist ;
    }

    public static void main(String[] args) {
        OddAndEvenNumber obj=new OddAndEvenNumber();
        int []a={10,20,30,60,15};
        List<Integer> result =obj.getOddNumber(a);
        System.out.println(result);

    }
}
