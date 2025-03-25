import java.util.Date;
import java.util.Scanner;

public class Products {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date date; // Ngay nhap san pham
    private int catalogId;
    private int status;

    //Constructor
    public Products() {
        Main.sizeProducts++;
    }
    public Products(String productId, String productName, float price, String description, Date date, int catalogId, int status) {
        Main.sizeProducts++;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.date = date;
        this.catalogId = catalogId;
        this.status = status;
    }

    //gettter, setter
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getCatalogId() {
        return catalogId;
    }
    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    //method
    public void inputData(Scanner scanner, Products[] arrProduct, int index, Categories[] arrCategories) {
        //Xu li du lieu productId
        while(true) {
            System.out.println("Nhap ma san pham( Gom 4 ki tu bat dau bang C-caffee | S-sinh to | A- do an nhanh): ");
            String tempProductId = scanner.nextLine();
            boolean condition1 = tempProductId.length() == 4 ; //Kiem tra do dai
            boolean condition2 =  tempProductId.charAt(0) == 'C' || tempProductId.charAt(0) == 'S' || tempProductId.charAt(0) == 'A';
            if(condition1 && condition2) {
                this.productId = tempProductId;
                break;
            }else {
                System.out.println("Du lieu khong hop le, vui long nhap lai");
            }
        }
        // productName
        while(true) {
            System.out.println("Nhap ten san pham (10-50 ki tu):");
            String tempProductName = scanner.nextLine();
            boolean condition1 = tempProductName.length() >= 10 && tempProductName.length() <= 50;
            boolean condition2 = true; // kiem tra trung ten
            for (int i = 0; i < index; i++) {
                if (arrProduct[i] != null && arrProduct[i].productName.equals(tempProductName)) {
                    condition2 = false;
                    System.out.println("Ten san pham da ton tai");
                    break;
                }
            }
            if(condition1 && condition2) {
                this.productName = tempProductName;
                break;
            }else {
                System.out.println("Du lieu khong hop le, vui long nhap lai");
            }
        }
        System.out.println("Nhap gia:");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap mo ta: ");
        this.description = scanner.nextLine();
        //Date
        this.date = new Date();
        //catalogId
        //Cac ma san pham hien co
        if ( arrCategories.length == 0) {
            System.out.println("Chua co ma danh muc nao ton tai");
            return;
        }
        System.out.println("Catalog Id:");
        for (Categories category : arrCategories) {
            if (category != null) {
                System.out.println(category.getCategoryId()+": "+category.getCategoryName());
            }
        }
        while (true) {
            System.out.println("Nhập mã danh mục mà sản phẩm thuộc về:");
            int tempCatalogId = Integer.parseInt(scanner.nextLine());
            boolean flag = false;
            for (Categories category : arrCategories) {
                if (category != null && tempCatalogId == category.getCategoryId()) {
                    flag = true;
                    this.catalogId = tempCatalogId;
                    break;
                }
            }
            if (flag) {
                break;
            } else {
                System.out.println("Mã danh mục không tồn tại");
            }
        }
        //status
        System.out.println("Nhap trang thai (0:Dang bang | 1: Het hang | 2: Khong ban):");
        this.status = scanner.nextLine().equals("0") ? 0 : scanner.nextLine().equals("1") ? 1 : 2;
    }
    public void displayData() {
        System.out.println(this.productId);
        System.out.println(this.productName);
        System.out.println(this.price);
        System.out.println(this.description);
        System.out.println(this.date);
        System.out.println(this.catalogId);
        System.out.println(this.status == 0 ? "Dang bang" : this.status == 1 ? "Het hang" : "Khong ban");
    }
}
