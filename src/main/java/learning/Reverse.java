package learning;

class Reverse {
    public int getReverse(int n) {
        int sum = 0;
        while (n > 0) {
            int x = n % 10;

            sum = (sum * 10) + x;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Reverse reverseInstance = new Reverse();
        int k = reverseInstance.getReverse(786);
        System.out.println("print the Reverse number:" + k);

    }

    {


    }

}
