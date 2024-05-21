package learning;
class Box{
    void areaBox(){
        System.out.println("romio");
    }
}
class Pencil{
    void Print()

    {
        Box obj = new Box();
        obj.areaBox();
    }
}
public class NestedMethod {
    public static void main(String[] args) {
        Pencil obj1= new Pencil();
        obj1.Print();
    }
}
