package learning;

public class ConstructorOfTheClass {
    int length;
    int breath;
    public ConstructorOfTheClass(int a, int b){
       this.length=a;
        this.breath=b;
        System.out.println(b );
    }

    public static void main(String[] args) {
        ConstructorOfTheClass obj=new ConstructorOfTheClass(10,15);



    }
}
