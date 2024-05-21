package learning;

// Multilevel inheritance
// Class C ---> Class B ---> Class A
// Class C is derived from Class B which in correspondence derived from Class A

class A {
    int a;

    A(int x) {
        a = x;
    }
}

// Child of Class A
class B extends A {
    int b;


    B(int y,int x) {
        super(x);

        b=y;
    }


}

// Child of Class B but have access to methods of both classes, i.e., Class A and B
class AToBToC extends B {
    int  product;

    AToBToC(int y, int x) {
        super(y, x);
    }


    void cal_Product() {
        product = a * b;
        System.out.println("Product = " + product);
    }

    public static void main(String[] args) {
        AToBToC c = new AToBToC(5,6 );
        // Class C accesses methods of both class A and B


        c.cal_Product();
    }
}


