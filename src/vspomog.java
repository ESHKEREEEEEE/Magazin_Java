public class vspomog extends item{
    public static int get_int_price(item item_to_get){
        int int_price = Math.round(item_to_get.price);
        return int_price;
    }
}
