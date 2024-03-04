package learning;

public class RhombusStarPattern {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=3;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
