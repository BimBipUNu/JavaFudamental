import java.util.Scanner;

public class Baitap8ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Ktra chan le");
            System.out.println("2. Ktra so nguyen to");
            System.out.println("3. Ktra chia het cho 3");
            System.out.println("0. Thoat");
            System.out.println("Enter your choose: ");
            int choose = scanner.nextInt();
            if (choose == 0) {
                System.out.println("Thoat");
                break;
            }
            int number;
            switch (choose) {
                case 1:
                    number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " la so chan");
                    } else {
                        System.out.println(number + " la so le");
                    }
                    break;
                case 2:
                    number = scanner.nextInt();
                    if (number < 2) {
                        System.out.println(number + " khong la so nguyen to");
                        break;
                    }
                    boolean check = true;
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            check = false;
                            System.out.println(number + " khong la so nguyen to");
                            break;
                        }
                    }
                    if (check) {
                        System.out.println(number + " la so nguyen to");
                    }
                    break;
                case 3:
                    number = scanner.nextInt();
                    if (number % 3 == 0) {
                        System.out.println(number + " chia het cho 3");
                    } else {
                        System.out.println(number + " khong chia het cho 3");
                    }
                    break;
                default:
                    System.out.println("DU lieu khong hop le");
                    break;
            }
        }
        scanner.close();
    }
}
