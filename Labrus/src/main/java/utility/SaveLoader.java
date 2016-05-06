package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is for loading an existing save.
 * @author sonjamak
 */
public class SaveLoader {

    private Scanner scanner;
    private String saveFile = "saves/first.txt";

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Calls the loadScanner() method.
     */
    public SaveLoader() {
        loadScanner();
    }

    /**
     * Checks if the file exists.
     * @return      boolean informatin about file's existance
     */
    public boolean saveFileExists() {
        return new File(saveFile).canRead();
    }

    public String getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(String saveFile) {
        this.saveFile = "saves/" + saveFile + ".txt";
        loadScanner();
    }

    /**
     * Defines the Scanner.
     */
    private void loadScanner() {
        try {
            this.scanner = new Scanner(new File(saveFile));
        } catch (FileNotFoundException e) {
            System.err.println("There was a problem");
        }
    }

    /**
     * 
     * @return 
     */
    public ArrayList<String> loadSaveFile() {
        ArrayList<String> stats = new ArrayList();
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            stats.add(row);
        }
        return stats;
    }
}
