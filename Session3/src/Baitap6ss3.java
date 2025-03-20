import java.util.Scanner;

public class Baitap6ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];

        // Them phan tu
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value of row: " + i + " ,col: " + j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Hien thi mang sau khi nhap
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        // tinh tong
        System.out.printf("Enter col for sum( 0- %d): ", cols - 1);
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][col];
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
