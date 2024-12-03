package extend_and_more;

public class Ti extends Shape{
    double area;
    @Override
    public double getArea() {
        return area;
    }

    public Ti(double a,double b,double h) {
        this.area = (a+b)*h/2.0;
    }
}
