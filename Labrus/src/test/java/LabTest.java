
import codes.Lab;
import codes.Pet;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LabTest {

    private Lab lab;
    private Pet pet;

    public LabTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws FileNotFoundException {
        lab = new Lab("Jäbäleisson");
        pet = new Pet("Ada");
        lab.addPet(pet);
    }

    @After
    public void tearDown() {
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
    public void feedPetWorksCorrectly() {
        lab.feedPet(pet);
        assertEquals(7, lab.getPet("Ada").getHunger());
    }

    @Test
    public void giveWaterToPetWorksCorrectly() {
        lab.giveWaterToPet(pet);
        assertEquals(7, lab.getPet("Ada").getThirst());
    }

    @Test
    public void playWithPetWorksCorrectly() {
        lab.playWithPet(pet);
        assertEquals(7, lab.getPet("Ada").getFun());
    }

    @Test
    public void takePetOutWorksCorrectly() {
        lab.takePetOut(pet);
        assertEquals(7, lab.getPet("Ada").getFun());
        assertEquals(3, lab.getPet("Ada").getHunger());
        assertEquals(10, lab.getPet("Ada").getBladder());
        assertEquals(3, lab.getPet("Ada").getSleepiness());
    }
    
    @Test
    public void getPetWorksCorrectly() {
        Pet pet = lab.getPet("Ada");
        assertEquals("Ada", pet.getName());
    }    
}