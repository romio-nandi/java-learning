package learning;

public class FactorialNumber {
    public static void main(String[] args) {
        int i=1; int multi=1;
        while(i<=10){
             multi=multi*i;
             i++;
        }
        System.out.println(multi);
    }
}
