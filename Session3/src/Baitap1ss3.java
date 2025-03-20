import java.util.Arrays;
import java.util.Scanner;

public class Baitap1ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 10, 4, 6, 7, 8, 6 };
        int size = numbers.length;
        System.out.println("Mang truoc khi xoa: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnter number to delete: ");
        int deleteNumber = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (deleteNumber == numbers[i]) {
                for (int j = i; j < size - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                size--;
            }
        }
        int[] newNumbers = Arrays.copyOf(numbers, size);
        System.out.println("Mang sau khi xoa: ");
        for (int i : newNumbers) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
