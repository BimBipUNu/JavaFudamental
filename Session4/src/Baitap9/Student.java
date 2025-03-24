package Baitap9;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private boolean sex;
    private String address;
    private String phoneNumber;

    //Constructor
    public Student() {
    }
    public Student(String studentId, String name, int age, boolean sex, String address, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //getter, setter
    public String getStudentId() {
        return studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //method
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sv: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhap ten sv: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap tuoi sv: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh sv (1: Nam, 0: Nu): ");
        this.sex = (scanner.nextLine()).equals("1");
        System.out.println("Nhap dia chi: ");
        this.address = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex?"Nam":"Nu");
        System.out.println(address);
        System.out.println(phoneNumber);
    }
}
