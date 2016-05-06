package utility;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MoodMakerTest {
    MoodMaker mm;
    
    public MoodMakerTest() {
    }

    @Before
    public void setUp() {
        mm = new MoodMaker();
        try {
            mm.setTxtReader(new TxtReader("moods/test.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MoodMakerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void generateRandomWorksCorrectly() {
        int i = mm.generateRandom();
        int j;
        if (i > 2) {
            j = 0;
        } else {
            j = 1;
        }
        assertEquals(1, j);
    }
}
