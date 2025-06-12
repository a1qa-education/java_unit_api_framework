package api;

import io.restassured.response.Response;
import models.Pet;

public class PetSteps {

    public Response createPet(Pet pet) {
        // TODO: complete the method
        return null;
    }

    public Response readPetById(Long petId) {
        return readPet(petId);
    }

    public Response readPetByInvalidId(Object petId) {
        return readPet(petId);
    }

    public Response updatePet(Pet pet) {
        // TODO: complete the method
        return null;
    }

    public Response deletePetById(Long petId) {
        // TODO: complete the method
        return null;
    }

    private Response readPet(Object petId) {
        // TODO: complete the method
        return null;
    }
}
