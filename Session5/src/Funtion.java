import java.util.Scanner;

public class Funtion {
    public static void mainMenu () {
        System.out.println("---------------MENU---------------");
        System.out.println("1. Categories Manegement");
        System.out.println("2. Products Manegement");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
    }
    public static void categoriesManagement (Scanner scanner) {
        while (true) {
            categoriesMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 6) {
                System.out.println("Exit");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin Category");
                    Categories newCategory = new Categories();
                    newCategory.inputData(scanner, Main.arrCategories, Main.sizeCategories);
                    Main.arrCategories[Main.sizeCategories - 1] = newCategory;
                    break;
                case 2:
                    System.out.println("Thong tin Category");
                    for (int i = 0; i < Main.sizeCategories; i++) {
                        Main.arrCategories[i].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Cap nhat thong tin Category");

                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
    public static void categoriesMenu () {
        System.out.println("---------------Categories---------------");
        System.out.println("1. Nhap thong tin Category");
        System.out.println("2. Hien thi thong tin Category");
        System.out.println("3. Cap nhat thong tin Category");
        System.out.println("4. Xoa Category");
        System.out.println("5. Cap nhat trang thai Category");
        System.out.println("6. Thoat");
    }
}
