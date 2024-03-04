package learning;

import java.util.Scanner;

class Loop {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        while (x > 0) {
            x = x - 2;

            System.out.println("print declear" + x);

        }

    }

}