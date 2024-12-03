package ClassAndObject;


public class Student {
    private String name;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    public void print(){
        System.out.println(name+birthday);
    }

    public Student(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Student(String name, int y,int m,int d) {
        this.name = name;
        this.birthday = new MyDate(y,m,d);
    }

    public Student() {
        this("default",1999,1,1);
    }
}
