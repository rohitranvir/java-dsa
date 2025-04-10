
public class arrays {

    public static void updatemarks(int marks[]) {
        for (int i = 0; i <= marks.length - 1; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {95, 96, 97, 98};
        updatemarks(marks);
        for (int i = 0; i <= marks.length - 1; i++) {
            System.out.println(marks[i]);
        }
    }
}
