import entities.Client;
import entities.OrderItem;
import entities.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> itens = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public Double total(){
        return null;
    }
}
