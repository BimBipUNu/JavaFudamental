package Baitap2;

public class QuadraticEquation {
    private double a, b, c;

    //Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Getter, Setter
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    //method
    public double getDiscriminant() {
        if(a == 0) {
            System.out.println("Khong phai phuong trinh bac 2 (a = 0)");
            return -1;//Khong phai phuong trinh bac 2
        }
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
    }
    public double getRoot() {
        if(getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem");
            return 1;
        }else if(getDiscriminant() == 0) {
            System.out.println("Phuong trinh co nghiem kep: " + getRoot1());
            return 1;
        }else if(getDiscriminant() > 0){
            System.out.println("Phuong trinh có 2 nghiem phan biet: x1 = " + getRoot1() + " , x2 = " + getRoot2());
            return 1;
        }else {
            System.out.println("Khong co nghiem do khong phai phuong trinh bac 2");
            return 0;
        }
    }
}
