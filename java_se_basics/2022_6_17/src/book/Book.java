package book;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-17
 * Time: 21:00
 */
public class Book {
    private String name;
    private String person;
    private int price;
    private String type;
    private boolean state;

    public Book(String name, String person, int price, String type, boolean isBow){
        this.name = name;
        this.person = person;
        this.type = type;
        this.state = isBow;
        this.price = price;
    }

    public void setName(String name) {

        this.name = name;
    }
    public String getName() {

        return name;
    }

    public String getPerson(){

        return person;
    }
    public void setPerson(String person){

        this.person = person;
    }

    public boolean isState(){

        return state;
    }
    public void setState(boolean state){

        this.state = state;
    }

    public void setPrice(int price){

        this.price = price;
    }
    public int getPrice(){

        return price;
    }

    public void setType(String type){

        this.type = type;
    }
    public String getType(){

        return type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", person='" + person + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", state=" + state +
                '}';
    }
}
