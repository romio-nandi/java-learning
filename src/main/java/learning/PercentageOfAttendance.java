package learning;

import java.util.Scanner;

public class PercentageOfAttendance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("No Of Class Held:");
        int noOfClassHeld = s.nextInt();
        System.out.print("No Of Class Attend:");
        int noOfAttend = s.nextInt();
        System.out.print("Any medical cause:");
        boolean medicalCause = s.nextBoolean();
        double percentage = ((double) noOfAttend / noOfClassHeld) * 100;
        System.out.println("Percentage of class attend:" + percentage + "%");

        if (!medicalCause) {
            if (percentage > 75) {
                System.out.print("Student can sit for exam:");
            } else {
                System.out.print("Batter luck next time");
            }
        } else {
            System.out.print("Student can sit for exam:");
        }
    }
}





