package learning;

public class AvarageValueExceptLargeAndSmall {
    public int findAvarage(int[] arr) {
        int max = arr[0];
        int min = arr[1];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        // max=0;
        // min=0;
        for (int z = 0; z < arr.length; z++) {
            if (arr[z] != max && arr[z] == min)
            {
                sum = sum + arr[z];
                count = count + 1;
            }
        }
        int avg_sum = sum / count;
        return avg_sum;
    }

    public static void main(String[] args) {
        AvarageValueExceptLargeAndSmall obj = new AvarageValueExceptLargeAndSmall();
        int[] arr = {6, 7, 2, 9, 4, 8};
        int res = obj.findAvarage(arr);
        System.out.println(res);
    }
}
