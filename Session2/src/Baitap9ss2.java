import java.util.Scanner;
public class Baitap9ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Hinh chu nhat");
            System.out.println("2. Hinh tam giac");
            System.out.println("3. Hinh tron");
            System.out.println("0. Thoat");
            System.out.println("Enter your choose: ");
            int choose = scanner.nextInt();
            if (choose == 0) {
                System.out.println("Thoat");
                break;
            }
            switch (choose) {
                case 1:
                    System.out.println("Enter length");
                    float length = scanner.nextFloat();
                    System.out.println("Enter width");
                    float width = scanner.nextFloat();
                    if (length > 0 && width > 0) {
                        float c = (length + width)*2;
                        float s = length * width;
                        System.out.println("C = "+c);
                        System.out.println("S = "+s);
                    }else{
                        System.out.println("Do dai khong phu hop");
                    }
                    break;
                case 2:
                    System.out.println("Enter a");
                    float a = scanner.nextFloat();
                    System.out.println("Enter b");
                    float b = scanner.nextFloat();
                    System.out.println("Enter c");
                    float c = scanner.nextFloat();

                    boolean condition1 = a > 0 && b > 0 && c >0;
                    boolean condition2 = a + b > c && a + c > b && b + c > a;
                    if (condition1 && condition2) {
                        float cTamgiac = a + b + c;
                        float halfC = cTamgiac/2;
                        double sTamgiac = Math.sqrt(halfC*(halfC-a)*(halfC-b)*(halfC-c));
                        System.out.println("C = "+cTamgiac);
                        System.out.println("S = "+sTamgiac);
                    }else{
                        System.out.println("Do dai khong phu hop");
                    }
                    break;
                case 3:
                    System.out.println("Enter radius: ");
                    float radius = scanner.nextFloat();

                    double cTron = 2 * Math.PI * radius;
                    double sTron = Math.PI * (radius*radius);

                    System.out.println("C = "+cTron);
                    System.out.println("S = "+sTron);                    break;
                default:
                    System.out.println("DU lieu khong hop le");
                    break;
            }
        }
        scanner.close();
    }
}
