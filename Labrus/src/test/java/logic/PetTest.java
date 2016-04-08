package logic;


import logic.Pet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {

    private Pet pet;

    public PetTest() {
    }

    @Before
    public void setUp() {
        pet = new Pet("Keimo");
    }

    @Test
    public void eatDoesntDoAnythingIfHungerIs10() {
        pet.setHunger(10);
        pet.eat();
        assertEquals(10, pet.getHunger());
    }

    @Test
    public void eatAdds1ToHungerIfHungerIs9() {
        pet.setHunger(9);
        pet.eat();
        assertEquals(10, pet.getHunger());
    }

    @Test
    public void eatAdds2ToHungerIfHungerIsLessThan9AndGives1Point() {
        pet.setHunger(8);
        pet.eat();
        assertEquals(10, pet.getHunger());
        assertEquals(1, pet.getPoints());
    }

    @Test
    public void drinkDoesntDoAnythingIfThirstIs10() {
        pet.setThirst(10);
        pet.drink();
        assertEquals(10, pet.getThirst());
    }

    @Test
    public void drinkAdds1ToThirstIfThirstIs9() {
        pet.setThirst(9);
        pet.drink();
        assertEquals(10, pet.getThirst());
    }

    @Test
    public void drinkAdds2ToThirstIfThirstIsLessThan9AndGives1Point() {
        pet.setThirst(8);
        pet.drink();
        assertEquals(10, pet.getThirst());
        assertEquals(1, pet.getPoints());
    }
    
    @Test
    public void haveFunDoesntDoAnythingIfHaveFunIs10() {
        pet.setFun(10);
        pet.haveFun();
        assertEquals(10, pet.getFun());
    }

    @Test
    public void haveFunAdds1ToHaveFunIfHaveFunIs9() {
        pet.setFun(9);
        pet.haveFun();
        assertEquals(10, pet.getFun());
    }

    @Test
    public void haveFunAdds2ToHaveFunIfHaveFunIsLessThan9AndGives2Points() {
        pet.setFun(8);
        pet.haveFun();
        assertEquals(10, pet.getFun());
        assertEquals(2, pet.getPoints());
    }
    
    @Test
    public void emptyBladderDoesntDoAnythingIfItIsMoreThan5() {
        pet.setBladder(6);
        pet.emptyBladder();
        assertEquals(6, pet.getBladder());
    }

    @Test
    public void emptyBladderSetsBladderTo10WhenItIs5OrLess() {
        pet.setBladder(5);
        pet.emptyBladder();
        assertEquals(10, pet.getBladder());
    }
    
    @Test
    public void sleepDoesntDoAnythingWhenItIsMoreThan4() {
        pet.setSleepiness(5);
        pet.sleep();
        assertEquals(5, pet.getSleepiness());
    }
    
    @Test
    public void sleepWorksCorrectlyWhenItIsLess5() {
        pet.setBladder(4);
        pet.emptyBladder();
        assertEquals(10, pet.getBladder());
    }
    
    @Test
    public void countAvgHappinessWorksCorrectly() {
        int i = 0;
        if (pet.countAvgHappiness() == 5.0) {
            i = 0;
        } else {
            i = 1;
        }
        assertEquals(0, i);
    }

}