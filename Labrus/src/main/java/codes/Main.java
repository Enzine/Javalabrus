package codes;


import java.io.FileNotFoundException;

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
        
        lab.getMoodMaker().recogniseMood(pet);
        
        System.out.println(pet + "\n");
        
    }
}