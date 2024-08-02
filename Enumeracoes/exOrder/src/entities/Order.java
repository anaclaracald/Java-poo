package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order");
        sb.append("\nOrder moment: ").append(sdf.format(moment));
        sb.append("\nOrder status: ").append(status);
        sb.append("\nClient: ").append(client.getName()).append(" - ").append(sdf.format(client.getBirthDate())).append(" - ").append(client.getEmail());
        for (OrderItem item : items){
            sb.append("\n").append(item);
        }
        sb.append("\nTotal: ").append(String.format("%.2f", total()));
        return sb.toString();
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double sum = 0;
        for (OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }
}
