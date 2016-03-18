
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtReader {
    private Scanner scanner;
    private File file;
    private ArrayList<String> list;

    public TxtReader(String source) throws FileNotFoundException {
        file = new File(source);
        this.scanner = new Scanner(file);
        list = new ArrayList<>();
    }
    
    public ArrayList<String> listRows() {
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
    
    
    public void printRows() {
        listRows();
        for (String row : list) {
            System.out.println(row);
        }
    }
    
}
