package learning;

public class IfTest {

    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        int count1 = 0;
        int count2;
        float weight[] = {40.1f, 40.8f, 59.6f, 45.0f, 55.0f};
        float height[] = {176.8f, 184.2f, 168.0f, 170.7f, 180f};

        while (i < 5) {
            if (weight[i] < 50 && height[i] > 180) {
                count = count + 1;
                System.out.println(weight[i]);
            }
            count1 = count1 + 1;
            i++;

        }
        count2 = count1 - count;
        System.out.println("Number of Person satisfy the condition:" + count);
        System.out.println("Total Number of Person count1:" + count1);
        System.out.println("Other persons");
    }
}
