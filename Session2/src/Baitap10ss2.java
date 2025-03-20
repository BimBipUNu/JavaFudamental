import java.util.Scanner;;
public class Baitap10ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
                break;
            }else{
                System.out.println("Do dai khong phu hop");
            }
        }
        scanner.close();
    }
}
