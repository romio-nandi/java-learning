package learning;

import java.awt.*;

public  class Circle implements AreaParameterOfAShape {

        int r;

    public Circle(int r) {
        this.r = r;
    }


    //@Override
    public double area() {
        double circleArea= Math.PI * r*r;
        return circleArea;
    }

    public  double parameter(){
        double circleParameter=2*Math.PI*r;
        return circleParameter;

    }
}
