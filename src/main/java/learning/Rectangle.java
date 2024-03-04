package learning;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Take the value of Length:");
        int length = s.nextInt();
        System.out.print("Take the value of Breadth:");
        int breadth = s.nextInt();
        if (length == breadth)
        {
            System.out.println("It is a squre");
        }
          else
            {
                System.out.println("it is a Rectangular");
            }


        }

    }



