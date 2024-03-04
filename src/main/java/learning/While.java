package learning;

class While {
    public static void main(String[] args) {
        int x = 1; int count =0;
        while (x <= 10) {
            if (x % 2 != 0) {
                System.out.println("print the odd value:" + x);
                 count =count+1;
            }
            x++;
        }
        System.out.println("Odd Number of iteration :"+count);

    }
}
