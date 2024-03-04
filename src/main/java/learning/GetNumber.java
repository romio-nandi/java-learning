package learning;

import java.util.Scanner;

class GetNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number");
        int x = s.nextInt();
        while (x <= 100) {
            if (x % 2 != 0) {
                System.out.println("Print the odd number" + x);
            }

            if (x % 2 == 0) {
                System.out.println("print the even number" + x);
            }

            System.out.print("Enter another Number");
            x = s.nextInt();
        }

    }
}
 	 