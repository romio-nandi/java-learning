package learning;


// Super class
class Base {
int h;
    Base(int k) {
       this.h=k;

    }
}
// Sub-Class
class Derived extends Base {
    int y;

    Derived(int k,int o) {
        super(k);

       this.y=o;

    }
    void Display() {
        System.out.println(h+","+y);
    }
}
public class SuperAndSub {
    public static void main(String[] args) {
        Derived d = new Derived(10,20);
        d.Display();
    }
}



