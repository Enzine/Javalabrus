package logic;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores and manages pets.
 */
public class Lab {

    private List<Pet> pets;

    public Lab() {
        this.pets = new ArrayList<>();
    }

    /**
     * Returns the wanted pet if found.
     *
     * @param name Name of the pet you wish to return
     * @return Pet/null
     */
    public Pet getPet(String name) {
        for (Pet pet : pets) {
            if (name.equals(pet.getName())) {
                return pet;
            }
        }
        return null;
    }

    /**
     * Makes a pet eat once.
     *
     * @param pet	the Pet you wish to feed
     */
    public void feedPet(Pet pet) {
        pet.eat();
    }

    /**
     * Makes a pet drink once.
     *
     * @param pet	the Pet you wish to water
     */
    public void giveWaterToPet(Pet pet) {
        pet.drink();
    }

    /**
     * Makes a pet play once.
     *
     * @param pet	the Pet you wish to play with
     */
    public void playWithPet(Pet pet) {
        pet.haveFun();
    }

    /**
     * A pet is taken out once.
     *
     * @param pet	the Pet you wish to take out
     */
    public void takePetOut(Pet pet) {
        pet.emptyBladder();
    }

    /**
     * Makes a pet sleep.
     *
     * @param pet	the Pet you wish to sleep
     */
    public void sleepPet(Pet pet) {
        pet.sleep();
    }

    /**
     * Adds a new pet to the pet storage in the lab.
     *
     * @param pet	the Pet you wish to add
     */
    public void addPet(Pet pet) throws FileNotFoundException {
        pets.add(pet);
    }

    /**
     * Removes a pet from the pet storage.
     *
     * @param pet	the Pet you wish to remove
     */
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }
}
