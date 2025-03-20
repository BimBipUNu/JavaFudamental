import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 25000;
        System.out.print("Enter USD:");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println(usd + " USD = " + vnd + " VND");
        scanner.close();
    }
}
