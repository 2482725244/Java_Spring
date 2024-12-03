package book;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-18
 * Time: 10:34
 */
public class BookList {
    Book[] bl = new Book[100];
    private int number = 3;
    public BookList() {
        bl[0] = new Book("java编程思想", "codezhang", 100, "学习",false);
        bl[1] = new Book("C语言编程思想", "codeli", 130, "学习",false);
        bl[2] = new Book("c++编程思想", "codezhao", 150, "学习",false);
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNuber(){
        return number;
    }
    public void addBook(String name, String person, int price, String type, boolean isBow){
        bl[number] = new Book(name, person, price, type, isBow);
        number++;
    }
    public void delBook(String name){
        for (int i = 0; i < number - 1; i++) {
            if(bl[i].getName().equals(name)){
                int p = number;
                for (int j = 0; j < p - 1 - i; j++) {
                    bl[i] = bl[i+1];
                    i++;
                    number--;
                }
            }
        }
    }
    public void find(String name){
        for (int i = 0; i < number; i++) {
            if(bl[i].getName().equals(name)){
                System.out.println(bl[i].toString());
            }
        }
    }
    public void bow(String name){
        for (int i = 0; i < number - 1; i++) {
            if(bl[i].getName().equals(name)){
                bl[i].setState(true);
                break;
            }
        }
        System.out.println("借阅成功");
    }
    public void back(String name){
        for (int i = 0; i < number - 1; i++) {
            if(bl[i].getName().equals(name)){
                bl[i].setState(false);
                break;
            }
        }
        System.out.println("归还成功");
    }
    @Override
    public String toString() {
        return "BookList{" +
                "bl=" + Arrays.toString(bl) +
                '}';
    }
}
