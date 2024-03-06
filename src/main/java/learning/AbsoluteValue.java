package learning;

public class AbsoluteValue {
    public int result(int input) {
        int k;
        if (input < 0) {
            k = (-1 * input);

        } else {
            k = input;

        }
        return k;
    }

    public static void main(String[] args) {
        AbsoluteValue obj = new AbsoluteValue();
        int z = obj.result(-8);
        System.out.println(z);
    }


}
