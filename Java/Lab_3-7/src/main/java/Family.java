
public class Family extends Insurance {
    private int quantityPerson;




    public Family(int quantityPerson, int age, boolean health, String residencePlace, int income, PropertyType specific) {
        super(age, health, residencePlace, income, specific);
        this.quantityPerson = quantityPerson;
    }

    @Override
    public String toString() {
        return "Insurance type: " + this.specific + ", status: " + ", income: " + this.income + ", risk:"
                + getCalculateRisk() + " quantity:" + this.quantityPerson + "\n";
    }

    public int getQuantityPerson() {
        return quantityPerson;
    }

    public void setQuantityPerson(int quantityPerson) {
        this.quantityPerson = quantityPerson;
    }
    public String getHeaders() {
        return "age, health, residencePlace, income, specific,quantityPerson ";
    }

    public String toCSV() {
        return super.toCSV()+ ", " + getQuantityPerson();
    }
}
