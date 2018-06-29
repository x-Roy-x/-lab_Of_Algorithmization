import java.util.LinkedList;
import java.util.List;

public class InsuranceManager extends Insurance {

    private List<Insurance> availableInsurances = new LinkedList<Insurance>();

    public InsuranceManager(List<Insurance> list) {
        this.availableInsurances = list;
    }

    public List<Insurance> findByStatus(List<Insurance> insuranceList, int income) {
        List<Insurance> result = new LinkedList<Insurance>();
        for (Insurance ins : availableInsurances) {
            if (ins.income == income) {
                result.add(ins);
            }
        }
        return sortByRisk(result);
    }


    public List<Insurance> findByType(List<Insurance> insurances, StatusType statusType) {
        List<Insurance> result = new LinkedList<Insurance>();
        for (Insurance ins : insurances) {
            if (ins.getType() == statusType) {
                result.add(ins);
            }
        }
        return result;
    }

    public List<Insurance> sortByRisk(List<Insurance> list) {
        list.sort((Insurance o1, Insurance o2) -> o1.getCalculateRisk() - o2.getCalculateRisk());
        return list;
    }
}
