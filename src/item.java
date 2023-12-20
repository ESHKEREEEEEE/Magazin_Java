public class item {
    static int total_items_count;
    String name;
    protected float price;
    int discount;
    public item(String name, int price, int discount){
        this.name = name;
        this.discount = discount;
        this.price = price;
        if (!this.name.isEmpty()) {total_items_count++;}
    }
    public item(String name){
        this.name = name;
        if (!this.name.isEmpty()) {total_items_count++;}
    }
    public item(){
        this.name = "";
        this.discount = 0;
        this.price = 0;
    }
    public void print() {
        try {
            System.out.println("Name: " + name + ", Discount: " + discount + ", Price: " + price + ", Total items " + total_items_count);
        } catch (NullPointerException e) {System.out.println("No item");}
    }
    public String get_name() {
        return this.name;
    }
    public float get_price() {
        return this.price;
    }
    public int get_discount() {
        return this.discount;
    }
    public void set_name(String name){
        if (this.name.isEmpty() && !name.isEmpty()) {total_items_count++;}
        this.name = name;
    }
    public void set_price(float price) {
        this.price = price;
    }
    public void set_discount(int discount) {
        this.discount = discount;
    }
    public static int get_total_items_count(){
        return total_items_count;
    }
    public static void item_deleted(){
        total_items_count--;
    }
    public String toString() {
        String item_string;
        if (name.isEmpty()) {item_string = "";}
        else{
            item_string = "Name: " + name +
                    ", Price: " + price +
                    ", Discount: " + discount;
        }
        return item_string;
    }
}


