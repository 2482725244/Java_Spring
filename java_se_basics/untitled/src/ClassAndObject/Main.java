package ClassAndObject;

public class Main extends Object{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三",1989,7,7);
        s1.print();
        s2.print();
        Student s3 = new Student("张三",new MyDate());
        Student s4 = new Student("张三",new MyDate(2009,4,1));
        s3.print();
        s4.print();
    }
}
