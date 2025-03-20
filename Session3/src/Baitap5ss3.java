import java.util.Scanner;

public class Baitap5ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int minValue = array[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                index = i;
            }
        }
        System.out.println("Min value is: " + minValue + " index: " + index);
        scanner.close();
    }
}
