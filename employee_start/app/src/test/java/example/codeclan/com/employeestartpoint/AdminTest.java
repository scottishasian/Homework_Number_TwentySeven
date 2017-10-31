package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminTest {


    Admin admin;


    @Before
    public void before() {
        admin = new Admin(4, "Ragnar", "A32353424V", 22000.00, "Human Resources");
    }


    @Test
    public void canGetEmployeeId() {
        assertEquals(4, admin.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Ragnar", admin.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("A32353424V", admin.getSocialSecurityNumber());
    }


    @Test
    public void canSetEmployeeName() {
        admin.setName("Betty");
        assertEquals("Betty", admin.getName());
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(100.00);
        assertEquals(22100.00, admin.getSalary(), 0.01);


    }

    @Test
    public void canFindDeptName() {
        assertEquals("Human Resources", admin.getDeptName());
    }
}