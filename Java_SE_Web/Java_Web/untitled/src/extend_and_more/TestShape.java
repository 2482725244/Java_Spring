package extend_and_more;

public class TestShape {
    public static double area;
    public static void countArea(Shape s){
        area += s.getArea();
    }

    public static void main(String[] args) {
        countArea(new Ju(12,13));
        countArea(new SanJiao(2,5));
        countArea(new Ti(2,4,7));
        countArea(new Yuan(5));
        System.out.println(area);
    }

}
