package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

public class Manager extends Employee {

    private String deptname;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptname) {  // Constructor information.
        super(id, name, socialSecurityNumber, salary);   // Information needed from the parent class. i.e methods and variable names.
        this.deptname = deptname;
    }

    public String getDeptName() {
        return deptname;
    }
}
