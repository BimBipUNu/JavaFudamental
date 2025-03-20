import java.util.Scanner;

public class Baitap4ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float math, physics, chemistry, literature, english;
        System.out.println("Enter score of math");
        math = scanner.nextFloat();
        System.out.println("Enter score of physics");
        physics = scanner.nextFloat();
        System.out.println("Enter score of chemistry");
        chemistry = scanner.nextFloat();
        System.out.println("Enter score of literature");
        literature = scanner.nextFloat();
        System.out.println("Enter score of english");
        english = scanner.nextFloat();

        float average = (math + physics + chemistry + literature + english) / 5;
        if (average >= 0 && average < 5) {
            System.out.println("Yeu");
        } else if (average < 6.5) {
            System.out.println("Trung binh");
        } else if (average < 8) {
            System.out.println("Kha");
        } else if (average < 9) {
            System.out.println("Gioi");
        } else {
            System.out.println("Xuat sac");
        }
        scanner.close();
    }
}
