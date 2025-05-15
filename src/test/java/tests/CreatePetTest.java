package tests;

import api.CreatePetSteps;
import api.ReadPetSteps;
import api.UpdatePetSteps;
import data.TestDataGenerator;
import models.Pet;
import org.testng.annotations.Test;

public class CreatePetTest extends BaseTest {
    private static final String ALLOW_METHODS_HEADER = "Access-Control-Allow-Methods";
    private static final String DELETE_METHOD = "DELETE";
    private final CreatePetSteps createPetSteps = new CreatePetSteps();
    private final UpdatePetSteps updatePetSteps = new UpdatePetSteps();
    private final ReadPetSteps readPetSteps = new ReadPetSteps();

    @Test(description = "Create a pet - 200 Success")
    public void createPet() {
        Pet pet = TestDataGenerator.generatePet();

        // TODO: complete the test
    }

    @Test(description = "Create a pet using PUT - 200 Success")
    public void createPetUsingPut() {
        Pet pet = TestDataGenerator.generatePet();

        // TODO: complete the test
    }
}
