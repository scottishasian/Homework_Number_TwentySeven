package example.codeclan.com.employeestartpoint;

/**
 * Created by kynansong on 31/10/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DirectorTest {

    Director director;


    @Before
    public void before() {
        director = new Director(5, "Sigurd", "A34646423C", 30002.00, "Sales", 40000);
    }


    @Test
    public void canGetEmployeeId() {
        assertEquals(5, director.getId());
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Sigurd", director.getName());
    }

    @Test
    public void canGetEmployeeSSn() {
        assertEquals("A34646423C", director.getSocialSecurityNumber());
    }


    @Test
    public void canSetEmployeeName() {
        director.setName("Betty");
        assertEquals("Betty", director.getName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100.00);
        assertEquals(30102.00, director.getSalary(), 0.01);


    }

    @Test
    public void canFindDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canFindBudget() {
        assertEquals(40000, director.getBudget(), 0.01);
    }

}
