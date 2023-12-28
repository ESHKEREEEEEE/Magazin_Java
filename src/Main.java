import javax.management.InvalidAttributeValueException;
import java.util.Comparator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Comparator<promocode> comparator = (o1, o2) -> {
            if (o1.get_discount() != o2.get_discount()) {
                return Integer.compare(o1.get_discount(), o2.get_discount());
            } else {
                return o1.get_code().compareTo(o2.get_code());}
        };
        //TEST OF ITEM METHODS
        item item1 = new item("eshkere", 1, 1);
        System.out.println(item1);
        item item2 = new item("bebra");
        item item3 = new item();
        System.out.println(item2.get_name());
        System.out.println(item2.get_price());
        System.out.println(item2.get_discount());
        item3.set_name("kapec");
        item3.set_price(10);
        item3.set_discount(10);
        item3.print();
        System.out.println(item3);
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
        System.out.println(shop3);
        shop2.add_item(item1);
        System.out.println(shop2);
        shop2.delete_item(0);
        System.out.println(shop2);
        //TEST OF EXPIRE METHODS
        try {
            expire expire1 = new expire(1,1,1,100,1,1);
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
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
            System.out.println("GOD DAMN");
        }

        //TEST OF SALE METHODS
        sale sale1 = new sale("hype", items);
        sale sale2 = new sale("vibe");
        sale sale3 = new sale();
        sale3.set_items(sale1.get_items());
        sale3.set_text(sale1.get_text());
        System.out.println(sale3.get_items_counter());
        sale2.add_item(item1);
        System.out.println(sale2);
        sale2.delete_item(0);
        System.out.println(sale2);
        //vivod cherez vspomog class
        System.out.println(item1);
        int int_price = vspomog.get_int_price(item1);
        System.out.println(int_price);
        //dvumernie massivi
        item[][] itemarr = new item[2][2];
        itemarr[0][0] = item1;
        itemarr[0][1] = item2;
        itemarr[1][0] = item3;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                try {
                    System.out.println(itemarr[i][j]);
                } catch (NullPointerException e) {System.out.println("No item");}
            }
        }
        //cloning
        //deep
        shop shop4;
        shop4 = shop1.clone();
        shop4.set_name("cloned");
        System.out.println(shop1);
        System.out.println(shop4);
        //small
        item item4;
        item4 = item1.clone();
        item4.set_name("cloned");
        System.out.println(item1);
        System.out.println(item4);
        //interfaces
        customer customer1 = new customer("Serega", 54, 1, 10000);
        customer1.buy(item1);
        System.out.println(customer1);
        //expiring promocode
        try {
            expiring_promocode exp_pr1 = new expiring_promocode(items, "hihihi", new expire(1,1,1,1,1,1), 10);
            exp_pr1.print_bez_vizova();
            exp_pr1.print_s_vizovom();
        } catch (InvalidAttributeValueException e) {
            System.out.println("GOD_DAMN");
        }
        promocode promocode1 = new promocode("pudge");
        promocode promocode2 = new promocode("techies");
        expiring_promocode promocode3 = new expiring_promocode("sniper");
        //контейнеры
        Vector<promocode> v1 = new Vector<>();
        v1.add(promocode1);
        v1.add(promocode2);
        v1.add(promocode3);
        //поиск
        if (v1.contains(promocode2)) {System.out.println("found"); System.out.println(promocode2);}
        //сортировка
        System.out.println(v1);
        v1.sort(comparator);
        System.out.println(v1);
    }



}
