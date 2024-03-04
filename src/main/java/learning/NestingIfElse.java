package learning;

import java.util.Scanner;

public class NestingIfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Value of a:");
        int a = s.nextInt();
        System.out.print("Value of b:");
        int b = s.nextInt();
        System.out.print("Value of c:");
        int c = s.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.print("a is greater");
            } else {
                System.out.print("c is greater");
            }
        } else {
            if (b>c){
                System.out.print("b is greater ");
        }
            else{
                System.out.print("c is greater");
            }
    }

}


}
