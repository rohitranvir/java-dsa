
public class linersearch {

    public static int linearsearch(int number[], int key) {
        for (int i = 0; i <= number.length - 1; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 5;
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("This number " + key + "+ is not present : ");
        } else {
            System.out.println("The index of given key is : " + index);
        }
    }
}
