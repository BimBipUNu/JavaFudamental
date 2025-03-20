import java.util.Scanner;

public class Baitap9ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value %d: ", i);
            arr[i] = scanner.nextInt();
        }
        int max, max2;
        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        } else {
            max = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < size; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            }
            if (max2 < arr[i] && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println("The second min: " + max2);
        scanner.close();
    }
}
