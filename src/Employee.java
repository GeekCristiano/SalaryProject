
public class Employee extends Person implements Wage {

    private double rate;
    private int workedDays;
    private int missedDays;

    public Employee(String firstName, String lastName, int age, double rate, int workedDays, int missedDays) {
        super(firstName, lastName, age);
        this.rate = rate;
        this.workedDays = workedDays;
        this.missedDays = missedDays;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getMissedDays() {
        return missedDays;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    @Override
    public double calcIncome() {
        //some simple business logic
        return workedDays * rate;
    }

    @Override
    public double stoppageOfWages() {
        return missedDays * rate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Working days: " + workedDays +
                ", Missed days: " + missedDays +
                ", Rate: " + rate;
    }
}
