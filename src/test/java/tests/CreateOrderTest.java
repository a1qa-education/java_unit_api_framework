package tests;

import api.OrderSteps;
import data.TestDataGenerator;
import models.Pet;
import org.testng.annotations.Test;

public class CreateOrderTest extends BaseTest {
    private final OrderSteps orderSteps = new OrderSteps();

    @Test(description = "Place an order - 200 Success")
    public void placeOrder() {
        int quantity = 1;
        Pet pet = TestDataGenerator.generatePet();

        // TODO: complete the test
    }
}
