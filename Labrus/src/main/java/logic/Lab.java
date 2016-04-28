package logic;

import utility.MoodMaker;
import logic.Owner;
import logic.Pet;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores and manages pets.
 */
public class Lab {

    private List<Pet> pets;
    private Owner owner;
    private MoodMaker mm;
    private String savePath;

    public Lab(String ownerName) {
        this.pets = new ArrayList<>();
        this.owner = new Owner(ownerName);
        this.mm = new MoodMaker();
        this.savePath = null;
    }
    
    public Lab() {
        this.pets = new ArrayList<>();
        this.owner = null;
        this.mm = new MoodMaker();
        this.savePath = null;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

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
//        if (pet.getHunger() <= 1 || pet.getSleepiness() <= 1) {
//            System.out.println("");
//        } else {
//            pet.haveFun();
//            pet.emptyBladder();
//            pet.setHunger(pet.getHunger() - 2);
//            pet.setSleepiness(pet.getSleepiness() - 2);
//            pet.setPoints(3);
//        }
    }
    
    /**
     * Makes a pet sleep.
     *
     * @param pet	the Pet you wish to play with
     */
    public void sleepPet(Pet pet) {
        pet.sleep();
    }

    public MoodMaker getMoodMaker() {
        return mm;
    }

    /**
     * Adds a new pet to the pet storage in lab.
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

    /**
     * Prints all pets.
     * 
     */
    public void printPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
