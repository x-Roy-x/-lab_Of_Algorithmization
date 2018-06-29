import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsuranceTest {
    Insurance insurance = null;
    @Before
    public void setUp (){
        insurance = new Insurance(45,true,"Name",8900,PropertyType.Fire);
    }



    @Test
    public void toStringTest() {
        assertNotNull(insurance.getAge());
        assertNotNull(insurance.isHealth());
        assertNotNull(insurance.getResidencePlace());
        assertNotNull(insurance.getIncome());
        assertNotNull(insurance.getSpecific());
    }

    @Test
    public void getAge() {
        insurance.setAge(20);
        assertEquals(20,insurance.getAge());
    }

    @Test
    public void setAge() {
        insurance.setAge(30);
        assertEquals(30,insurance.getAge());
    }

    @Test
    public void isHealth() {
        insurance.setHealth(true);
        assertTrue(insurance.isHealth());
    }

    @Test
    public void setHealth() {
        insurance.setHealth(true);
        assertTrue(insurance.isHealth());
    }

    @Test
    public void getResidencePlace() {
        insurance.setResidencePlace("Name");
        assertEquals("Name",insurance.getResidencePlace());
    }

    @Test
    public void setResidencePlace() {
        insurance.setResidencePlace("Name");
        assertEquals("Name",insurance.getResidencePlace());
    }

    @Test
    public void getIncome() {
        insurance.setIncome(7003);
        assertEquals(7003,insurance.getIncome());

    }

    @Test
    public void setIncome() {
        insurance.setIncome(5585);
        assertEquals(5585,insurance.getIncome());
    }

    @Test
    public void getSpecific() {
        insurance.setSpecific(PropertyType.Health);
        assertEquals(PropertyType.Health,insurance.getSpecific());
    }

    @Test
    public void setSpecific() {
        insurance.setSpecific(PropertyType.Life);
        assertEquals(PropertyType.Life,insurance.getSpecific());
    }

    @Test
    public void getType() {
        insurance.setType(StatusType.Poor);
        assertEquals(StatusType.Poor,insurance.getType());
    }

    @Test
    public void setType() {
    insurance.setType(StatusType.Average);
    assertEquals(StatusType.Average,insurance.getType());
}
}