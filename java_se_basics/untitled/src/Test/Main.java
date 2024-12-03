package Test;

import Test.Circle;

public class Main {
    public static void main1(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(100);
        circle1.print();
        circle2.print();
        double tmp = circle1.getRadius();
        circle1.setRadius(circle2.getRadius());
        circle2.setRadius(tmp);
        circle1.print();
        circle2.print();
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(2009,4,1);
        d1.print();
        d2.print();
        d2.setYear(d1.getYear());
        d1.setMonth(d2.getMonth());
        d1.print();
        d2.print();
    }
}