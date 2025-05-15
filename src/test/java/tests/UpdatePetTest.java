package tests;

import api.CreatePetSteps;
import api.ReadPetSteps;
import api.UpdatePetSteps;
import org.testng.annotations.Test;

public class UpdatePetTest extends BaseTest {
    private final CreatePetSteps createPetSteps = new CreatePetSteps();
    private final UpdatePetSteps updatePetSteps = new UpdatePetSteps();
    private final ReadPetSteps readPetSteps = new ReadPetSteps();

    @Test(description = "Update a pet - 200 Success")
    public void updatePet() {
        // TODO: complete the test
    }
}
