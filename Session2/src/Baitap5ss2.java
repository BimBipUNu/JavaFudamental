import java.util.Scanner;

public class Baitap5ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        System.out.println("Enter start: ");
        start = scanner.nextInt();
        System.out.println("Enter end: ");
        end = scanner.nextInt();
        if (start > end) {
            System.out.println("Start or end is invalid");
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of even: " + sum);
        }
        scanner.close();
    }
}
