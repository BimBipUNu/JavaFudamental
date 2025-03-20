import java.util.Scanner;
public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of square");
        int length = scanner.nextInt();
        int c = length * 4;
        int s = length * length;
        System.out.println("C = " + c);
        System.out.println("S = " + s);
        scanner.close();
    }
}