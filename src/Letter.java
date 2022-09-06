import java.util.Collection;

public class Letter implements ServiceMethod {

    @Override
    public void send(Collection<Order> orders) {
        System.out.println("Wyslanie produktu przez List");
    }
}
