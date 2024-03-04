package learning;

class NewSum {
    int a;
    int b;

    static int sum(int a, int b) {
        int s = a + b;
        return s;
    }


    public static void main(String args[]) {
        int ss = sum(74, 36);
        System.out.println("Sum=" + ss);


    }


}