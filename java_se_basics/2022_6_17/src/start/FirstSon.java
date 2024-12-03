package start;

import book.BookList;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-18
 * Time: 8:47
 */
public class FirstSon extends Face{
    public void display(){
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.查看现有图书");
        System.out.println("0.退出系统");
    }
    public void menu(int ps){
        Scanner sc = new Scanner(System.in);
        String bookName = null;
        switch (ps){
            case 1:
                System.out.println("请输入书的名字");
                bookName = sc.nextLine();
                find(bookName);
                break;
            case 2:
                System.out.println("请输入书的名字");
                bookName = sc.nextLine();
                bow(bookName);
                break;
            case 3:
                System.out.println("请输入书的名字");
                bookName = sc.nextLine();
                back(bookName);
                break;
            case 4:
                alldisplay();
                break;
            case 0:
                break;
        }
    }
    BookList bs = new BookList();
    private void find(String bookName){
        bs.find(bookName);
    }
    private void bow(String bookName){
        bs.bow(bookName);
    }
    private void back(String bookName){
        bs.delBook(bookName);
    }
    private void alldisplay(){
        System.out.println(bs.toString());
    }
}
