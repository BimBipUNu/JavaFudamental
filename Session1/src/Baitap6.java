import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float math, literature, english;
        System.out.print("Enter socre of math: ");
        math = scanner.nextInt();
        System.out.print("Enter socre of literature: ");
        literature = scanner.nextInt();
        System.out.print("Enter socre of english: ");
        english = scanner.nextInt();
        float average = (math + literature + english) / 3;
        System.out.println("Average = " + average);
        scanner.close();
    }
}
