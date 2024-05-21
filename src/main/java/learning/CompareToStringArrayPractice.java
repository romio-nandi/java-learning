package learning;

import java.util.ArrayList;
import java.util.List;

public class CompareToStringArrayPractice {
    public List<String > test(String [] a, String[] b) {
        List<String> common = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equalsIgnoreCase(b[j])) {
                    common.add(a[i]);
                }
            }
        }
        return common;
    }


    }

