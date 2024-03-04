package learning;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int   n=575; double y=3; double sum=0; int original=n;
        while(n>0){
            double z=n%10;
             sum=sum+(Math.pow(z,y));
             n=n/10;

        }
        if (original==sum){
            System.out.println("it is a armstrong number");
        }
        else {
            System.out.println ("it is not a armstrong number");
        }
    }
}
