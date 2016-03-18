package koodit;


import koodit.TxtReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        TxtReader txtReader = new TxtReader("newbaby.txt");
        if (txtReader.listRows().size() > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("");
        txtReader.printRows();
        
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("*** What is your name doc? ***");
//        String ownerName = "Dr. " + scanner.nextLine();
//        Lab lab = new Lab(ownerName);
//        System.out.println("*** Welcome " + ownerName + "! This is your new lab. Fill it with love and affection. :) ***");
//        System.out.println("\nCrazy Lady: 'Hello XD, you must be " + ownerName);
//        System.out.println("I got to roll! Take care of this baby Naked furry bellybutton, will you?'");
//        System.out.println("*** Say yes or no. ***");
//        String answer = scanner.nextLine();
//        if (answer.equals("no")) {
//            System.out.println("Crazy Lady: Ohh yes yews yes yes");
//        } else {
//            System.out.println("Crazy Lady: Ohh yes yews yes yes");
//        }
//        System.out.println("Lady leaves.\n");
//        System.out.println("Should name this .. thing ..\nGive name: ");
//        String name = scanner.nextLine();
//        Pet pet = new Pet(name);
//        System.out.println("What an excellent name!\n");
//        System.out.println("YOU have a new pet<3!\n");
//        System.out.println(pet);
    }
}
