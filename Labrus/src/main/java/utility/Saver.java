package utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class is only for creating a new save file in the game.
 * @author sonjamak
 */

public class Saver {
    
    /**
     * Creates a new save.
     * @param newSaveFile       The name of the save
     * @param content           The content you wish to save 
     * @throws java.io.IOException 
     */
    public void createANewSaveFile(String newSaveFile, String content) throws IOException {
        File file = new File("saves/" + newSaveFile + ".txt");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }
}
