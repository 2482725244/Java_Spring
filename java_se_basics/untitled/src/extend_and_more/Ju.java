package extend_and_more;

public class Ju extends Shape{

    double area;
    @Override
    public double getArea() {
        return area;
    }

    public Ju(double a,double b) {
        area = a*b;
    }
}
