package book;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-09-03
 * Time: 9:44
 */
public class BookList {

    private int number;
    private Book[] bs = new Book[100];

    public int getNumber(){
        return number;
    }
    public BookList(){
        bs[0] = new Book("java编程思想", "计算机类", 56, "codezhang");
        bs[1] = new Book("c语言编程思想", "计算机类", 53, "codeli");
        bs[2] = new Book("计算机网络基础", "计算机类", 76, "codezhao");
        number = 3;
    }
    public void addBook(String name, String type, int price, String person){
        bs[number] = new Book(name, type, price, person);
        number++;
        System.out.println("添加成功");
    }
    public void delBook(String name){
        int i = 0;
        for(i = 0; i < number; i++){
            if(bs[i].getName().equals(name)){
                for(int j = i; j < number - 1; j++){
                    bs[j].setType(bs[j + 1].getType());
                    bs[j].setPerson(bs[j + 1].getPerson());
                    bs[j].setPrice(bs[j + 1].getPrice());
                    bs[j].setName(bs[j + 1].getName());
                    bs[j] = bs[j + 1];
                }
                number--;
                System.out.println("删除成功");
                break;
            }
        }
        if(i == number){
            System.out.println("输入的名称错误");
        }
    }
    public Book findBook(String name){
        int i = 0;
        for (i = 0; i < number; i++) {
            if(bs[i].getName().equals(name)){
                System.out.println(bs[i]);
                return bs[i];
            }
        }
        return null;
    }
    public void allFindBook(){
        for (int i = 0; i < number; i++) {
            System.out.println(bs[i]);
        }
    }
    public void changeBook(String name, int price){
        int i = 0;
        for (i = 0; i < number; i++) {
            if(bs[i].getName().equals(name)){
                bs[i].setPrice(price);
                System.out.println("修改成功");
                break;
            }
        }
        if(i == number){
            System.out.println("您输入的名称有误");
        }
    }

}

