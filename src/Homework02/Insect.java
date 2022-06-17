package Homework02;

public class Insect {
    private String insectName;
    private int legsAmount;
    public Insect(String name, int legsAmount) {
        this.insectName = name;
        this.legsAmount = legsAmount;
}
    public String getInsectInfo() {
        return insectName + " has " + legsAmount + " legs";
    }

    public void legsMultiplier(int legsMultiplier) {
        this.legsAmount = legsAmount * legsMultiplier;
    }

    public int getNewLegsAmount() {
        return this.legsAmount;
    }
}