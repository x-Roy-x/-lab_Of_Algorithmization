import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InsuranceWriterTest {

    InsuranceWriter insuranceWriter = null;
    List<Insurance> list = null;

    @Before
    public void setUp(){
        insuranceWriter = new InsuranceWriter();
        list = new ArrayList<>();
        list.add(new Family(4, 28, false, "Lviv", 6000, PropertyType.House));
        list.add(new Corporate("SoftServe", 12, false, "Lviv", 1000000, PropertyType.Fire));
        list.add(new Personal(false, 45, true, "Rivne", 1200, PropertyType.Life));
        list.add(new Corporate("Epam", 15, true, "Lviv", 1900000, PropertyType.Catastrofe));
        list.add(new Family(3, 45, true, "Lviv", 78000, PropertyType.Health));

    }

    @Test
    public void writeToFile() {
        insuranceWriter.writeToFile(list);
    }
}