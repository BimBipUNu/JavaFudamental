import java.util.Scanner;

public class Main {
    static int sizeCategories = 0;
    static int sizeProducts = 0;

    static Categories[] arrCategories = new Categories[100];
    static Products[] arrProducts = new Products[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Categories c1 = new Categories();
//        c1.inputData(scanner, arrCategories, sizeCategories);
//        arrCategories[sizeCategories - 1] = c1;
//        Categories c2 = new Categories();
//        c2.inputData(scanner, arrCategories, sizeCategories);
//        arrCategories[sizeCategories - 1] = c2;
//
//        Products p1 = new Products();
//        p1.inputData(scanner, arrProducts, sizeProducts, arrCategories);
//        arrProducts[sizeProducts] = p1;
//        Products p2 = new Products();
//        p2.inputData(scanner, arrProducts, sizeProducts, arrCategories);
//        arrProducts[sizeProducts] = p2;
        while(true) {
            Funtion.mainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 3) {
                System.out.println("Exit program");
                break;
            }
            switch (choice) {
                case 1:
                    Funtion.categoriesManagement(scanner);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Du lieu khong hop le");
            }
        }
        scanner.close();
    }
}
