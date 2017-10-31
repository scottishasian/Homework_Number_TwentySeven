package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

public class Director extends Manager {

    private double budget;

    public Director(int id, String name, String socialSecurityNumber, double salary, String deptname, double budget) {
        super(id, name, socialSecurityNumber, salary, deptname);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}
