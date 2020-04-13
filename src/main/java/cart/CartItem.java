package cart;

import product.AdditionalService;
import product.Product;

import java.util.List;

public class CartItem {
    Product product;
    List<AdditionalService> additionalServices;
    int quantity;
    int price; // <- hint: calkowita cena, czyli: (cena produktu + ceny uslug dodatkowych) * liczba sztuk

    public CartItem(Product product, List<AdditionalService> additionalServices, int quantity, int price) {
        this.product = product;
        this.additionalServices = additionalServices;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public List<AdditionalService> getAdditionalServices() {
        return additionalServices;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", additionalServices=" + additionalServices +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
