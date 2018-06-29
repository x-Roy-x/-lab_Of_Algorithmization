package ua.lviv.iot.persistence.dao;

public class Dish {
	private static int price = 0;
	private String firstDish;
	private String secondDish;
	private String desert;
	private int weight;
	private boolean hot;


	public Dish() {

	}

	public Dish(String firstDish, int weight, boolean hot) {
		this.firstDish = firstDish;
		this.weight = weight;
		this.hot = hot;
	}

	public Dish(String firstDish, String secondDish, int weight, boolean hot) {
		this.firstDish = firstDish;
		this.secondDish = secondDish;
		this.weight = weight;
		this.hot = hot;
	}

	public Dish(String firstDish, String secondDish, String desert, int weight, boolean hot) {
		this.firstDish = firstDish;
		this.secondDish = secondDish;
		this.desert = desert;
		this.weight = weight;
		this.hot = hot;
		setPrice(weight * 3);
	}

	public String toString() {
		return "The first dish :" + firstDish + ".\nmain course:" + secondDish + ".\ndessert:" + desert;
	}

	public void printStaticSum() {
		System.out.println("weight:" + getWeight());
	}

	public void printSum() {
		System.out.println("Price:" + getPrice());
	}

	public void resetValues(String firstDish, String secondDish, String desert, int weight, boolean hot) {
		this.firstDish = firstDish;
		this.secondDish = secondDish;
		this.desert = desert;
		this.weight = weight;
		this.hot = hot;
	}


	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Dish.price = price;
	}

	public String getFirstDish() {
		return firstDish;
	}

	public void setFirstDish(String firstDish) {
		this.firstDish = firstDish;
	}

	public String getSecondDish() {
		return secondDish;
	}

	public void setSecondDish(String secondDish) {
		this.secondDish = secondDish;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}
}
