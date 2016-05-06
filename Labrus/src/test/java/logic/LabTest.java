package logic;


import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LabTest {

    private Lab lab;
    private Pet pet;

    public LabTest() {
    }

    @Before
    public void setUp() throws FileNotFoundException {
        lab = new Lab();
        pet = new Pet("Jonne");
        lab.addPet(pet);
    }

    @Test
    public void addPetAddsAPetCorrectly() {
        assertEquals(1, lab.getPets().size());
    }

    @Test
    public void removePetRemovesAPetCorrectly() {
        lab.removePet(pet);
        assertEquals(0, lab.getPets().size());
    }

    @Test
    public void feedPetDoesNothingWhenHungerIsAlready10() {
        pet.setHunger(10);
        lab.feedPet(pet);
        assertEquals(10, pet.getHunger());
    }
    
    @Test
    public void feedPetSetsHungerTo10WhenItWas9() {
        pet.setHunger(9);
        lab.feedPet(pet);
        assertEquals(10, pet.getHunger());
    }
    
    @Test
    public void feedPetAdds2PointsToHunger() {
        lab.feedPet(pet);
        assertEquals(7, pet.getHunger());
    }
    
    @Test
    public void giveWaterToPetDoesNothingWhenThirstIsAlready10() {
        pet.setThirst(10);
        lab.giveWaterToPet(pet);
        assertEquals(10, pet.getThirst());
    }
    
    @Test
    public void giveWaterToPetSetsThirstTo10WhenItWas9() {
        pet.setThirst(9);
        lab.giveWaterToPet(pet);
        assertEquals(10, pet.getThirst());
    }

    @Test
    public void giveWaterToPetAdds2PointsToThirst() {
        lab.giveWaterToPet(pet);
        assertEquals(7, pet.getThirst());
    }

    @Test
    public void playWithPetDoesNothingWhenFunIsAlready10() {
        pet.setFun(10);
        lab.playWithPet(pet);
        assertEquals(10, pet.getFun());
    }
    
    @Test
    public void playWithPetSetsFunTo10WhenItWas9() {
        pet.setFun(9);
        lab.playWithPet(pet);
        assertEquals(10, pet.getFun());
    }
    
    @Test
    public void playWithPetAdds2PointsToFun() {
        lab.playWithPet(pet);
        assertEquals(7, pet.getFun());
    }
    
    @Test
    public void takePetOutDoesNothingIfBladderIsMoreThan5() {
        pet.setBladder(6);
        lab.takePetOut(pet);
        assertEquals(6, pet.getBladder());
    }
    
    @Test
    public void takePetOutWorksCorrectlyIfBladderIsMax5() {
        lab.takePetOut(pet);
        assertEquals(10, pet.getBladder());
    }
    
    @Test
    public void sleepPetDoesNothingIfSleepIsMoreThan5() {
        pet.setSleep(6);
        lab.sleepPet(pet);
        assertEquals(6, pet.getSleep());
    }
    
    @Test
    public void sleepPetWorksCorrectlyIfSleepIsMax5() {
        lab.sleepPet(pet);
        assertEquals(10, pet.getSleep());
        assertEquals(3, pet.getBladder());
        assertEquals(3, pet.getHunger());
        assertEquals(3, pet.getThirst());
        assertEquals(7, pet.getFun());
    }
    
    @Test
    public void getPetWorksCorrectly() {
        Pet pet = lab.getPet("Jonne");
        assertEquals("Jonne", pet.getName());
    }
}
