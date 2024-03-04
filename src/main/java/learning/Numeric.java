package learning;

import java.util.Scanner;

class Numeric {
    int a;
    int b;

    int sum() {
        int s = a + b;


        return s;
    }

    public static void main(String arg[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Type a number 1:");
        int x = myObj.nextInt();

        System.out.println("Type a number 2:");
        int y = myObj.nextInt();

        Numeric number = new Numeric();
        number.a = x;//assingn the value
        number.b = y;
        int result = number.sum();

        System.out.println("Sum is: " + result);


    }


}