package learning;

public class SunnyNumber {
    public static void main(String[] args) {
        int n = 82;

        int z = n + 1;
        double k = Math.sqrt(z);
        System.out.println(k);

        System.out.println(k%1);
        if (k %1 != 0.0) {
            System.out.println("not a sunny number");
        } else {
            System.out.println("it is a sunny number");
        }
    }
}
