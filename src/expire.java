import javax.management.InvalidAttributeValueException;

public class expire {
    int day;
    int month;
    int year;
    int second;
    int minute;
    int hour;
    //public expire(int day){this.day = day;}
    public expire(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public expire(int day, int month, int year, int hour, int minute, int second) throws InvalidAttributeValueException {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if (this.day < 0 || this.day > 31) {throw new InvalidAttributeValueException("Day needs to be less than 31 and more than 0");}
        if (this.month < 0 || this.month > 12) {throw new InvalidAttributeValueException("Month needs to be less than 12 and more than 0");}
        if (this.hour < 0 || this.hour > 23) {throw new InvalidAttributeValueException("Hour needs to be less than 23 and more than 0");}
        if (this.minute < 0 || this.minute > 59) {throw new InvalidAttributeValueException("Minute needs to be less than 59 and more than 0");}
        if (this.second < 0 || this.second > 59) {throw new InvalidAttributeValueException("Second needs to be less than 59 and more than 0");}
    }

    public void print(){
        System.out.println(day + "/" + month + "/" + year + " " + second + ":" + minute + ":" + hour);
    }
    public int get_day(){
        return this.day;
    }
    public int get_month(){
        return this.month;
    }
    public int get_year(){
        return this.year;
    }
    public int get_second(){
        return this.second;
    }
    public int get_minute(){
        return this.minute;
    }
    public int get_hour(){
        return this.hour;
    }
    public void set_day (int day) throws InvalidAttributeValueException{
        this.day = day;
        if (this.day < 0 || this.day > 31) {throw new InvalidAttributeValueException("Day needs to be less than 31 and more than 0");}
    }
    public void set_month(int month) throws InvalidAttributeValueException{
        this.month = month;
        if (this.month < 0 || this.month > 12) {throw new InvalidAttributeValueException("Month needs to be less than 12 and more than 0");}
    }
    public void set_year(int year){
        this.year = year;
    }
    public void set_second(int second) throws InvalidAttributeValueException{
        this.second = second;
        if (this.second < 0 || this.second > 59) {throw new InvalidAttributeValueException("Second needs to be less than 59 and more than 0");}
    }
    public void set_minute(int minute) throws InvalidAttributeValueException{
        this.minute = minute;
        if (this.minute < 0 || this.minute > 59) {throw new InvalidAttributeValueException("Minute needs to be less than 59 and more than 0");}
    }
    public void set_hour(int hour) throws InvalidAttributeValueException{
        this.hour = hour;
        if (this.hour < 0 || this.hour > 23) {throw new InvalidAttributeValueException("Hour needs to be less than 23 and more than 0");}
    }
    public String toString() {
        return  day +
                "/" + month +
                "/" + year +
                " " + hour +
                ":" + minute +
                ":" + second;
    }
}
