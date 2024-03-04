package learning;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Take quantity from user:");
        int x = s.nextInt();
        if ((x*100)>1000){
            System.out.println("Given discount:"+(0.1*x*100)+"Total cost:"+((x*100)-(x*100*0.1)));

        }
        else{
            System.out.print("no discount");
        }
    }
}
