package learning;

public class FindAreaAndPerimeter {
    public static void main(String[] args) {
        AreaParameterOfAShape circle=new Circle(10);
        AreaParameterOfAShape perimeterRectangular=new PerimeterRectangular(12,10);
        double circleArea = circle.area();
        double circleParameter = circle.parameter();
        System.out.println(circleArea);
        System.out.println(circleParameter);
        System.out.println("..........................");
        double rectangularArea = perimeterRectangular.area();
        double rectangularParameter = perimeterRectangular.parameter();
        System.out.println(rectangularArea);
        System.out.println(rectangularParameter);


    }
}
