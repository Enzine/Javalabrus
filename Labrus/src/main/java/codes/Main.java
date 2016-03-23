package codes;


import codes.TxtReader;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Lab lab = new Lab("Enzine");
        Pet pet = new Pet("Jontte");
        lab.getMoodMaker().recogniseMood(pet);
        
        lab.addPet(pet);
       
        System.out.println(pet + "\n");
        
        lab.feedPet(pet);
        lab.giveWaterToPet(pet);
        lab.playWithPet(pet);
        lab.takePetOut(pet);
        
        System.out.println(pet + "\n");
        
    }
}