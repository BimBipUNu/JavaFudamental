import java.util.Scanner;

public class Categories {
    private int categoryId;
    private String categoryName;
    private String categoryDescription;
    private boolean catalogStatus;
    //Constructor
    public Categories() {
        this.categoryId = Main.sizeCategories + 1;
        Main.sizeCategories++;
    }
    public Categories(String categoryName, String categoryDescription, boolean catalogStatus) {
        this.categoryId = Main.sizeCategories + 1;
        Main.sizeCategories++;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.catalogStatus = catalogStatus;
    }
    //Getter, setter
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryDescription() {
        return categoryDescription;
    }
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
    public boolean getCatalogStatus() {
        return catalogStatus;
    }
    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    //Method
    public void inputData(Scanner scanner, Categories[] arrCategories, int index) {
        this.categoryId = index;
        System.out.println("Nhap ten danh muc: ");
        this.categoryName = scanner.nextLine();
        System.out.println("Nhap mo ta: ");
        this.categoryDescription = scanner.nextLine();
        System.out.println("Nhap trang thai (1: Hoat dong; others: Khong hoat dong): ");
        this.catalogStatus = (scanner.nextLine()).equals("1");
    }
    public void displayData() {
        System.out.println("Ma danh muc: " + categoryId);
        System.out.println("Ten danh muc: " + categoryName);
        System.out.println("Mo ta: " + categoryDescription);
        System.out.println("Trang thai: " + (catalogStatus ? "Hoat dong" : "Khong hoat dong"));
    }
}
