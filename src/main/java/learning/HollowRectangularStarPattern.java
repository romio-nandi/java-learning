package learning;

public class HollowRectangularStarPattern {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i == 0 || i == 3) {
                for (int j = 0; j <= 5; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k <= 5; k = k + 1) {
                    if (k == 0 || k == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }

    }
}
