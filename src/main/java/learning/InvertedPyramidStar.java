package learning;

import java.util.ArrayList;
import java.util.List;

public class InvertedPyramidStar {
    public static void main(String[] args) {
        List<String> result = pattern();
        for(String s : result){
            System.out.println(s);
        }
    }

    private static List<String> pattern() {
        List<String> result = new ArrayList<>();

        for(int i= 4;i>=1;i--){
            String s = "";
            for(int j=0;j>=i;j--) {
                s = s+ " ";
            }
            for(int k=0;k<i-k;k++){
                s = s + "*";
            }
            s = s+ " ";
            result.add(s);
        }
        return result;
    }
}