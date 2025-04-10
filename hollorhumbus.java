
public class hollorhumbus {

    public static void rhumbas(int a) {
        //outer Loop
        for (int i = 1; i <= a; i++) {
            //for spaces
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            //for rectangele 
            for (int k = 1; k <= a; k++) {
                if (i == 1 || i == a || k == 1 || k == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhumbas(10);
    }
}
