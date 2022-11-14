package Soo_8_Homework.Challenge;

public class Circle implements Shape {
    int r;
    double area;
    @Override
    public void draw() {
        System.out.print("반지름 " + r);
    }

    @Override
    public double getArea() {
        area = r * r * PI;

        return area;
    }
    
    Circle(int r) {
        this.r = r;
    }
}
