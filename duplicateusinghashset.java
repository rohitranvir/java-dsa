
import java.util.*;

public class duplicateusinghashset {

    public static HashSet<Integer> find(int numbers[]) {
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                duplicates.add(numbers[i]);
            } else {
                set.add(numbers[i]);
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 5, 6, 45, 2, 4};
        HashSet<Integer> result = find(numbers);
        System.out.println(result);
    }
}
