package Baitap9;

import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] listStudent = new Student[100];
        int size = 0;
        int choose = 0;
        while(true){
            System.out.println("===MENU===");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Sua thong tin sinh vien (dua vao ma sv)");
            System.out.println("4. Xoa sinh vien (dua vao ma sv)");
            System.out.println("0. Thoat");
            System.out.println("Nhap chuc nang: ");

            choose = Integer.parseInt(scanner.nextLine());

            if(choose == 0){
                System.out.println("Thoat chuong trinh");
                break;
            }
            switch (choose) {
                case 1:
                    if(size == 0){
                        System.out.println("Chua co sinh vien");
                        break;
                    }
                    System.out.println("Danh sach sinh vien");
                    for (int i = 0; i < size; i++) {
                        System.out.println("Sinh vien " + (i+1) + ": ");
                        listStudent[i].displayData();
                        System.out.println("====================");
                    }
                    break;
                case 2:
                    Student newStudent = new Student();
                    newStudent.inputData();
                    listStudent[size] = newStudent;
                    size++;
                    break;
                case 3:
                    System.out.println("Nhap ID sv muon sua:");
                    String tempID = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (tempID.equals(listStudent[i].getStudentId())){
                            found = true;
                            System.out.println("=====SetInfo=====");
                            System.out.println("1. Ten");
                            System.out.println("2. Tuoi");
                            System.out.println("3. Gioi tinh");
                            System.out.println("4. Dia chi");
                            System.out.println("5. So dien thoai");
                            System.out.println("Nhap chuc nang: ");
                            choose = Integer.parseInt(scanner.nextLine());
                            switch (choose) {
                                case 1:
                                    System.out.println("Nhap ten: ");
                                    String tempName = scanner.nextLine();
                                    listStudent[i].setName(tempName);
                                    break;
                                case 2:
                                    System.out.println("Nhap tuoi: ");
                                    int tempAge = Integer.parseInt(scanner.nextLine());
                                    listStudent[i].setAge(tempAge);
                                    break;
                                case 3:
                                    System.out.println("Nhap gioi tinh sv (1: Nam, 0: Nu): ");
                                    boolean tempSex = (scanner.nextLine()).equals("1");
                                    listStudent[i].setSex(tempSex);
                                    break;
                                case 4:
                                    System.out.println("Nhap dia chi: ");
                                    String tempAddress = scanner.nextLine();
                                    listStudent[i].setAddress(tempAddress);
                                    break;
                                case 5:
                                    System.out.println("Nhap so dien thoai: ");
                                    String tempPhoneNumber = scanner.nextLine();
                                    listStudent[i].setPhoneNumber(tempPhoneNumber);
                                    break;
                                default:
                                    System.out.println("Chuc nang khong hop le");
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay sinh vien");
                    } else {
                        System.out.println("Da sua thong tin sinh vien");
                    }
                    break;
                case 4:
                    System.out.println("Nhap ID sv muon xoa:");
                    String delStudent = scanner.nextLine();
                    boolean flag = false;
                    for (int i = 0; i < size; i++) {
                        if (delStudent.equals(listStudent[i].getStudentId())){
                            flag = true;
                            for (int j = i; j < size -1; j++) {
                                listStudent[j] = listStudent[j+1];
                            }
                            listStudent[size] = null;
                            size--;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("Da xoa sinh vien");
                    } else {
                        System.out.println("Khong tim thay sinh vien");
                    }
                    break;
                default:
                    System.out.println("Chuc nang khong hop le");
            }
        }
        scanner.close();
    }
}
