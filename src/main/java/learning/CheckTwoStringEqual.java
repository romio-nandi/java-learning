package learning;


import java.util.Arrays;

public class CheckTwoStringEqual {
    public static void main(String[] args) {
        String s1 = "maa";
        String s2 = "maa";
        boolean anagram = checkAnagram(s1, s2);

        System.out.println(anagram);

    }

    public static boolean checkAnagram(String s1, String s2) {
        int[] arr = new int[26];
        int[] arr1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            arr[index] = arr[index] + 1;
        }

        int k = 0;
        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i) - 'a';
            arr1[index] = arr1[index] + 1;
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr1));

        while (k < arr.length) {
            if (arr[k] != arr1[k]) {
                return false;
            }
            k++;
        }
        return true;
    }
}




