package learning;

public class MirrorRhombusPattern {
    public static void main(String[] args) {
        for (int i=0;i<=3;i++){
            for(int j=i;j<=2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=3;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
