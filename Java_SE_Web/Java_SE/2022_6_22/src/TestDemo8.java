import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with Intellij IDEA.
 * Description:对于学生集合的创建和遍历
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 19:22
 */
class Student {
    String name;
    int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class TestDemo8 {
    public static void main(String[] args) {
        Collection<Student> arr = new ArrayList<Student>();
        Student s1 = new Student("张三",16);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Iterator<Student> it = arr.iterator();
        while(it.hasNext()){
//            Student s =it.next();
            System.out.println(it.next());
        }
    }
}
