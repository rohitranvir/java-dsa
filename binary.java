
public class binary {

    public static int binalgo(int numbers[], int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > numbers[mid]) {
                start = mid + 1;
            } else if (target < numbers[mid]) {
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6, 8};
        int target = 8;
        System.out.println(binalgo(numbers, target));
    }
}
