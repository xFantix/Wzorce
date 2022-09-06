import java.util.Collection;

public class Service {

    private ServiceMethod strategy;

    public Service(ServiceMethod strategy) {
        this.strategy = strategy;
    }

    public void send(Collection<Order> orders){
        this.strategy.send(orders);
    }

}
