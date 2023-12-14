public class shop {
    String name;
    item[] items;
    int items_counter;
    public shop(String name){
        this.name = name;
        this.items = new item[10];
    }
    public shop(String name, item[] items){
        this.name = name;
        this.items = items;
        this.items_counter = this.items.length;
    }
    public shop(){
        this.name = "";
        this.items_counter = 0;
        this.items = new item[10];
    }
    public String get_name(){
        return this.name;
    }
    public item[] get_items(){
        return this.items;
    }
    public int get_items_counter(){
        return this.items_counter;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void set_items(item[] items){
        this.items = items;
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
        try{
        System.out.println("Name: " + name);
        for (int i = 0; i < this.items_counter; i++) this.items[i].print();}
        catch (NullPointerException ignored) {}
    }
}
