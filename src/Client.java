import java.util.ArrayList;
import java.util.List;

public class Client {

    private static List<Order> orders = new ArrayList<>();

    public static void main(String[] args){

        Order order1 = new Order("order1");
        order1.addProduct(new Product("Komputer", 3000));
        order1.addProduct(new Product("Myszka",30));

        orders.add(order1);

        Service shipingService = new Service(new Letter());
        shipingService.send(orders);

    }

}
