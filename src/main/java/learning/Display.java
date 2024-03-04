package learning;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.println("Take the number" + i + ":");
            int x = s.nextInt();
            while (x > 0) {
                int y = x % 10;
                System.out.print(y);
                x = x / 10;

            }
            i++;
        }

    }

}
