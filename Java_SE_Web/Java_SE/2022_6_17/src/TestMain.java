import book.Book;
import start.*;

import java.util.Scanner;
/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-17
 * Time: 20:59
 */

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = sc.nextLine();
        System.out.println("欢迎" + name + "进入图书管理系统");
        System.out.println("请选择你的身份");
        System.out.println("1.普通用户 2.管理员");
        int choose = sc.nextInt();
        Face fc = null;
        if(choose == 1){
            fc = new FirstSon();
        } else{
            fc = new SecondSon();
        }
        fc.display();
        int ps = sc.nextInt();
        while(ps != 0){
            fc.menu(ps);
            fc.display();
            ps = sc.nextInt();
        }
    }
}
