package learning;

public class ForLoop {
    public static void main(String[] args) {
        int p, q;
        System.out.print("the right angle triangle:");
        for (p = 1; p <= 9; p++) {
            for (q = 1; q <= p; q++) {
                System.out.print("@");

            }
            System.out.println("  ");
        }
    }

}
