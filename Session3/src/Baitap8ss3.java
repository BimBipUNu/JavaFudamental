import java.util.Scanner;

public class Baitap8ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Hello, world";
        char checkChar = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == checkChar) {
                count ++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
