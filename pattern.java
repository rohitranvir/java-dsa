public class pattern {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i/i==0 && i/1==0) {
                System.out.println(i);
            }
            else{
                System.out.println("this is not a prime number");
            }
        }
    }
}