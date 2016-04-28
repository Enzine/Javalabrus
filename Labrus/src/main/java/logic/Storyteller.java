package logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import utility.MoodMaker;
import utility.TxtReader;

public class Storyteller {

    private TxtReader txtR = null;
    private MoodMaker mm = new MoodMaker();
    private Owner owner = null;
    private Lab lab = new Lab();
    private Scanner scanner = new Scanner(System.in);

    public void tellTheStory() throws InterruptedException, IOException {
        System.out.println("Do you wish to load an old save? Give us the name of the save. "
                + "In case you wish to start over, press ENTER.");

        String save = scanner.nextLine();
        if (save.isEmpty()) {
            System.out.println("Name your new save file");

            String newSaveFile = scanner.nextLine();
            if (newSaveFile.isEmpty()) {
                System.out.println("You didn't write anything punk!");

            } else {
                createANewSaveFile(newSaveFile, lab);
                yourName(txtR);
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    name = "Nobody";
                }
                owner = new Owner(name);
                lab = new Lab(name);
                lab.setSavePath("saves/" + newSaveFile + ".txt");
                writeToASaveFile(lab.getSavePath(), name + "\n");
            }
            System.out.println("\nBrilliant!\n");
            System.out.println("Welcome to Silly Naked Furry Bellybutton Pets Mr./Mrs. " + owner.getName() + "!");
            System.out.println("Do you wish to skip the intro? Then type 1");
            String skip = scanner.nextLine();
            if (skip.equals("1")) {
                System.out.println("Name your pet.");
                String skippedPetName = scanner.nextLine();
                Pet pet = new Pet(skippedPetName);
                writeToASaveFile(lab.getSavePath(), pet.contentToASave());
            } else {
                Thread.sleep(1000);
                System.out.println("Long story short:");
                Thread.sleep(1000);
                youAre(txtR);
                crazyLady(txtR);
                scanner.nextLine();
                Thread.sleep(1000);
                namingPet(txtR);
                String petName = scanner.nextLine();
                Pet pet = new Pet(petName);
                writeToASaveFile(lab.getSavePath(), pet.contentToASave());
            }
            // TÄLLÄ HETKELLÄ YLIKIRJOITTAA seivin!
        }
    }

    public TxtReader getTxtR() {
        return txtR;
    }

    public MoodMaker getMm() {
        return mm;
    }

    public static void createANewSaveFile(String newSaveFile, Lab lab) throws IOException {
        //String content = "This is the content to write into file";
        String path = "saves/" + newSaveFile + ".txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        //bw.write(content);
        bw.close();// be sure to close
    }

    public static void writeToASaveFile(String save, String content) throws IOException {
        File file = new File(save);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }

    public static void yourName(TxtReader txtR) throws FileNotFoundException, InterruptedException {
        txtR = new TxtReader("story/yourname.txt");
        txtR.printRowsSlow();
    }

    public static void youAre(TxtReader txtR) throws FileNotFoundException, InterruptedException {
        txtR = new TxtReader("story/youare.txt");
        txtR.printRowsSlower();
    }

    public static void crazyLady(TxtReader txtR) throws FileNotFoundException, InterruptedException {
        txtR = new TxtReader("story/crazylady.txt");
        txtR.printRowsSlowest();
    }

    public static void namingPet(TxtReader txtR) throws FileNotFoundException, InterruptedException {
        txtR = new TxtReader("story/namingpet.txt");
        txtR.printRowsSlowest();
    }

}
