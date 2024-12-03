package ClassAndObject;
public class Cylinder {
    private Circle2 circle2;
    private double heiget;

    public void setRadius(double r){
        circle2.setRadius(r);
    }
    public double getRadius(){
        return circle2.getRadius();
    }
    public double getArea(){
        return circle2.getArea();
    }
    public double getTj(){
        return circle2.getArea()*heiget;
    }
    public void print(){
        System.out.println(heiget+getRadius()+getTj()+getArea());
    }

    public Cylinder(Circle2 circle2, double heiget) {
        this.circle2 = circle2;
        this.heiget = heiget;
    }

    public Cylinder() {
        this(new Circle2(),1);
    }
}
