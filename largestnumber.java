
public class largestnumber {

    public static void maxnum(int largestnum[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <= largestnum.length - 1; i++) {
            if (largest < largestnum[i]) {
                largest = largestnum[i];
            }
            if (smallest > largestnum[i]) {
                smallest = largestnum[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int largestnum[] = {2, 6, 3, 15, 8};
        maxnum(largestnum);
    }
}
