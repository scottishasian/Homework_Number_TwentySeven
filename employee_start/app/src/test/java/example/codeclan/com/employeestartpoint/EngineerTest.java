package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EngineerTest {


    Engineer engineer;


    @Before
    public void before() {
        engineer = new Engineer(3, "Shonna", "A2312231X", 32000.00, "Development");
    }


    @Test
    public void canGetEmployeeId() {
        assertEquals(3, engineer.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Shonna", engineer.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("A2312231X", engineer.getSocialSecurityNumber());
    }


    @Test
    public void canSetEmployeeName() {
        engineer.setName("Betty");
        assertEquals("Betty", engineer.getName());
    }

    @Test
    public void canRaiseSalary() {
        engineer.raiseSalary(100.00);
        assertEquals(32100.00, engineer.getSalary(), 0.01);


    }

    @Test
    public void canFindDeptName() {
        assertEquals("Development", engineer.getDeptName());
    }
}