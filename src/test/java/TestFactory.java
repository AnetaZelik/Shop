import product.AdditionalService;
import product.Product;

import java.time.Duration;
import java.util.List;

public class TestFactory {
    static Product anOffer(String offerId, int price, List<AdditionalService> services, Duration expectedSendingTime) {
        return new Product(offerId, price, services, expectedSendingTime);
    }

}
