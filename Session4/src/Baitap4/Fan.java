package Baitap4;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //Constructor
    public Fan() {
    }
    //getter,setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //method
    public String toString() {
        if(on) {
            return "Fan[speed= " + speed + " , color= " + color + ", radius= " + radius + ", Fan is on]";
        }else {
            return "Fan[speed= " + speed + " , color= " + color + ", radius= " + radius + ", Fan is off]";
        }
    }
}
