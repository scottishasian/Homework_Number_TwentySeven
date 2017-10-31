package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;



    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "AB123456C", 30000.00 );
        manager = new Manager(2, "Chad", "A2414232C", 30001.00, "Finance");
        engineer = new Engineer(3, "Shonna", "A2312231X", 32000.00, "Development");
        admin = new Admin(4, "Ragnar", "A32353424V", 22000.00, "Human Resources");
        director = new Director(5, "Sigurd", "A34646423C", 30002.00, "Sales");
    }


    @Test
    public void canGetEmployeeId() {
        assertEquals(1, employee.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("AB123456C", employee.getSocialSecurityNumber());
    }


    @Test
    public void canSetEmployeeName() {
        employee.setName("Betty");
        assertEquals("Betty", employee.getName());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(100.00);
        assertEquals(30100.00, employee.getSalary(), 0.01);

    }

    @Test
    public void canFindDeptName() {
        assertEquals("Finance", manager.getDeptName());
        assertEquals("Development", engineer.getDeptName());
        assertEquals("Human Resources", admin.getDeptName());
    }


//@Test
//    public void canSetEmployeeId() {
//        employee.setId(99);
//        assertEquals(99, employee.getId());
//    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("XY987654Z");
//        assertEquals("XY987654Z", employee.getSocialSecurityNumber());
//    }
//
//    @Test
//    public void canSetEmployeeSalary() {
//        employee.setSalary(40000.00);
//        assertEquals(40000.00, employee.getSalary(), 0.01);
//    }
}
