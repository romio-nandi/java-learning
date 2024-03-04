package learning;

import java.util.Scanner;

class If {
    public static void main(String args[]) {
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Take the value of  N");
        int n = s.nextInt();
        System.out.print("Take the value of M");
        int m = s.nextInt();
        while (i < 5) {
            if (n > m) {
                System.out.print("n>m;lesser");
            }
            if (n == m) {
                System.out.print("n==m;equal");
            }
            if (n < m) {
                System.out.print("n<m; greater");
            }
            System.out.println("Take the value of  N");
            n = s.nextInt();
            System.out.println("Take the value of M");
            m = s.nextInt();

        }

    }

}
	  
	  
	  
	
	
	
	
	
	
	
	
	
	










