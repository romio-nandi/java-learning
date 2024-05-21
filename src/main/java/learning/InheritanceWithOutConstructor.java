package learning;

class Car{
    int getArea(int a,int b){
        return (a*b);
    }

}
public class InheritanceWithOutConstructor extends Car {

    int getVolume(int a,int b,int c){
        return (a*b*c);

    }

    public static void main(String[] args) {
        InheritanceWithOutConstructor obj =new InheritanceWithOutConstructor();
      int z=  obj.getVolume(5,6,2);
       int f= obj.getArea(9,8);
        System.out.println(z);
        System.out.println(f);


    }

}