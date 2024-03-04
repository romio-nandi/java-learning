package learning;

import java.util.Scanner;

public class Comperision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Take a Number A:");
        int a = s.nextInt();
        System.out.print("Take a number B:");
        int b = s.nextInt();
        int i=0;
        while (i < 5) {
            if (a > b) {
                System.out.println("Print A is greater");

            } else {
                System.out.println("Print B is greater ");
            }
            i++;
            System.out.print("Take a Number A:");
             a = s.nextInt();
            System.out.print("Take a number B:");
             b = s.nextInt();

        }

    }
}
