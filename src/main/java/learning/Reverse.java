package learning;

import java.util.Scanner;
class Reverse
 {
     public static void main (String args[])
	 {
	   Scanner s=new Scanner(System.in);
	   int i =0 ;
	   while(i <5 ){
	   System.out.println("Enter the Number");
	   int r= s.nextInt();
	   while (r>0){
	   int x=r%10;
	   System.out.print(x +"|");
	   r=r/10;
	   }
	   i++;
	   }

	   }
	 }