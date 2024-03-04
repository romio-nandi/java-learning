package learning;

public class PetersonNumber {

    public static void main(String[] args) {
        int n=145; int sum=0;int z=1;int org=n;int i;
        while(n>0){
            z=n%10;
            int fact = 1;
            for(i=1;i<=z;i++){
                 fact=i*fact;
            }
            sum=sum+fact;
            n=n/10;
        }
        if (org==sum){
            System.out.println("it is a peterson"+sum);
        }
        else{
            System.out.println("it is not peterson "+sum);
        }


    }
}

