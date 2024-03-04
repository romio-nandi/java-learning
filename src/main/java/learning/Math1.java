package learning;

class Square {
    int a = 2, b = 2;

    int area1() {
        int c = a * b;
        return c;
    }

}

class Triangle {
    int x = 5, y = 6;

    double area2() {
        double z = (0.5) * 5 * 6;
        return z;

    }
}

public class Math1 {

    public static void main(String[] args) {
        Square squareObject = new Square();
        Triangle triangleObject = new Triangle();

        int reslt1 = squareObject.area1();
        double result2 = triangleObject.area2();
        System.out.println("Print the value of Square:" + squareObject.area1());
        System.out.println("print the area of Square:" + reslt1);


    }



}
