package Test;

public class MyDate {
    private int year = 1999;
    private int month = 1;
    private int day = 1;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public boolean isRunyear() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
    public void print(){
        System.out.println(year+"."+month+"."+day);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate() {

    }

}
