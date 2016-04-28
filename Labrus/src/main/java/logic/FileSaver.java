package logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import utility.*;

public class FileSaver {
    private TxtReader txtR;

    public FileSaver(String source) throws FileNotFoundException {
        txtR = new TxtReader(source);
    }
    
    public void createANewSaveFile(String newSaveFile, Lab lab) throws IOException {
        //String content = "This is the content to write into file";
        String path = "saves/" + newSaveFile + ".txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        //bw.write(content);
        bw.close();// be sure to close
    }

    public void writeToASaveFile(String save, String content) throws IOException {
        File file = new File(save);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }

}
