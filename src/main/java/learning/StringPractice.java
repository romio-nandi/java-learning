package learning;
public class StringPractice{

    void getName(String a){

for(int i=0;i<a.length();i++){
   char  k= a.charAt(i);
    System.out.println(k);
}

   }

    public static void main(String[] args) {
        StringPractice obj=new StringPractice();
        obj.getName("hi my name is romio");

    }
}

