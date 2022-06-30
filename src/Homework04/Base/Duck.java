package Homework04.Base;

public class Duck implements Flyable {
    boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: утка ранена");
        } else {
            System.out.println("Утка летит");
        }

    }
}
