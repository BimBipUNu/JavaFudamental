import java.util.Scanner;

public class Baitap3ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter size of array2: ");
        int size2 = scanner.nextInt();

        int[] arrayNumbers1 = new int[size1];
        int[] arrayNumbers2 = new int[size2];

        // Nhap phan tu mang 1
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter value of " + i + " for array1");
            arrayNumbers1[i] = scanner.nextInt();
        }
        // Nhap phan tu mang 2
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter value of " + i + " for array2");
            arrayNumbers2[i] = scanner.nextInt();
        }

        // Mang3
        int size3 = size1 + size2;
        int[] arrayNumbers3 = new int[size3];
        // Them mang 1 vao mang3
        for (int i = 0; i < size1; i++) {
            arrayNumbers3[i] = arrayNumbers1[i];
        }
        // Them mang 2 vao mang3
        for (int i = 0; i < size2; i++) {
            arrayNumbers3[size1 + i] = arrayNumbers2[i];
        }

        // Mang 3 sau khi them phan tu
        for (int i = 0; i < size3; i++) {
            System.out.print(arrayNumbers3[i] + " ");
        }
        scanner.close();
    }
}
