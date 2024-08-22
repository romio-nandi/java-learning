package learning;

public class Fianlly {

        public static void main(String[] args) {
            try {
                System.out.println("Inside try block");
                // Code that may throw an exception
                int result = 10 / 0; // This will throw an ArithmeticException
            } finally {
                System.out.println("Inside finally block");
            }
            // Code here won't be reached if an exception occurs above
            System.out.println("Outside try-finally");
        }
    }


