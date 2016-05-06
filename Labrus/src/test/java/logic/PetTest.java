package logic;

import org.junit.Before;
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
    public void addPointsAdds1PointToPoints() {
        pet.addPoints();
        assertEquals(1, pet.getPoints());
    }

    @Test
    public void addPointsChangesAgeToChildWhenPointsIs100() {
        pet.setPoints(99);
        pet.addPoints();
        assertEquals("child", pet.getAge());
    }

    @Test
    public void addPointsChangesAgeToTeenWhenPointsIs200() {
        pet.setPoints(199);
        pet.addPoints();
        assertEquals("teenager", pet.getAge());
    }

    @Test
    public void addPointsChangesAgeToYoungAdultWhenPointsIs300() {
        pet.setPoints(299);
        pet.addPoints();
        assertEquals("young adult", pet.getAge());
    }

    @Test
    public void addPointsChangesAgeToAdultWhenPointsIs400() {
        pet.setPoints(399);
        pet.addPoints();
        assertEquals("adult", pet.getAge());
    }

    @Test
    public void addPointsChangesAgeToElderWhenPointsIs500() {
        pet.setPoints(499);
        pet.addPoints();
        assertEquals("elderly", pet.getAge());
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
    public void haveFunAdds2ToHaveFunIfHaveFunIsLessThan9AndGives1Point() {
        pet.setFun(8);
        pet.haveFun();
        assertEquals(10, pet.getFun());
        assertEquals(1, pet.getPoints());
    }

    @Test
    public void emptyBladderDoesntDoAnythingIfBladderIsMoreThan5() {
        pet.setBladder(6);
        pet.emptyBladder();
        assertEquals(6, pet.getBladder());
    }

    @Test
    public void emptyBladderSetsBladderTo10WhenBladderIs5OrLess() {
        pet.setBladder(5);
        pet.emptyBladder();
        assertEquals(10, pet.getBladder());
    }

    @Test
    public void sleepDoesntDoAnythingWhenItIsMoreThan5() {
        pet.setSleep(6);
        pet.sleep();
        assertEquals(6, pet.getSleep());
    }

    @Test
    public void sleepSetsSleepTo10WhenSleepIs5OrLess() {
        pet.setSleep(5);
        pet.sleep();
        assertEquals(10, pet.getSleep());
    }

    @Test
    public void sleepAdds2ToFunAndReducesOthersBy2WhenSleepIs5OrLess() {
        pet.setSleep(5);
        pet.sleep();
        assertEquals(3, pet.getHunger());
        assertEquals(3, pet.getThirst());
        assertEquals(3, pet.getBladder());
        assertEquals(7, pet.getFun());
    }

    @Test
    public void countAvgHappinessWorksCorrectly() {
        pet.setBladder(2);
        pet.setHunger(9);
        assertEquals(5.2, pet.countAvgHappiness(), 0.001);
    }

    @Test
    public void hungerDecreasesByOneWorksCorrectly() {
        pet.hungerDecreasesByOne();
        assertEquals(4, pet.getHunger());
    }

    @Test
    public void thirstDecreasesByOneWorksCorrectly() {
        pet.thirstDecreasesByOne();
        assertEquals(4, pet.getThirst());
    }

    @Test
    public void funDecreasesByOneWorksCorrectly() {
        pet.funDecreasesByOne();
        assertEquals(4, pet.getFun());
    }

    @Test
    public void bladderDecreasesByOneWorksCorrectly() {
        pet.bladderDecreasesByOne();
        assertEquals(4, pet.getBladder());
    }

    @Test
    public void sleepDecreasesByOneWorksCorrectly() {
        pet.sleepDecreasesByOne();
        assertEquals(4, pet.getSleep());
    }
    
    @Test
    public void contentToASaveWorksCorrectly() {
        assertEquals("Keimo\nbaby\n0\nWondering who you are...\n5\n5\n5\n5\n5\n" + pet.getPicturePath(), pet.contentToASave());
    }
    
}
