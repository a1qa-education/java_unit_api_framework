package tests;

import api.CreateOrderSteps;
import api.CreatePetSteps;
import api.ReadOrderSteps;
import data.TestDataGenerator;
import models.Pet;
import org.testng.annotations.Test;

public class CreateOrderTest extends BaseTest {
    private final CreatePetSteps createPetSteps = new CreatePetSteps();
    private final CreateOrderSteps createOrderSteps = new CreateOrderSteps();
    private final ReadOrderSteps readOrderSteps = new ReadOrderSteps();

    @Test(description = "Place an order - 200 Success")
    public void placeOrder() {
        int quantity = 1;
        Pet pet = TestDataGenerator.generatePet();

        // TODO: complete the test
    }
}
