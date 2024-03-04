package learning;

public class SumOfArray {

    public int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfArray sumOfArray = new SumOfArray();
        int[] arr = {12, 15, 14, 17};
        int sum = sumOfArray.findSum(arr);
        System.out.println("Print the sum:" + sum);
    }
}
