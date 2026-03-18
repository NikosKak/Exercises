import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the size of the array");
        int size = scanner.nextInt();
        final int SIZE = size;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;
        // Είσοδος δεδομένων, validation, data binding
        System.out.println("Please enter the integers: ");
        for (int i = 0; i < numbers.length; i++) {
            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }
        // Delegation
        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];
        System.out.printf("The maximum value is %d at position %d.\n", maxValue, (maxPosition + 1));
    }
    public static int findMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}