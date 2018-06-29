import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonalTest {
    Personal personal = null;
    @Before
    public void setUp(){
        personal = new Personal(true,15,false,"Name",5700,PropertyType.Catastrofe);
    }

    @Test
    public void toStringTest() {
        assertNotNull(personal.isCaretaker());
        assertNotNull(personal.getAge());
        assertNotNull(personal.isHealth());
        assertNotNull(personal.getResidencePlace());
        assertNotNull(personal.getIncome());
        assertNotNull(personal.getSpecific());
    }

    @Test
    public void isCaretaker() {
        personal.setCaretaker(true);
        assertTrue(personal.isCaretaker());
    }

    @Test
    public void setCaretaker() {
        personal.setCaretaker(true);
        assertTrue(personal.isCaretaker());
    }
}