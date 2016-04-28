package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class reads .txt files and puts them into ArrayLists.
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
    
    public String makeAStringOfRows() {
        getRows();
        String s = "";
        for (String string : list) {
            s += string + "\n";
        }
        return s;
    }
    
    public void printRows() {
        getRows();
        for (String row : list) {
            System.out.println(row);
        }
    }
    
    public void printRowsSlow() throws InterruptedException {
        getRows();
        for (String row : list) {
            System.out.println(row);
            Thread.sleep(1000);
        }
    }
    
    public void printRowsSlower() throws InterruptedException {
        getRows();
        for (String row : list) {
            System.out.println(row);
            Thread.sleep(3000);
        }
    }
    
    public void printRowsSlowest() throws InterruptedException {
        getRows();
        for (String row : list) {
            System.out.println(row);
            Thread.sleep(4500);
        }
    }
}
