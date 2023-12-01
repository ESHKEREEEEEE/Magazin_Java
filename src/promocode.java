public class promocode {
    item[] items;
    String code;
    expire expire_date;
    int items_counter;
    int discount;
    public promocode(){
        this.code = "";
        this.items = new item[10];
        this.expire_date = new expire();
    }
    public promocode(String code){
        this.code = code;
        this.items = new item[10];
        this.expire_date = new expire();
    }
    public promocode(item[] items, String code, expire new_expire, int discount){
        this.code = code;
        this.items = items;
        this.discount = discount;
        this.expire_date = new_expire;
        this.items_counter = items.length;
    }
    public String get_code(){
        return this.code;
    }
    public item[] get_items(){
        return this.items;
    }
    public int get_discount(){
        return this.discount;
    }
    public int get_items_counter(){
        return this.items_counter;
    }
    public expire get_expire_date(){
        return this.expire_date;
    }
    public void set_code(String code){
        this.code = code;
    }
    public void set_discount(int discount){
        this.discount = discount;
    }
    public void set_expire_date(expire expire_date){
        this.expire_date = expire_date;
    }
    public void set_items(item[] new_items){
        this.items = new_items;
        this.items_counter = new_items.length;
    }
    public void add_item(item new_item){
        this.items[this.items_counter] = new_item;
        this.items_counter++;
    }
    public void delete_item(int item_number){
        for (int i = item_number; i<this.items_counter; i++) this.items[i] = this.items[i + 1];
        this.items_counter--;
        item.item_deleted();
    }
    public void print(){
        System.out.println("Code: " + code + ", Discount:" + discount);
        for (int i = 0; i < this.items_counter; i++) this.items[i].print();
        this.expire_date.print();
    }
}
