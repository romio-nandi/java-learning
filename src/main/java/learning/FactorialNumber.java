package learning;

public class FactorialNumber {

    public int returnFact(int i) {

        int multi = 1;
        while (i <= 10) {
            multi = multi * i;
            i++;
        }
        return multi;
    }


}
