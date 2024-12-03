/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * 主题：接口
 * Date: 2022-04-27
 * Time: 17:08
 */

interface IRuning {
    void flg();
}
interface IFA {
    void fy();
}
interface IFuBei {
    public static final int a = 10;
    public abstract void fx();
}

class QingWa implements IFuBei,IFA{
    @Override
    public void fx() {
        System.out.println("I am QingWa");
    }

    @Override
    public void fy() {
        System.out.println("I am Swim");
    }
}

class Fash implements IFuBei{
    @Override
    public void fx() {
        System.out.println("I am Fash");
    }
}

class Cat implements IFuBei{
    @Override
    public void fx() {
        System.out.println("I am Cat");
    }
}

class Dog implements IRuning {
    public String name = "Dog";

    @Override
    public void flg() {
        System.out.println(this.name + " Zai Pao!");
    }
}

class Pig implements IRuning {
    public String name = "Pig";

    @Override
    public void flg() {
        System.out.println(this.name + " Zai Pao!");
    }
}

public class TextDemo3 {
    public static void main(String[] args) {
//        IFuBei s1 = new QingWa();
//        IFuBei s2 = new Fash();
//        IFuBei s3 = new Cat();
//        jk(s1);
//        jk(s2);
//        jk(s3);
//        IFuBei s1 = new IFuBei();
//        IFA s1 = new QingWa();
//        s1.fy();

//        IRuning s1 = new Dog();
//        s1.flg();

        Pig s1 = new Pig();
        s1.flg();
    }
    public static void jk(IFuBei s) {
        s.fx();
    }
}
