package codes;

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

    public void eat() {
        if (this.hunger == 10) {
            System.out.println("");
        } else if (this.hunger == 9) {
            this.hunger++;
        } else {
            this.hunger += 2;
        }
    }

    public void drink() {
        if (this.thirst == 10) {
            System.out.println("");
        } else if (this.thirst == 9) {
            this.thirst++;
        } else {
            this.thirst += 2;
        }
    }

    public void haveFun() {
        if (this.fun == 10) {
            System.out.println("");
        } else if (this.fun == 9) {
            this.fun++;
        } else {
            this.fun += 2;
        }
    }
    
    public void emptyBladder() {
        if (this.bladder < 5) {
            this.bladder = 10;
        }
    }
    
    public void sleep() {
        if (this.sleep < 5) {
            this.sleep = 10;
            this.bladder -= 2;
            this.hunger -= 2;
            this.thirst -= 2;
            this.fun++;
        }
    }

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
