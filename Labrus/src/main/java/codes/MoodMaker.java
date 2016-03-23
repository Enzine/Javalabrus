package codes;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class MoodMaker {

    private TxtReader reader;
    private Random random = new Random();

    private List<String> rows() {
        return reader.getRows();
    }

    public void recogniseMood(Pet pet) throws FileNotFoundException {

        if (pet.countAvgHappiness() > 9) {
            reader = new TxtReader("greatmood.txt");
            Random random = new Random(); 
            int r = random.nextInt(rows().size());
            pet.setMood(rows().get(r));
        } else if (pet.countAvgHappiness() >= 5){
            reader = new TxtReader("goodmood.txt");
            Random random = new Random(); 
            int r = random.nextInt(rows().size());
            pet.setMood(rows().get(r));
        } else if (pet.countAvgHappiness() < 5) {
            reader = new TxtReader("upsetmood.txt");
            Random random = new Random();
            int r = random.nextInt(rows().size());
            pet.setMood(rows().get(r));
        }
    }
}
