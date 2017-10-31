package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {


    Manager manager;


    @Before
    public void before() {
        manager = new Manager(2, "Chad", "A2414232C", 30001.00, "Finance");

    }


    @Test
    public void canGetEmployeeId() {
        assertEquals(2, manager.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Chad", manager.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("A2414232C", manager.getSocialSecurityNumber());
    }


    @Test
    public void canSetEmployeeName() {
        manager.setName("Betty");
        assertEquals("Betty", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100.00);
        assertEquals(30101.00, manager.getSalary(), 0.01);


    }

    @Test
    public void canFindDeptName() {
        assertEquals("Finance", manager.getDeptName());

    }

}