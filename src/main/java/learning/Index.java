package learning;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Take a marks:");
        int marks = s.nextInt();
        String grade;
        int index = (marks / 10);
        switch (index) {
            case 10:
            case 9:
            case 8:
                grade = "honours";
                break;
            case 7:
            case 6:
                grade = "First Division";
                break;
            case 5:
                grade = "second Division";
                break;
            case 4:
                grade = "Third Division";
                break;
            default:
                grade = "fail";
                break;
        }

        System.out.println(grade);
    }
}
