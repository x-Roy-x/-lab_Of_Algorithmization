import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InsuranceMenegerTest {
    InsuranceManager insuranceManager = null;
    List<Insurance> insuranceListTest = null;

    @Before
    public void setUp() {
        insuranceListTest = new ArrayList<Insurance>();
        insuranceListTest.add(new Corporate("Name", 14, false, "Name", 4000, PropertyType.Pension));
        insuranceListTest.add(new Family(4, 15, true, "Name", 5000, PropertyType.Life));
        insuranceListTest.add(new Personal(true, 15, false, "Name", 15700, PropertyType.Catastrofe));
        insuranceManager= new InsuranceManager(insuranceListTest);
    }

    @Test
    public void findByStatus() {
        int income = 12500;
        List<Insurance> foundInsuranceList = insuranceManager.findByStatus(insuranceListTest, income);
        for (Insurance insurance : foundInsuranceList) {
            if (insurance.getIncome() < income) {
                assertTrue(true);
            }

        }
    }

    @Test
    public void findByType() {

        List<Insurance> foundInsuranceList = insuranceManager.findByType(insuranceListTest, StatusType.Average);
        for (Insurance insurance : foundInsuranceList) {
            if (insurance.getType() == StatusType.Average) {
                assertTrue(true);
            }
        }
    }

    @Test
    public void sortByRisk() {
        insuranceManager.sortByRisk(insuranceListTest);
        double byRisk = 0;
        for (Insurance insurance : insuranceListTest) {
            if (insurance.getCalculateRisk() > byRisk) {
                assertTrue(true);
                byRisk = insurance.getCalculateRisk();
            } else {
                assertTrue(false);
            }
        }
    }
}