package tests;

import api.PetSteps;
import org.testng.annotations.AfterMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTest {
    protected final PetSteps petSteps = new PetSteps();
    protected final List<Long> createdPetIds = new ArrayList<>();

    @AfterMethod
    public void deleteCreatedPets() {
        createdPetIds.forEach(petSteps::deletePetById);
    }
}
