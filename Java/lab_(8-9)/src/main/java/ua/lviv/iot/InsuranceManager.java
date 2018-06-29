package ua.lviv.iot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InsuranceManager {
    private List<Insurance>insuranceArrayListnsuranceList = new ArrayList<>();

    public List<Insurance> findByPrice(List<Insurance> list, double price){
        List<Insurance> result = new LinkedList<>();
        for (Insurance i : list){
            if (i.getPrice() < price) {
                result.add(i);
            }
        }
        return result;
    }

    public void sortInsuranceByPrice(List<Insurance> accommodations) {
        accommodations.sort(Comparator.comparing(Insurance::getPrice));
    }

    public List<Insurance> getInsuranceList() {
        return insuranceArrayListnsuranceList;
    }

    public void setInsuranceList(List<Insurance> insuranceArrayListnsuranceList) {
        this.insuranceArrayListnsuranceList = insuranceArrayListnsuranceList;
    }

}
