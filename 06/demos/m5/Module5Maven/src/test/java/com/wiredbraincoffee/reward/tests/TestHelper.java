package com.wiredbraincoffee.reward.tests;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardService;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("Interface")
public interface TestHelper {

    RewardService getRewardService();

    @Test
    @DisplayName("Correct points are set")
    default void correctPoints() {
        assertEquals(100, getRewardService().getNeededPoints());
    }

    default List<Product> getEmptyOrder() {
        return Arrays.asList();
    }

    default List<Product> getSampleOrder() {
        Product bigDecaf = new Product(2, "Big Decaf", 2.49);
        Product bigLatte = new Product(3, "Big Latte", 2.99);
        Product bigTea = new Product(4, "Big Tea", 2.99);
        Product espresso = new Product(5, "Espresso", 2.99);
        return Arrays.asList(
                bigDecaf, bigLatte, bigTea, espresso);
    }
}
