
public class findduplicate {

    public static boolean duplicates(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int numbers[] = {2, 5, 4, 8, 2, 6};
        boolean value = duplicates(numbers);
        System.out.println(value);
    }
}
