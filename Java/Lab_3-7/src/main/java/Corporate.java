
public class Corporate extends Insurance {
    private String name;



    public Corporate(String name, int age, boolean health, String residencePlace, int income, PropertyType specific) {
        super(age, health, residencePlace, income, specific);
        this.name = name;
    }
    public String getHeaders() {
        return "age, health, residencePlace, income, specific,name";
    }

    public String toCSV() {
        return super.toCSV()+ ", "+ getName();
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
