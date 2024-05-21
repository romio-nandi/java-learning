package learning;

 class Test {
     int length;
     int breath;

     Test(int a, int b) {
         length = a;
         breath = b;
     }

     void getArea() {
         int area = length * breath;
         System.out.println(area);
     }
 }
    class Exam extends Test{
            int height;
        Exam(int a, int b,int c) {
            super(a, b);
           height=c;
        }
        void getVolume(){
            int volume=length*breath*height;
            System.out.println(volume);
        }
    }
   public class InheritanceThroughConstructor {
       public static void main(String[] args) {
           Exam obj = new Exam(6,8,9);
           obj.getArea();
           obj.getVolume();



       }
   }


