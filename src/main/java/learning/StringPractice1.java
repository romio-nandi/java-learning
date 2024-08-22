package learning;

public class StringPractice1 {

    public static void concat1(String p){
       p= p+"geekforgeek";
      //  System.out.println(q);
    }
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }

    public static void main(String[] args) {
        String p=new String("joni");
        concat1(p);
        System.out.println(p.toString());
        StringBuilder s2= new StringBuilder("romio");
        concat2(s2);
        System.out.println(s2);




    }
}
