
public class diamondpattern {

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            //for 1st half  for spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //for second
        for (int i = n; i > 1; i--) {
            //for 1st half  for spaces
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
