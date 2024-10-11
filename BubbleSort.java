import java.util.Arrays;

public class BubbleSortAscending {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2}; // Sample array
        System.out.println("Before sorting: " + Arrays.toString(array));

        // Outer loop to control the number of passes
        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Swap if the current element is greater than the next
                if (array[j] > array[j + 1]) {
                    // Swapping the elements to sort in ascending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting in ascending order: " + Arrays.toString(array));
    }
}
