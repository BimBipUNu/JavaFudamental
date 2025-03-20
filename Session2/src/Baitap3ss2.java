import java.util.Scanner;
public class Baitap3ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:System.out.print("zero");break;
                case 1:System.out.print("one");break;
                case 2:System.out.print("two");break;
                case 3:System.out.print("three");break;
                case 4:System.out.print("four");break;
                case 5:System.out.print("five");break;
                case 6:System.out.print("six");break;
                case 7:System.out.print("seven");break;
                case 8:System.out.print("eight");break;
                case 9:System.out.print("nine");break;
            }
        }else if (number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:System.out.print("Ten");break;
                case 1:System.out.print("Eleven");break;
                case 2:System.out.print("Twelve");break;
                case 3:System.out.print("Thirteen");break;
                case 4:System.out.print("Fourteen");break;
                case 5:System.out.print("Fifteen");break;
                case 6:System.out.print("Sixteen");break;
                case 7:System.out.print("Seventeen");break;
                case 8:System.out.print("Eighteen");break;
                case 9:System.out.print("Nineteen");break;
            }
        }else if (number <100){
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2:System.out.print("Twenty ");break;
                case 3:System.out.print("Thirty ");break;
                case 4:System.out.print("Forty ");break;
                case 5:System.out.print("Fifteen ");break;
                case 6:System.out.print("Sixty ");break;
                case 7:System.out.print("Seventy ");break;
                case 8:System.out.print("Eighty ");break;
                case 9:System.out.print("Ninety ");break;
            }
            switch (ones) {
                case 1:System.out.print("one");break;
                case 2:System.out.print("two");break;
                case 3:System.out.print("three");break;
                case 4:System.out.print("four");break;
                case 5:System.out.print("five");break;
                case 6:System.out.print("six");break;
                case 7:System.out.print("seven");break;
                case 8:System.out.print("eight");break;
                case 9:System.out.print("nine");break;
            }
        }else if (number < 999) {
            int hundred = number / 100;
            int tens = (number % 100) /10;
            int ones = (number %100) %10;
            switch (hundred) {
                case 1:System.out.print("one");break;
                case 2:System.out.print("two");break;
                case 3:System.out.print("three");break;
                case 4:System.out.print("four");break;
                case 5:System.out.print("five");break;
                case 6:System.out.print("six");break;
                case 7:System.out.print("seven");break;
                case 8:System.out.print("eight");break;
                case 9:System.out.print("nine");break;
            }
            System.out.print(" hundred ");
            if(tens !=0 || ones != 0){
                System.out.print("and ");
            }
            switch (tens) {
                case 1:System.out.print("Eleven ");break;
                case 2:System.out.print("Twelve ");break;
                case 3:System.out.print("Thirteen ");break;
                case 4:System.out.print("Fourteen ");break;
                case 5:System.out.print("Fifteen ");break;
                case 6:System.out.print("Sixteen ");break;
                case 7:System.out.print("Seventeen ");break;
                case 8:System.out.print("Eighteen ");break;
                case 9:System.out.print("Nineteen ");break;
            }
            switch (ones) {
                case 1:System.out.print("one");break;
                case 2:System.out.print("two");break;
                case 3:System.out.print("three");break;
                case 4:System.out.print("four");break;
                case 5:System.out.print("five");break;
                case 6:System.out.print("six");break;
                case 7:System.out.print("seven");break;
                case 8:System.out.print("eight");break;
                case 9:System.out.print("nine");break;
            }
        }else{
            System.out.println("Dữ liệu không hợp lệ");
        }
        scanner.close();
    }
}
