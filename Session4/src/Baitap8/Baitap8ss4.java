package Baitap8;

public class Baitap8ss4 {
    public static void main(String[] args) {
        Employee nv1 = new Employee();
        Employee nv2 = new Employee("NV002","Nguyen Van B",20,false,2, 1300000);
        Employee nv3 = new Employee();
        nv3.inputData();
        nv1.displayData();
        nv2.displayData();
        nv3.displayData();
    }
}
