package logic;

import utility.MoodMaker;
import logic.Owner;
import logic.Pet;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Lab {

    private List<Pet> pets;
    private Owner owner;
    private MoodMaker mm;

    public Lab(String ownerName) {
        this.pets = new ArrayList<>();
        this.owner = new Owner(ownerName);
        this.mm = new MoodMaker();
    }

    public Pet getPet(String name) {
        for (Pet pet : pets) {
            if (name.equals(pet.getName())) {
                return pet;
            }
        }
        return null;
    }

    public void feedPet(Pet pet) {
        pet.eat();
    }

    public void giveWaterToPet(Pet pet) {
        pet.drink();
    }

    public void playWithPet(Pet pet) {
        pet.haveFun();
    }

    public void takePetOut(Pet pet) {
        pet.haveFun();
        pet.emptyBladder();
        pet.setSleepiness(pet.getSleepiness() - 2);
        pet.setHunger(pet.getHunger() - 2);
        pet.setPoints(3);
    }

    public MoodMaker getMoodMaker() {
        return mm;
    }

    public void addPet(Pet pet) throws FileNotFoundException {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

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
