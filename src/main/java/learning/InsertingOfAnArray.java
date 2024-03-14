package learning;

public class InsertingOfAnArray {
    public void insertAnElement(int[] arr ,  int value) {
        int k = 2;
        int n = arr.length + 1;
        int[] res = new int[n];
        int j = 0;

        for (int i = 0; i < k; i++) {
            res[j] = arr[i];
            j++;
        }


        res[k] = value;

        for (int i = k + 1; i < res.length ; i++) {
            res[i] = arr[j];
            j++;

        }
        for ( j = 0; j < res.length; j++) {

            System.out.println(res[j]);
        }
    }

    public static void main(String[] args) {
        InsertingOfAnArray obj = new InsertingOfAnArray();
        int[] arr = {10, 15, 12,56};
        obj.insertAnElement(arr,7);

    }


}




