package learning;

class Rectangular {

    int area(int a, int b) {
        return a * b;
    }

}

class Triangular {

    double area(int x, int y) {
        return ((1 / (double) 2) * x * y);
    }

}


public class RectangularTran {
    public static void main(String[] args) {

        Rectangular rect = new Rectangular();
        Triangular triangular = new Triangular();

        int[] rectangle = {1, 2, 3, 4, 5, 6};
        int[] tri = {1, 2, 3, 4, 5, 6};

        /*
        Find the sum of area of 3 pairs in the above array.
        Ex:  {1,2,3,4,5,6}
        3 pair - > (1,2), (3,4), (5,6)
        Area -> 2, 12, 30
        Sum = 44
         */

        int sum = 0;
        for(int i=0; i<6;i=i+2){
            int temp = rect.area(rectangle[i], rectangle[i+1]);
            System.out.println(temp);
            sum = sum + temp;
        }
        System.out.println("sum is " + sum);
    }
}
