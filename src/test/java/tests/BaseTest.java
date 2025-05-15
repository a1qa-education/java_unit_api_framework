package tests;

import api.DeletePetSteps;
import org.testng.annotations.AfterMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTest {
    private final DeletePetSteps deletePetSteps = new DeletePetSteps();
    protected final List<Long> createdPetIds = new ArrayList<>();

    @AfterMethod
    public void deleteCreatedPets() {
        createdPetIds.forEach(deletePetSteps::deletePetById);
    }
}
