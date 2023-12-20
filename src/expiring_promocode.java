import java.util.Arrays;

public class expiring_promocode extends promocode{

    expire expire_date;
    expiring_promocode(){
        super();
        this.expire_date = new expire();
    }
    public expiring_promocode(String code){
        super(code);
        this.items = new item[10];
        this.expire_date = new expire();
    }
    public expiring_promocode(item[] items, String code, expire new_expire, int discount){
        super(items, code, discount);
        this.expire_date = new_expire;
        this.items_counter = items.length;
    }
    public void set_expire_date(expire expire_date){
        this.expire_date = expire_date;
    }
    public expire get_expire_date(){
        return this.expire_date;
    }
    public void print_bez_vizova(){
        System.out.println("Code: " + code + ", Discount:" + discount);
        for (int i = 0; i < this.items_counter; i++) this.items[i].print();
        this.expire_date.print();
    }
    public void print_s_vizovom(){
        this.print();
        this.expire_date.print();
    }
    public String toString() {
        return "Items: " + Arrays.toString(items) +
                ", Code: " + code +
                ", Discount: " + discount +
                ", Expire: " + expire_date;
    }
}
