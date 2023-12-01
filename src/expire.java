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
    public expire(int day, int month, int year, int hour, int minute, int second){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
    public void set_day(int day){
        this.day = day;
    }
    public void set_month(int month){
        this.month = month;
    }
    public void set_year(int year){
        this.year = year;
    }
    public void set_second(int second){
        this.second = second;
    }
    public void set_minute(int minute){
        this.minute = minute;
    }
    public void set_hour(int hour){
        this.hour = hour;
    }
}
