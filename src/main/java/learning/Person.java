package learning;

public class Person {
    String name;
    void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person myObject=new Person();
        myObject.name="joy";
        myObject.printName();

    }
    }


