
public class pyramidwithnumber {

    public static void pyramid(int n) {
        //outer loop
        for (int i = 0; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
