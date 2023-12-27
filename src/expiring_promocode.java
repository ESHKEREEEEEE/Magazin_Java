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
        StringBuilder shop_string = new StringBuilder("Code: " + code + ", Discount" + discount + ", Expire: " + expire_date + ", Items :\n");
        for (int i = 0; i < items_counter; i++)
        {
            shop_string.append(items[i].toString());
            shop_string.append("\n");
        }
        return shop_string.toString();
    }
}
