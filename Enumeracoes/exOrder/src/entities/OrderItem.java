package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderItem: ");
        sb.append(product.getName());
        sb.append(", Price: ").append(price);
        sb.append(", Quantity:").append(quantity);
        sb.append(", Subtotal: R$").append(String.format("%.2f",subTotal()));
        return sb.toString();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }
}
