import java.util.Arrays;

public class sale {
    item[] items;
    String text;
    int items_counter;
    public sale(){
        this.items = new item[10];
    }
    public sale(String text){
        this.text = text;
        this.items = new item[10];
    }
    public sale(String text, item[] items){
        this.text = text;
        this.items = items;
        this.items_counter = this.items.length;
    }
    public String get_text(){
        return this.text;
    }
    public item[] get_items(){
        return this.items;
    }
    public void set_text(String text){
        this.text = text;
    }
    public void set_items(item[] items){
        this.items = items;
        this.items_counter = items.length;
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
    public int get_items_counter(){
        return this.items_counter;
    }
    public void print(){
        System.out.println("Text: " + text);
        for (int i = 0; i < this.items_counter; i++) this.items[i].print();
    }
    public String toString() {
        return  "Items: " + Arrays.toString(items) +
                ", Text:" + text;
    }
}
