package learning;

public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++) {
            if (i == 0) {
                for (int j = 0; j <= 6; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int k = 1; k <= i; k++) {
                    System.out.print(" ");
                }


                    for (int l = 0; l<2*(3-i)+1;l++) {
                        System.out.print("*");


                    }
                }
            System.out.println(" ");
        }
        }
    }

