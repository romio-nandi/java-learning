package learning;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Take input:");
        int input = s.nextInt();

        if (input < 0) {
            System.out.print("input:" + input+"output:" + (-1 * input));

        }
        else{
            System.out.println("output:"+input);
        }
    }
}
