package extend_and_more;

public class Yuan extends Shape{
    double area;
    @Override
    public double getArea() {
        return area;
    }

    public Yuan(double r) {
        area =3.14*r*r;
    }
}
