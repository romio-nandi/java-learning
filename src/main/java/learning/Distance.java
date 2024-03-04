package learning;

import java.util.Scanner;
class Distance{
  public static void main (String args[])
    {
     Scanner s=new Scanner (System.in);
     System.out.print("u=");
	 double u=s.nextDouble();
	  
	  
      System.out.print("a=");
	  double a=s.nextDouble();
	  
      System.out.print("t=");
	  double t=s.nextDouble();
	  
	  double d=u*t+(a*t*t)/2;
	  
	  System.out.println("distance="+d);
	 
    	





   }





}