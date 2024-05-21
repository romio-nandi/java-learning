package learning;


  class School{
      static void getName(String name){
          System.out.println(name);
      }

}

 public  class StaticClassNonStaticSubClass extends School{
     public static void main(String[] args) {
         StaticClassNonStaticSubClass.getName("Ram");

     }
}
