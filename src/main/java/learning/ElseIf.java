package learning;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input for Gradeing marks:");
        int grade = s.nextInt();
        int i = 1;
        while (i <= 6) {
            if ((grade > 80)&&(grade<100)) {
                System.out.println("A");
            } else if ((grade > 59) && (grade < 81)) {
                System.out.println("B");
            } else if ((grade > 49) && (grade < 61)) {
                System.out.println("C");
            } else if ((grade > 44) && (grade < 51)) {
                System.out.println("D");
            } else if ((grade > 24) && (grade < 46)) {
                System.out.println("E");
            } else if (grade < 25) {
                System.out.println("F");
            } else {
                System.out.println("not correct mark:");
            }

            if(i < 6) {
                System.out.println("Take next grade:" + i);
                grade = s.nextInt();
            }
            i++;

        }

    }

}