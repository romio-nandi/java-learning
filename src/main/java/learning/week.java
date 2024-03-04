package learning;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Take a day :");
        int takeADay = s.nextInt();

        switch (takeADay%7) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tues");
                break;
            case 3:
                System.out.print("Wed");
                break;
            case 4:
                System.out.print("Thu");
                break;
            case 5:
                System.out.print("Fri");
                break;
            case 6:
                System.out.print("Sat");
                break;
            default:
                System.out.print("Not Valid");
                break;
        }
    }
}
