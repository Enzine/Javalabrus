package codes;

//import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;
import javax.swing.SwingUtilities;
//import javax.swing.Timer;
//import logic.*;
//import utility.*;
import ui.*;

/**
 * This class is the main class and for now it is just for testing.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        Ui ui = new Ui();
        SwingUtilities.invokeLater(ui);
    }
}
