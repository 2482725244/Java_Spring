/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * 主题：Cloneable
 * Date: 2022-04-29
 * Time: 17:37
 */


class Students implements Cloneable {
    public int a = 6;
//    public String name;
    Moeny m = new Moeny();
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Students p1 = (Students) super.clone();
        p1.m = (Moeny)this.m.clone();
        return p1;
    }
}
class Moeny extends Students implements IFA {
    public int b = 9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void fy() {

    }
}

interface IRuning1 {
    void flg();
}
interface IFA1 {
    void fy();
}
interface IFuBei1 {
    public static final int a = 10;
    public abstract void fx();
}

interface XiaoBei extends IFuBei1,IFA1 {

}

public class TextDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Students s1 = new Students();
//        Students s2 = (Students)s1.clone();
//        System.out.println(s1.m.b);
//        System.out.println(s2.m.b);
//        System.out.println("---------");
//        s2.m.b = 3;
//        System.out.println(s1.m.b);
//        System.out.println(s2.m.b);
//        System.out.println(s1.a);
//        System.out.println(s2.a);
//        s1.a = 5;
//        System.out.println("--------------");
//        System.out.println(s1.a);
//        System.out.println(s2.a);
//        System.out.println(s1.m.b);
//        System.out.println(s1.m.b);
//        System.out.println("---------");
//        s2.m.b = 3;
//        System.out.println(s1.m.b);
//        System.out.println(s1.m.b);

    }
}
