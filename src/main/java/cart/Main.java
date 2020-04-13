package cart;

import product.Product;

import java.time.Duration;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct (new Product("1",20, Collections.emptyList(), Duration.ZERO), 10);
        Summary summary = cart.getSummary();
        System.out.println(summary);
    }
}

