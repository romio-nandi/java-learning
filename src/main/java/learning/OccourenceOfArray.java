package learning;

public class OccourenceOfArray {
    public int occuranceReturn(int a[]){
        int number=2; int count=0;
        for(int i=0;i<a.length;i++){
            if (number==a[i]){
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        OccourenceOfArray obj=new OccourenceOfArray();
        int a[]={1,2,2,5,8,2,2};
        int z=obj.occuranceReturn(a);
        System.out.println(z);
    }
}
