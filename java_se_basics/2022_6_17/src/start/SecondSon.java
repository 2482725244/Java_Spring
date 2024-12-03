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
public class SecondSon extends Face{
    public void display(){
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示全部图书");
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
                    System.out.println("请输入书的全部属性");
                    bookName = sc.nextLine();
                    String person = sc.next();
                    int price = sc.nextInt();
                    String type = sc.next();
                    boolean isBow = false;
                    add(bookName, person,price,type,isBow);
                    break;
                case 3:
                    System.out.println("请输入书的名字");
                    bookName = sc.nextLine();
                    del(bookName);
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
    private void add(String bookName, String person, int price, String type, boolean isBow){
        bs.addBook(bookName, person,price,type,isBow);
    }
    private void del(String bookName){
        bs.delBook(bookName);
    }
    private void alldisplay(){
        System.out.println(bs.toString());
    }
}
