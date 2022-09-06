import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products = new ArrayList<>();
    private double total;

    private String name;

    public Order(String name){
        name = name;
    }

    public void addProduct(Product prod){
        products.add(prod);
        total = total + prod.getPrice();
    }

    public double getTotalPrice(){
        return total;
    }


}
