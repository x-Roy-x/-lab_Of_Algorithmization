
public class Personal extends Insurance {
    private boolean caretaker;




    public Personal(boolean caretaker, int age, boolean health, String residencePlace, int income, PropertyType specific) {
        super(age, health, residencePlace, income, specific);
        this.caretaker = caretaker;
    }

    @Override
    public String toString() {
        return "Insurance type: " + this.specific + ", status: "  + ", income: " + this.income + ", risk:"
                + getCalculateRisk() + " caretaker :" + this.caretaker + "\n";
    }

    public boolean isCaretaker() {
        return caretaker;
    }

    public void setCaretaker(boolean caretaker) {
        this.caretaker = caretaker;
    }
    public String getHeaders() {
        return "age, health, residencePlace, income, specific, specific,caretaker ";
    }

    public String toCSV() {
        return super.toCSV()+ ", " + isCaretaker();
    }

}
