package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private List<Product> products = new ArrayList<>();

    public Double subTotal(){
        return null;
    }
}
