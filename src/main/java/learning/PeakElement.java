package learning;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {10, 15, 25, 80};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }


}