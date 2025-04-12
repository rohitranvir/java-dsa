
public class addnum {

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8};
        int addnum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            addnum += numbers[i];
        }
        System.out.println(addnum);
    }
}
