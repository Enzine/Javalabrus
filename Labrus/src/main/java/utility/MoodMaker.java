package utility;

import logic.Pet;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

/**
 * This class generates random Strings (moods) from .txt files.
 */

public class MoodMaker {

    private TxtReader reader;
    private Random random = new Random();

    private List<String> rows() {
        return reader.getRows();
    }

    /**
     * Generates a random integer between 0 and the amount of rows in the file read with TxtReader (-1).
     *
     */
    public int generateRandom() {
        return random.nextInt(rows().size());
    }

    /**
     * Sets pet's mood.
     *
     * @param pet	the Pet which mood you wish to set.
     */
    public void recogniseMood(Pet pet) throws FileNotFoundException {

        if (pet.countAvgHappiness() > 9) {
            reader = new TxtReader("greatmood.txt");
            pet.setMood(rows().get(generateRandom()));
        } else if (pet.countAvgHappiness() >= 5) {
            reader = new TxtReader("goodmood.txt");
            pet.setMood(rows().get(generateRandom()));
        } else if (pet.countAvgHappiness() < 5) {
            reader = new TxtReader("upsetmood.txt");
            pet.setMood(rows().get(generateRandom()));
        }
    }
}
