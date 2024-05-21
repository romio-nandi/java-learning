package learning;

public class PerimeterRectangular implements AreaParameterOfAShape{
    int a;
    int b;

    public PerimeterRectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double area() {
      double rectangularArea = a*b;
        return rectangularArea;
    }

    public  double parameter() {
        double rectangularParameter = 2 * (a +b );
        return rectangularParameter;
    }
}
