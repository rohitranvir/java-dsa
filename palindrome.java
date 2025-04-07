// Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321

public class palindrome {

    public static void ispalindrome(int a) {
        int b = a;
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
        }
        // if (reversed == a) {
        //     return ;
        // }
        int reverse = reversed;
        if (reverse == b) {
            System.out.println(reverse + " the number is plaindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
        // return reversed;
    }

    public static void main(String[] args) {
        ispalindrome(122);

    }
}
