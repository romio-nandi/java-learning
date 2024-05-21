package learning;


import java.util.Arrays;

public class RemoveTheDuplicateNumber {

    public void removeElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                    arr[i] = -1;
                }
            }
        }

        int n = arr.length - count;
        int[] res = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        RemoveTheDuplicateNumber obj = new RemoveTheDuplicateNumber();
        int[] arr = {10, 15, 10, 25, 20, 25};
        obj.removeElement(arr);
    }


}










