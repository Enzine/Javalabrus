package logic;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class provides different functions for the pet.
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
        picturePath = "pets/pet00" + (new Random().nextInt(10)) + ".png";

        SaveLoader loader = new SaveLoader();
        if (loader.saveFileExists()) {
            initializeStats(loader.loadSaveFile());
        }
    }

    /**
     * Updates stats when a save is loaded.
     *
     * @param stats The wanted stats of the pet.
     */
    public void initializeStats(ArrayList<String> stats) {
        if (stats.size() != 10) {
            return;
        }
        name = stats.get(0);
        age = stats.get(1);
        points = Integer.parseInt(stats.get(2));
        mood = stats.get(3);
        hunger = Integer.parseInt(stats.get(4));
        thirst = Integer.parseInt(stats.get(5));
        fun = Integer.parseInt(stats.get(6));
        sleep = Integer.parseInt(stats.get(7));
        bladder = Integer.parseInt(stats.get(8));
        picturePath = stats.get(9);
    }

    /**
     * Adds points and checks if age should be altered.
     */
    public void addPoints() {
        if (points == 99) {
            age = "child";
        }
        if (points == 199) {
            age = "teenager";
        }
        if (points == 299) {
            age = "young adult";
        }
        if (points == 399) {
            age = "adult";
        }
        if (points == 499) {
            age = "elderly";
        }
        points++;
    }
    
    /**
     * Decreases hunger by one if possible.
     *
     */
    public void hungerDecreasesByOne() {
        if (!(hunger == 0)) {
            hunger--;
        }
    }

    /**
     * Decreases thirst by one if possible.
     *
     */
    public void thirstDecreasesByOne() {
        if (!(thirst == 0)) {
            thirst--;
        }
    }

    /**
     * Decreases sleep by one if possible.
     *
     */
    public void sleepDecreasesByOne() {
        if (!(sleep == 0)) {
            sleep--;
        }
    }

    /**
     * Decreases bladder by one if possible.
     *
     */
    public void bladderDecreasesByOne() {
        if (!(bladder == 0)) {
            bladder--;
        }
    }

    /**
     * Decreases fun by one if possible.
     *
     */
    public void funDecreasesByOne() {
        if (!(fun == 0)) {
            fun--;
        }
    }

    /**
     * Pet eats once.
     *
     */
    public void eat() {
        if (!(hunger == 10)) {
            if (hunger == 9) {
                hunger++;
            } else {
                hunger += 2;
                addPoints();
            }
        }
    }

    /**
     * Pet drinks once.
     *
     */
    public void drink() {
        if (!(thirst == 10)) {
            if (thirst == 9) {
                thirst++;
            } else {
                thirst += 2;
                addPoints();
            }
        }
    }

    /**
     * Pet plays once.
     *
     */
    public void haveFun() {
        if (!(fun == 10)) {
            if (fun == 9) {
                fun++;
            } else {
                fun += 2;
                addPoints();
            }
        }
    }

    /**
     * Pet empties bladder.
     *
     */
    public void emptyBladder() {
        if (bladder <= 5) {
            bladder = 10;
            addPoints();
        }
    }

    /**
     * Pet sleeps.
     *
     */
    public void sleep() {
        if (sleep <= 5) {
            sleep = 10;
            bladderDecreasesByOne();
            bladderDecreasesByOne();
            hungerDecreasesByOne();
            hungerDecreasesByOne();
            thirstDecreasesByOne();
            thirstDecreasesByOne();
            haveFun();
        }
    }

    /**
     * Counts the average happiness of the pet.
     *
     * @return double average happiness
     */
    public double countAvgHappiness() {
        return (hunger + thirst + fun + sleep + bladder) / (1.0 * 5);
    }

    /**
     * Creates the content wanted for a save file.
     *
     * @return String content for a save
     */
    public String contentToASave() {
        return name + "\n" + age + "\n" + points + "\n" + mood + "\n" + hunger + "\n" + thirst + "\n" + fun + "\n" + sleep + "\n" + bladder + "\n" + picturePath;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nPoints: " + points + "\nMood: " + mood
                + "\n\nHungry/Full: " + hunger + "\nThirsty/Full: " + thirst + "\nBored/Fun: " + fun + "\nTired/Awake: " + sleep + "\nBladder full/empty: " + bladder;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
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

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getBladder() {
        return bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }
}
