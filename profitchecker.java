
public class profitchecker {

    public static int profit(int number[]) {
        int buy = number[0];
        int profit = 0;
        for (int i = 0; i < number.length; i++) {
            if (profit < number[i]) {
                profit = Math.max(number[i] - buy, profit);
            } else {
                buy = number[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int number[] = {2, 45, 6, 7, 2, 4};
        int profit = profit(number);
        System.out.println(profit);
    }
}
