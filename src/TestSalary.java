import java.util.ArrayList;

public class TestSalary {

    public static void main(String[] args) {

        ArrayList<Wage> aListOfworkers = new ArrayList<>();

        Freelancer freelancer = new Freelancer("Ivan", "Ivanov", 23, 96, 20000, 7);
        Employee employee = new Employee("Fedor", "Fedorov", 24000, 27, 28, 2);

        aListOfworkers.add(freelancer);
        aListOfworkers.add(employee);

        for (Wage currentWorker : aListOfworkers) {

            System.out.println(currentWorker);
            System.out.println(currentWorker.calcIncome());
            System.out.println(currentWorker.stoppageOfWages());
        }

    }
}
