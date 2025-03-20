import java.util.Scanner;

public class Baitap4ss3 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];

        //Them phan tu
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter value of row: " + i + " ,col: " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        //Tim phan tu lon nhat
        int maxValue = array[0][0];
        int indexOfRow = 0;
        int indexOfCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    indexOfRow = i;
                    indexOfCol = j;
                }
            }
        }
        System.out.println("Max value: " + maxValue + " row: " + indexOfRow + " col: " + indexOfCol);
        scanner.close();
    }
}
