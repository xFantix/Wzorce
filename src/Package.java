import java.util.Collection;

public class Package implements ServiceMethod {
    @Override
    public void send(Collection<Order> orders) {
        System.out.println("Produkt wyslano paczka");
    }
}
