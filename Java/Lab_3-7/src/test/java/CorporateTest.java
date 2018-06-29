import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateTest {
    Corporate corporate =null;
    @Before
    public void setUp(){
        corporate = new Corporate("Name",14,false,"Name",7000,PropertyType.Pension);
    }


    @Test
    public void getName() {
    corporate.setName("Igor");
    assertEquals("Igor",corporate.getName());
    }

    @Test
    public void setName() {
        corporate.setName("Igor");
        assertEquals("Igor",corporate.getName());
    }
}