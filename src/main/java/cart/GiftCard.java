package cart;

public class GiftCard {
    private final int value;

    public GiftCard(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "value=" + value +
                '}';
    }
}

