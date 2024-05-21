package learning;

public class SecondLargestElement {
    public int findSecondLargestElement(int [] a){
        int j=0;

        for( int i=0;i<a.length;i++){
            for( j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int[] res=new int[a.length];
        for(int k=0;k<a.length;k++){
            res[k]=a[k];


        }
        int d=res[1];
      return d;
    }

    public static void main(String[] args) {
        SecondLargestElement s=new SecondLargestElement();
        int [] a={10,15,48,80,65};
        int x=s.findSecondLargestElement(a);
        System.out.println(x);


    }
}
