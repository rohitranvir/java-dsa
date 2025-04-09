
public class halfpyramid {

    public static void pyramid(int n) {
//outer Loop
        for (int i = 1; i <= n; i++) {
            //inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pyramid(4);
    }
}
