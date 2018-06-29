package ua.lviv.iot.persistence.dao;

public class Menu {

	public static void main(String[] args) {
		Dish soup = new Dish();
		Dish potato = new Dish("soup", 5, true);
		Dish croissant = new Dish("soup", "potato", 10, true);
		Dish all = new Dish("soup", "potato", "croissant", 15, true);

		System.out.println(soup.toString());
		System.out.println(potato.toString());
		System.out.println(croissant.toString());
		System.out.println(all.toString());

		soup.printStaticSum();
		potato.printStaticSum();
		croissant.printStaticSum();
		all.printStaticSum();

		all.printSum();
	}
}
