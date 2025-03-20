import java.util.Scanner;

public class Baitap7ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size (format: size x size): ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        // Them phan tu
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter value (%d:%d): ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Hien thi mang sau khi nhap
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Tong duong cheo chinh
        int sum = 0;
        for (int i = 0, j = 0; i < size; i++, j++) {
            sum += array[i][j];
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
