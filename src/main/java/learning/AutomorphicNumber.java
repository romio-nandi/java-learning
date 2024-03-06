package learning;

public class AutomorphicNumber {

    public boolean checkAutomorphicNumber(int a) {
        double y = Math.pow(a, 2);
        int len = String.valueOf(a).length();
        double z = y % Math.pow(10, len);
        //return a==z;
        //return 30+5
        // return 12/5;
        // reatun a==z

        return a == z;
    }
}


