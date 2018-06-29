import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class FamilyTest {
    Family family = null;

    @Before
    public void setUp(){
        family = new Family(4,15,true,"Name",5000,PropertyType.Life);
    }
    @Test
    public void toStringTest() {
        assertNotNull(family.getQuantityPerson());
        assertNotNull(family.getAge());
        assertNotNull(family.isHealth());
        assertNotNull(family.getResidencePlace());
        assertNotNull(family.getIncome());
        assertNotNull(family.getSpecific());
    }

    @Test
    public void getQuantityPerson() {
        family.setQuantityPerson(2);
        assertEquals(2,family.getQuantityPerson());
    }


    @Test
    public void setQuantityPerson() {
        family.setQuantityPerson(5);
        assertEquals(5,family.getQuantityPerson());
    }

}