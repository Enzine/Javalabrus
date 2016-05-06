package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class reads txt files and creates Strings from them.
 */

public class TxtReader {

    private Scanner scanner;
    private File file;
    private ArrayList<String> list;

    public TxtReader(String source) throws FileNotFoundException {
        file = new File(source);
        this.scanner = new Scanner(file);
        list = new ArrayList<>();
    }

    /**
     * Gets rows from a txt file.
     *
     */
    public ArrayList<String> getRows() {
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
    
    /**
     * Creates a String of the rows gotten from the txt file.
     * @return      String
     */
    public String makeAStringOfRows() {
        getRows();
        String s = "";
        for (String string : list) {
            s += string + "\n";
        }
        return s;
    }
}