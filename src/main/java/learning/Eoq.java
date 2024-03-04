package learning;

import java.util.Scanner;

class Eoq {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Demand Rate:");
        double demandRate = s.nextDouble();

        System.out.print("setupCost:");
        double setupCost = s.nextDouble();

        System.out.print("Holding Cost per unit time:");
        double holdingCost = s.nextDouble();

        double calculationUpper = 2 * demandRate * setupCost * holdingCost;
        double calculationWhole = calculationUpper / holdingCost;
        double eoq = Math.sqrt(calculationWhole);
        System.out.println("Print The EOQ:" + eoq);

    }

}