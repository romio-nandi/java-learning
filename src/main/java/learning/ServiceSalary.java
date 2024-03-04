package learning;

import java.util.Scanner;

public class ServiceSalary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Employ Salary:");
        int salary=s.nextInt();
        System.out.print("Employ Serving year:");
        int serving =s.nextInt();
        if (serving>=5){
            System.out.println("Employ get the net bounus:"+(0.05*salary));
        }
        else{
            System.out.println("less then 5years of serving in company not get bonus");
        }
    }
}
