package Baitap8;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;// Nam = true || nu = false
    private float rate;
    private double salary;

    //Constructor
    public Employee() {
    }
    public Employee(String employeeId, String employeeName, int age, boolean gen, float rare, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rare;
        this.salary = salary;
    }
    //Method
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID Nhan vien:");
        this.employeeId = scanner.nextLine();
        System.out.println("Nhap ten Nhan vien:");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhap tuoi Nhan vien:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh Nhan vien (1: Nam, 0: Nu):");
        this.gen = (scanner.nextLine()).equals("1");
        System.out.println("Nhap he so luong:");
        this.rate = Long.parseLong(scanner.nextLine());
        calSalary();
        scanner.close();
    }

    public void displayData() {
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gen? "Nam" : "Nu");
        System.out.println(rate);
        System.out.println(salary);
    }

    public void calSalary() {
        this.salary = this.rate * 1300000;
    }
}
