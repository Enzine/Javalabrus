package logic;

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
    }

    /**
     * Pet eats once.
     *
     */
    public void eat() {
        if (hunger == 10) {
            System.out.println("");
        } else if (hunger == 9) {
            hunger++;
        } else {
            hunger += 2;
            setPoints(1);
        }
    }

    /**
     * Pet drinks once.
     *
     */
    public void drink() {
        if (thirst == 10) {
            System.out.println("");
        } else if (thirst == 9) {
            thirst++;
        } else {
            thirst += 2;
            setPoints(1);
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
            this.fun += 2;
            setPoints(2);
        }
    }

    /**
     * Pet empties bladder.
     *
     */
    public void emptyBladder() {
        if (bladder <= 5) {
            bladder = 10;
        }
    }

    /**
     * Pet sleeps.
     *
     */
    public void sleep() {
        if (sleep < 5) {
            sleep = 10;
            bladder -= 2;
            hunger -= 2;
            thirst -= 2;
            fun++;
        }
    }

    /**
     * Counts the average happiness of the pet.
     *
     */
    public double countAvgHappiness() {
        return (hunger + thirst + fun + sleep + bladder) / (1.0 * 5);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nPoints: " + points + "\nMood: " + mood
                + "\n\nHungry/Full: " + hunger + "/10\nThirsty/Full: " + thirst + "/10\nBored/Fun: " + fun + "/10\nTired/Awake: " + sleep + "/10\nBladderFull/Empty: " + bladder + "/10";
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
