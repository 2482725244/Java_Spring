package Test;

public class Circle {
    private double radius = 1;
    private double area;
    private double length;

    public void setRadius(double radius) {
        this.radius = radius;
        area =  3.14 * radius * radius;
        length = 3.14 * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }

    public void print(){
        System.out.println(radius +","+ area +","+ length);
    }

    public Circle(double radius) {
        this.radius = radius;
        area =  3.14 * radius * radius;
        length = 3.14 * 2 * radius;
    }
    public Circle() {
        area =  3.14 * radius * radius;
        length = 3.14 * 2 * radius;
    }
}
