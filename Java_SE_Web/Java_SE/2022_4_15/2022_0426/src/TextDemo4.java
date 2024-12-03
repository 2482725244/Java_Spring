/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * 主题；比较-接口的应用
 * Date: 2022-04-27
 * Time: 17:39
 */

import java.util.Arrays;

class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int cj;

    public Student(int age, String name, int cj) {
        this.age = age;
        this.name = name;
        this.cj = cj;
    }

    @Override
    public int compareTo(Student o) {
        if(this.cj > o.cj) {
            return 1;
        } else if (this.cj < o.cj) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cj=" + cj +
                '}';
    }
}


public class TextDemo4 {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 7, 2, 5, 89, 2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        Student s1 = new Student(18,"ZhangSan",65);
        Student s2 = new Student(23,"LiSi",78);
        Student s3 = new Student(15,"WuangWu",90);
        Student[] arr = {s1, s2, s3};
//        if(s1.compareTo(s2) > 0) {
//            System.out.println("s1 > s2");
//        } else if(s1.compareTo(s2) < 0) {
//            System.out.println("s1 < s2");
//        } else {
//            System.out.println("s1 = s2");
//        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
