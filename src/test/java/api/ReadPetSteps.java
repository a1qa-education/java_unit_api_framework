package api;

import io.restassured.response.Response;

public class ReadPetSteps {

    private Response readPet(Object petId) {
        // TODO: complete the method
        return null;
    }

    public Response readPetById(Long petId) {
        return readPet(petId);
    }

    public Response readPetByInvalidId(Object petId) {
        return readPet(petId);
    }
}
