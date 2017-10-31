package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

public class Manager extends Employee {

    private String deptname;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptname) {
        super(id, name, socialSecurityNumber, salary);
        this.deptname = deptname;
    }

    public String getDeptName() {
        return deptname;
    }
}
