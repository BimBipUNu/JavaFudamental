public class Baitap6ss2 {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            if (n %5 == 0 && n %7 == 0 && n %11 ==0) {
                break;
            }
            n++;
        }
        System.out.println("So chia het cho ca 5, 7 va 11: "+n);
    }
}
