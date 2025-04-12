
public class subarrays {

    public static void subarr(int numbers[]) {
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // int curr = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += numbers[k]; // System.out.print(numbers[k] + " ");
                }
                System.out.println(curr);
                if (curr < maxSum) {
                    maxSum = curr;
                }
            }

        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarr(numbers);
    }
}
