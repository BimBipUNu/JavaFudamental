import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        int square = a * a;
        int cube = a * a * a;
        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);
        scanner.close();
    }
}
