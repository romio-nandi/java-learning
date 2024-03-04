package learning;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int a = 25;
        int org = a;
        int count = a;
        int k = 0;
        double z = Math.pow(a, 2);

        while (a == count) {
            k = (int) z % 10;
            count++;
        }

        if (k == org) {
            System.out.println("it is automorphic");

        } else {
            System.out.println("it is not automorphic");
        }
    }
}
