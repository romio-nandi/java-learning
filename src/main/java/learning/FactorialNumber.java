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

    public static void main(String[] args) {
        FactorialNumber obj = new FactorialNumber();
        int z = obj.returnFact(1);
        System.out.println(z);
    }
}
