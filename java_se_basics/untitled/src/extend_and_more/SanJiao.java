package extend_and_more;

public class SanJiao extends Shape{
    double area;
    @Override
    public double getArea() {
        return area;
    }

    public SanJiao(double s,double h) {
        area = 1/2.0*s*h;
    }
}
