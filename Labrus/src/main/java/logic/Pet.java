package logic;

import java.util.Random;

/**
 * This class provides different functions for pets.
 */
public class Pet {

    private String name;
    private String age;
    private int points;
    private String mood;

    private int hunger;
    private int thirst;
    private int fun;
    private int sleep;
    private int bladder;

    private String picturePath;

    public Pet(String name) {
        this.name = name;
        this.age = "baby";
        this.points = 0;
        this.mood = "Wondering who you are...";
        this.hunger = 5;
        this.thirst = 5;
        this.fun = 5;
        this.sleep = 5;
        this.bladder = 5;
        picturePath = "pets/pet007.png";
//        picturePath = "pets/pet00" + (new Random().nextInt(6) + 1) + ".png";
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    /**
     * Pet eats once.
     *
     */
    public void eat() {
        if (hunger == 10) {
            System.out.print("");
        } else if (hunger == 9) {
            hunger++;
        } else {
            hunger += 2;
            setPoints(1);
        }
    }

    /**
     * Decreases hunger by one if possible.
     *
     */
    public void hungerDecreasesByOne() {
        if (hunger == 0) {
            System.out.print("");
        } else {
            hunger--;
        }
    }

    /**
     * Pet drinks once.
     *
     */
    public void drink() {
        if (thirst == 10) {
            System.out.print("");
        } else if (thirst == 9) {
            thirst++;
        } else {
            thirst += 2;
            setPoints(1);
        }
    }

    /**
     * Decreases thirst by one if possible.
     *
     */
    public void thirstDecreasesByOne() {
        if (thirst == 0) {
            System.out.print("");
        } else {
            thirst--;
        }
    }

    /**
     * Decreases sleep by one if possible.
     *
     */
    public void sleepDecreasesByOne() {
        if (sleep == 0) {
            System.out.print("");
        } else {
            sleep--;
        }
    }

    /**
     * Decreases sleep by one if possible.
     *
     */
    public void bladderDecreasesByOne() {
        if (bladder == 0) {
            System.out.print("");
        } else {
            bladder--;
        }
    }

    /**
     * Decreases fun by one if possible.
     *
     */
    public void funDecreasesByOne() {
        if (fun == 0) {
            System.out.print("");
        } else {
            fun--;
        }
    }

    /**
     * Pet plays once.
     *
     */
    public void haveFun() {
        if (fun == 10) {
            System.out.println("");
        } else if (fun == 9) {
            fun++;
        } else {
            fun += 2;
            setPoints(1);
        }
    }

    /**
     * Pet empties bladder.
     *
     */
    public void emptyBladder() {
        if (bladder <= 5) {
            bladder = 10;
            setPoints(1);
        }
    }

    /**
     * Pet sleeps.
     *
     */
    public void sleep() {
        if (sleep <= 5) {
            sleep = 10;
//            bladder -= 2;
//            hunger -= 2;
//            thirst -= 2;
//            fun++;
        }
    }

    /**
     * Counts the average happiness of the pet.
     *
     */
    public double countAvgHappiness() {
        return (hunger + thirst + fun + sleep + bladder) / (1.0 * 5);
    }

    /**
     * Returns the content wanted for a save file.
     *
     */
    public String contentToASave() {
        return name + "\n" + age + "\n" + points + "\n" + mood + "\n" + hunger + "\n" + thirst + "\n" + fun + "\n" + sleep + "\n" + bladder;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nPoints: " + points + "\nMood: " + mood
                + "\n\nHungry/Full: " + hunger + "\nThirsty/Full: " + thirst + "\nBored/Fun: " + fun + "\nTired/Awake: " + sleep + "\nBladder full/empty: " + bladder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public int getSleepiness() {
        return sleep;
    }

    public void setSleepiness(int sleepiness) {
        this.sleep = sleepiness;
    }

    public int getBladder() {
        return bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }
}
