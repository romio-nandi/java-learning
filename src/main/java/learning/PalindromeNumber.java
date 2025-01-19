package learning;

public class PalindromeNumber {

    int k;
    int sum=0;

    public boolean  getPalindromeNumber(int a){
        int res=a;
        while(a>0) {
            k = a % 10;
            sum=sum*10+k;
            a= a/10;

    }
        if(res==sum){
            System.out.println("it is palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }
        return res==sum;
    }

    public static void main(String[] args) {
        PalindromeNumber obj=new PalindromeNumber();
        obj.getPalindromeNumber(14441);

    }
}
