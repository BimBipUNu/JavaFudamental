import java.util.Scanner;

public class Baitap7ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        int count = 0;
        int number = 2;
        while (count < n) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    number++;
                    continue;
                }
            }
            if (flag) {
                System.out.println(number + " ");
                number++;
                count++;
            }
        }
        scanner.close();
    }
}
