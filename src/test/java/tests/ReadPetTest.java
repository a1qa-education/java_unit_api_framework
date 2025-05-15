package tests;

import api.CreatePetSteps;
import api.ReadPetSteps;
import data.TestDataGenerator;
import models.Pet;
import org.testng.annotations.Test;
import utils.RandomUtils;

public class ReadPetTest extends BaseTest {
    private static final String PET_NOT_FOUND_RESPONSE_MESSAGE = "Pet not found";
    private final CreatePetSteps createPetSteps = new CreatePetSteps();
    private final ReadPetSteps readPetSteps = new ReadPetSteps();

    @Test(description = "Get a pet by id - 200 Success")
    public void getPetById() {
        Pet pet = TestDataGenerator.generatePet();

        // TODO: complete the test

        /*
         Explore ResponseUtils to understand how to efficiently wait for a specific condition in the server response.
         */
    }

    @Test(description = "Get a non-existing pet by id - 404 Not Found")
    public void getNonExistingPetById() {
        long nonExistingId = RandomUtils.getRandomLong();

        // TODO: complete the test

        /*
         Because of the mock API service limits, we cannot get a vacant pet id from the service.
         There is a chance of generating an existing id using a randomizer. On real projects,
         a vacant id will be retrieved by requests.
         */
    }

    @Test(description = "Get a pet by invalid id - 400 Bad Request")
    public void getPetByInvalidId() {
        String invalidId = RandomUtils.getRandomAlphabeticString();

        // TODO: complete the test

        /*
         This test fails due to a defect. By the documentation,
         it should return status code 400, but it returns status code 404.
         */
    }
}
