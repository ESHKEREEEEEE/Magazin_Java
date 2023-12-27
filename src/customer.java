public class customer extends person implements buying {
    int money;
    public customer(String name, int age, Object id, int money) {
        super(name, age, id);
        this.money = money;
    }
    public int get_money(){
        return money;
    }
    public void set_money(int money){
        this.money = money;
    }
    public void buy(item item_to_buy){
        this.money -= (int) item_to_buy.get_price();
    }
    public String toString() {
        return name + ": Age " + age + ", ID " + id + ", Money " + money;
    }
}
