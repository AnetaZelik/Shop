package cart;

import product.AdditionalService;
import product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CartItem> items;
    int totalPrice;
    GiftCard giftCard;
    int leftToPay;
    Delivery delivery;
    LocalDate expectedShippingDate;
    LocalDate expectedDeliveryDate;

    public ShoppingCart() {
        this.items = new ArrayList<CartItem>(){};
        this.totalPrice = 0;
        this.giftCard = new GiftCard(0);
        this.leftToPay = 0;
        this.delivery = null;
        this.expectedShippingDate = null;
        this.expectedDeliveryDate = null;
    }

    public Summary getSummary() {
        List<CartItem> shoppingCartSummaryItems = this.items;
        int shoppingCartSummaryPrice = this.totalPrice;
        GiftCard shoppingCartSummaryGiftCard = this.giftCard;
        int shoppingCartSummaryLeftToPay = this.leftToPay;
        Delivery shoppingCartSummaryDelivery = this.delivery;
        LocalDate shoppingCartSummaryShippingDate = this.expectedShippingDate;
        LocalDate shoppingCartSummaryDeliveryDate = this.expectedDeliveryDate;

        Summary shoppingCartSummary = new Summary(
                shoppingCartSummaryItems,
                shoppingCartSummaryPrice,
                shoppingCartSummaryGiftCard,
                shoppingCartSummaryLeftToPay,
                shoppingCartSummaryDelivery,
                shoppingCartSummaryShippingDate,
                shoppingCartSummaryDeliveryDate);
        return shoppingCartSummary;
    }

    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, product.getServices(), quantity, product.getPrice());
        this.items.add(cartItem);
    }

    public void removeProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, product.getServices(), quantity, product.getPrice());
        this.items.remove(cartItem);
    }

    public void addExtraService(Product product, AdditionalService service) {
        product.getServices().add(service);
    }

    public void removeExtraService(Product product, AdditionalService service) {
        product.getServices().remove(service);
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;

    }

    public void addGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                ", totalPrice=" + totalPrice +
                ", giftCard=" + giftCard +
                ", leftToPay=" + leftToPay +
                ", delivery=" + delivery +
                ", expectedShippingDate=" + expectedShippingDate +
                ", expectedDeliveryDate=" + expectedDeliveryDate +
                '}';
    }
}
