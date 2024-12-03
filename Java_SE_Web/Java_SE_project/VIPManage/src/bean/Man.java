package bean;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 10:06
 */
public class Man {

    private int id;
    private int state;
    private String name;
    private String sex;
    private int age;
    private String user;
    private String passWord;

    public Man(){

    }

    public Man(String name, String sex, int age, String user, String passWord,int state) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.user = user;
        this.passWord = passWord;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "人员{" +
                "id=" + id +
                ", 会员状态=" + state +
                ", 姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 年龄=" + age +
                ", 账号='" + user + '\'' +
                ", 密码='" + passWord + '\'' +
                '}';
    }
}
