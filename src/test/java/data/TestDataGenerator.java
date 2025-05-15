package data;

import lombok.experimental.UtilityClass;
import models.Pet;
import utils.RandomUtils;

@UtilityClass
public class TestDataGenerator {

    public Pet generatePet() {
        Pet pet = new Pet();
        pet.setName(RandomUtils.getRandomAlphabeticString());
        return pet;
    }
}
