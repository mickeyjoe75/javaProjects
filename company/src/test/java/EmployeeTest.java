import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        manager = new Manager("IT", "Ewan Stronge", "SH125890A", 55000);
        developer = new Developer ("Bradley", "SH125895A", 45000);
        databaseAdmin = new DatabaseAdmin ("Daniel", "SH145895A", 65000);
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
    public void managerGetRaiseSalary(){
        assertEquals(55200,manager.raiseSalary(200),0.00);
    }

    @Test
    public void managerGetPayBonus(){
        assertEquals(550,manager.payBonus(),0.01);
    }

    @Test
    public void developerHasName(){
        assertEquals("Bradley",developer.getName());
    }

}
