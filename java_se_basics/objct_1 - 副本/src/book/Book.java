package book;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-09-03
 * Time: 9:45
 */
public class Book {
    private int price;
    private String name;
    private String type;
    private boolean state;
    private String person;


    public Book(String name, String type, int price, String person){
        this.name = name;
        this.person = person;
        this.price = price;
        this.type = type;
    }
    public Book(){

    }

    public void revBook(String name, String type, int price, String person){
        this.name = name;
        this.person = person;
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "书籍{" +
                "书籍价格-->$" + price +
                ", 书籍名称《'" + name + "》" + '\'' +
                ", 书籍类型-->'" + type + '\'' +
                ", 是否被借出-->" + state +
                ", 书籍作者-->'" + person + '\'' +
                '}';
    }
}
