package learning;

class Method {
    int length, width;
    String name;

    int area() {


        int j = length * width;
        return j;
        
    }
}


public class Practice {
    public static void main(String[] args) {
        Method obj = new Method();
        int k = obj.area();
        System.out.println(k);
    }
}