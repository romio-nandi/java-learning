package learning;

public class ReverseTheArray {
   public void reverseArray(int a[]){
      for(int i=(a.length-1);i>=0;i--){
          System.out.print(a[i]+",");
       }

   }

    public static void main(String[] args) {
        ReverseTheArray obj=new ReverseTheArray();
        int []a={10,15,25,54};
         obj.reverseArray(a);
    }
}
