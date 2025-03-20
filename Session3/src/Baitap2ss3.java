import java.util.Arrays;
import java.util.Scanner;

public class Baitap2ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 10, 4, 6, 7, 8, 6 };
        int size = numbers.length;
        System.out.println("Mang truoc khi them: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnter value: ");
        int value = scanner.nextInt();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        size++;
        if (index < 0 || index >= size) {
            System.out.println("Khong the chen vao vi tri: " + index);
            scanner.close();
            return;
        }

        int[] newNumbers = Arrays.copyOf(numbers, size);

        for (int i = size - 1; i > index; i--) {
            newNumbers[i] = newNumbers[i - 1];
        }
        newNumbers[index] = value;

        System.out.println("Mang sau khi them: ");
        for (int i : newNumbers) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
