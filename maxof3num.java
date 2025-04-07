// Write a Java method to compute the average of three numbers..

public class maxof3num {

    public static int maxof3() {
        int a = 10;
        int b = 12;
        int c = 15;
        int max = Math.max(c, Math.max(a, b));
        return max;
        // using if-else 
        // int max;
        // if (a >= b && a >= c) {
        //     max = a;
        //     return a;
        // } else if (b >= a && b >= c) {
        //     max = b;
        //     return b;
        // } else {
        //     max = c;
        //     return c;
        // }
    }

    public static void main(String[] args) {

        System.out.println(maxof3());
    }
}
