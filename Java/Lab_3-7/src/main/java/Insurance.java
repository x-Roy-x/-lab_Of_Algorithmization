import java.awt.*;
import java.util.LinkedList;

public class Insurance {

	private int age;
	private boolean health;
	private String residencePlace;
	private StatusType type;
	public int income;
	public PropertyType specific;
	private LinkedList insurancesList;


	public Insurance(int age, boolean health, String residencePlace, int income, PropertyType specific) {
		this.age = age;
		this.health = health;
		this.residencePlace = residencePlace;
		this.income = income;
		this.specific = specific;
		chooseStatus(income);
	}

	public Insurance() {
	}

	public StatusType chooseStatus(int income) {
		if ((3200 <= income) && (income <= 6400)) {
			this.type = StatusType.Poor;
		} else if ((6400 < income) && (income <= 12800)) {
			this.type = StatusType.Average;
		} else if (12800 < income) {
			this.type = StatusType.Rich;
		} else {
			this.type = StatusType.Poor;
		}
		return type;
	}

	public String getHeaders() {
        return "age, health, residencePlace, income, specific ";
    }

    public String toCSV() {
        return getAge() + ", " + isHealth() + ", " + getResidencePlace() + ", " + getIncome() + ", " + getSpecific()
				+ ", " + getType();
    }
	public int getCalculateRisk() {
		int risk = specific.getCoefficientProperty() *100 * type.getNumberStatus();
		return risk;
	}
	
	@Override
	public String toString() {
		return "Insurance type: " + this.specific + ", status: " + this.type + ", income: " + this.income + ", risk:"
				+ getCalculateRisk() + "\n";
	} 
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}


	public String getResidencePlace() {
		return residencePlace;
	}

	public void setResidencePlace(String residencePlace) {
		this.residencePlace = residencePlace;
	}


	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}


	public PropertyType getSpecific() {
		return specific;
	}

	public void setSpecific(PropertyType specific) {
		this.specific = specific;
	}


	public StatusType getType() {
		return type;
	}

	public void setType(StatusType type) {
		this.type = type;
	}

}
