package learning;

import java.util.Scanner;

public class OldestAndYoungest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Take 1st age:");
        int a = s.nextInt();
        System.out.println("Take 2nd age:");
        int b = s.nextInt();
        System.out.println("Take 3rd age:");
        int c = s.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("1st person is a Oldest person");
            } else {
                System.out.println("3rd person is a oldest person");
            }
        } else {
            if (b > c) {
                System.out.println("2nd person is a oldest person");


            }
            else{
                System.out.println("3rd person is a oldest person");
            }
        }

    }
}
