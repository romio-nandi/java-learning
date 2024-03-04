package learning;

class Sum2 {
    int a;
    int b;

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String args[]) {
        int ss = sum(2, 3);

        System.out.println("Sum=" + ss);


    }


}