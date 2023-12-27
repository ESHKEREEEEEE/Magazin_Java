public class promocode {
    item[] items;
    String code;
    int items_counter;
    int discount;
    public promocode(){
        this.code = "";
        this.items = new item[10];
    }
    public promocode(String code){
        this.code = code;
        this.items = new item[10];
    }
    public promocode(item[] items, String code, int discount){
        this.code = code;
        this.items = items;
        this.discount = discount;
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
    public void set_code(String code){
        this.code = code;
    }
    public void set_discount(int discount){
        this.discount = discount;
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
    }
    public String toString() {
        StringBuilder shop_string = new StringBuilder("Code: " + code + ", Discount" + discount + ", Items :\n");
        for (int i = 0; i < items_counter; i++)
        {
            shop_string.append(items[i].toString());
            shop_string.append("\n");
        }
        return shop_string.toString();
    }
}
