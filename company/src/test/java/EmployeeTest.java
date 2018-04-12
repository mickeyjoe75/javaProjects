import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("IT", "Ewan Stronge", "SH125890A", 55000);
    }

    @Test
    public void managerHasName(){
        assertEquals("Ewan Stronge", manager.getName());
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("SH125890A", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(55000,manager.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(55200,manager.raiseSalary(200),0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(550,manager.payBonus(),0.01);
    }

}
