
public class Freelancer extends Person implements Wage {

    private double hours;
    private double rate;
    private int tasks; // the number of of solved tasks
    public static final int MIN_TASKS = 4;


    public Freelancer(String firstName, String lastName, int age, double hours, double rate, int tasks) {
        super(firstName, lastName, age);
        this.hours = hours;
        this.rate = rate;
        this.tasks = tasks;
    }


    @Override
    public double calcIncome() {
        return ((tasks > MIN_TASKS) && (hours > 100)) ? rate * 1.17 : rate * 0.97;
    }

    @Override
    public double stoppageOfWages() {
        return ((tasks < MIN_TASKS) && (hours < 80)) ? 0.5 * rate : rate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Hours: " + hours +
                ", Rate: " + rate +
                ", Tasks: " + tasks;
    }
}
