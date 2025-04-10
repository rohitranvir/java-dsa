
public class solidrhombspattern {

    public static void rhambas(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        rhambas(15);
    }
}
