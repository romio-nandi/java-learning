package learning;


// Super class
class Base {
    int h;

    Base(int k) {
        this.h = k;

    }

    public void get_Print() {
        System.out.println("hi");
    }
}

// Sub-Class
class Derived extends Base {

    int y;


    Derived(int k, int o) {
        super(k);

        this.y = o;

    }
    public  void get_Print(){
        System.out.println("bye");
    }



    void Display() {
        System.out.println(h + "," + y);
        super.get_Print();
    }
}

public class SuperAndSub {
    public static void main(String[] args) {
        Derived d = new Derived(10, 20);
        d.Display();
        d.get_Print();
    }
}



