package codes;

import logic.Lab;
import logic.Pet;
import java.io.FileNotFoundException;

/**
 * This class is the main class and for now it is just for testing.
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Lab lab = new Lab("Enzine");
        Pet pet = new Pet("Jontte");
        lab.getMoodMaker().recogniseMood(pet);

        lab.addPet(pet);

        System.out.println(pet + "\n");

        lab.feedPet(pet);
        lab.giveWaterToPet(pet);
        lab.playWithPet(pet);
        lab.takePetOut(pet);

        lab.getMoodMaker().recogniseMood(pet);

        System.out.println(pet + "\n");

    }
}
