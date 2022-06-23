package Homework03.Base;

public class Financial_record {
    private int incomes;
    private int outcomes;
    public Financial_record(int доходы, int расходы) {
        this.incomes = доходы;
        this.outcomes = расходы;

    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
