package user;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-09-03
 * Time: 10:05
 */
public class UserPanel extends Panel{
    Scanner sc = new Scanner(System.in);
    BookList bks = new BookList();
    public void print(){
        System.out.println("-->1.查看图书");
        System.out.println("-->2.借阅图书");
        System.out.println("-->3.归还图书");
        System.out.println("-->0.退出系统");
    }
    public void choise(){

        int a = 1;
        String name = null;
        Book b = null;

        while(a != 0){
            print();
            System.out.println("请做出你的选择");
            a = sc.nextInt();
            switch(a){
                case 1 :
                    bks.allFindBook();
                    break;
                case 2 :
                    System.out.println("请输入你要借的书名字");
                    name = sc.next();
                    b = bks.findBook(name);
                    if(b.isState() == true){
                        System.out.println("借阅失败，该书已被借出");
                        break;
                    } else {
                        b.setState(true);
                        System.out.println("借阅成功");
                        break;
                    }
                case 3 :
                    System.out.println("请输入你要归还的书名字");
                    name = sc.next();
                    b = bks.findBook(name);
                    b.setState(false);
                    System.out.println("归还成功");
                    break;
                case 0:
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
