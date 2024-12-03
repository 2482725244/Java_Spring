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
public class AdminPanel extends Panel{
    BookList bks = new BookList();
    Scanner sc = new Scanner(System.in);
    public void print(){
        System.out.println("-->1.查看图书");
        System.out.println("-->2.增加图书");
        System.out.println("-->3.删除图书");
        System.out.println("-->4.修改图书价格");
        System.out.println("-->0.退出系统");
    }
    public void choise(){

        int a = 1;
        String name = null;
        int price = 0;
        String person = null;
        String type = null;
        Book b = null;

        while(a != 0){
            print();
            System.out.println("请做出你的选择");
            a = sc.nextInt();
            switch(a){
                case 1 :
                    System.out.println("现存的所有图书");
                    bks.allFindBook();
                    break;
                case 2 :
                    System.out.println("请输入书籍的名称");
                    name = sc.next();
                    System.out.println("请输入书籍的类型");
                    type = sc.next();
                    System.out.println("请输入书籍的价格");
                    price = sc.nextInt();
                    System.out.println("请输入书籍的作者");
                    person = sc.next();
                    bks.addBook(name, type, price, person);
                    break;
                case 3 :
                    System.out.println("请输入要删除书籍的名字");
                    name = sc.next();
                    bks.delBook(name);
                    break;
                case 0:
                    System.out.println("退出成功");
                    break;
                case 4 :
                    System.out.println("请输入要修改书籍的名字");
                    name = sc.next();
                    System.out.println("请输入你想改的价位");
                    price = sc.nextInt();
                    bks.changeBook(name, price);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
