package learning;

class LoopIteration {

    public int getIteration(int x) {
        int count = 0;
        while (x <= 10) {
            if (x % 2 != 0) {
                System.out.println("print the odd value:" + x);
                count = count + 1;
            }
            x++;
        }
        return  count;

    }


    public static void main(String[] args) {


        LoopIteration obj = new LoopIteration();
        int k = obj.getIteration(1);
        System.out.println(k);
       // System.out.println(count);
    }
}



