package learning;

public class PetersonNumber {

    public boolean isPeterson(int n) {
        int sum=0;int z=1;int org=n;int i;
        while(n>0){
            z=n%10;
            int fact = 1;
            for(i=1;i<=z;i++){
                fact=i*fact;
            }
            sum=sum+fact;
            n=n/10;
        }

        return org==sum;
    }
}

