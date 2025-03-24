package Baitap2;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        QuadraticEquation pt1 = new QuadraticEquation(a ,b ,c);
        pt1.getRoot();
    }
}
