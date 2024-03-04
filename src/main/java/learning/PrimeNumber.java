package learning;

public class PrimeNumber {
    public static void main(String[] args) {
        double num =555555;
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
            }
            if(count==2){
                System.out.println("it is a prime number");
            }
            else{
                System.out.println("it is not a prime number");
            }

        }
        else {
            System.out.println("not prime number");
        }
    }
}
