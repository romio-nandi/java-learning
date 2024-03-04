package learning;

public class InvertedPyramidStar {
    public static void main(String[] args) {
    for(int i= 4;i>=1;i--){
        for(int j=0;j>=i;j--) {
            System.out.print(" ");
        }
        for(int k=0;k<i-k;k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
}