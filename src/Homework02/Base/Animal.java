package Homework02.Base;

public class Animal {
    private String animalName;
    private int legsAmount;
    public Animal(String name, int legsAmount) {
        this.animalName = name;
        this.legsAmount = legsAmount;
    }
    public String getAnimalInfo() {
        return animalName + " has " + legsAmount + " legs";
    }

    public void legsMultiplier(int legsMultiplier) {
        this.legsAmount = legsAmount * legsMultiplier;
    }

    public int getNewLegsAmount() {
        return this.legsAmount;
    }
}
