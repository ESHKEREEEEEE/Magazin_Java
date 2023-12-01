
public class Main {
    public static void main(String[] args) {
        //TEST OF ITEM METHODS
        item item1 = new item("eshkere", 1, 1);
        item1.print();
        item item2 = new item("bebra");
        item item3 = new item();
        System.out.println(item2.get_name());
        System.out.println(item2.get_price());
        System.out.println(item2.get_discount());
        item3.set_name("kapec");
        item3.set_price(10);
        item3.set_discount(10);
        item3.print();
        //TEST OF SHOP METHODS
        item[] items = new item[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        shop shop1 = new shop("maria-ra", items);
        shop shop2 = new shop("fix-price");
        shop shop3 = new shop();
        System.out.println(shop1.get_name());
        System.out.println(shop1.get_items_counter());
        shop3.set_name("aboba");
        shop3.set_items(shop1.get_items());
        shop3.print();
        shop2.add_item(item1);
        shop2.print();
        shop2.delete_item(0);
        shop2.print();
        //TEST OF EXPIRE METHODS
        expire expire1 = new expire(1,1,1,1,1,1);
        System.out.println(expire1.get_day());
        System.out.println(expire1.get_month());
        System.out.println(expire1.get_year());
        System.out.println(expire1.get_hour());
        System.out.println(expire1.get_minute());
        System.out.println(expire1.get_second());
        expire1.set_day(16);
        expire1.set_month(12);
        expire1.set_year(2003);
        expire1.set_hour(11);
        expire1.set_minute(11);
        expire1.set_second(11);
        expire1.print();
        //TEST OF PROMOCODE METHODS
        promocode promocode1 = new promocode(items, "zxc", expire1, 2);
        promocode promocode2 = new promocode("qwe");
        promocode promocode3 = new promocode();
        promocode3.set_code(promocode1.get_code());
        promocode3.set_items(promocode1.get_items());
        promocode3.set_expire_date(promocode1.get_expire_date());
        promocode3.set_discount(promocode1.get_discount());
        System.out.println(promocode3.get_items_counter());
        promocode2.add_item(item1);
        promocode2.print();
        promocode2.delete_item(0);
        promocode2.print();
        //TEST OF SALE METHODS
        sale sale1 = new sale("hype", items);
        sale sale2 = new sale("vibe");
        sale sale3 = new sale();
        sale3.set_items(sale1.get_items());
        sale3.set_text(sale1.get_text());
        System.out.println(sale3.get_items_counter());
        sale2.add_item(item1);
        sale2.print();
        sale2.delete_item(0);
        sale2.print();
        //vivod cherez vspomog class
        item1.print();
        int int_price = vspomog.get_int_price(item1);
        System.out.println(int_price);
        }
    }
