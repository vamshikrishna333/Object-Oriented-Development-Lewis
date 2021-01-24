package edu.lewisu.ood.week1;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		
		Burger chickenburger = new ChickenBurger();
		chickenburger = new Bread(chickenburger);
		chickenburger = new Lettuce(chickenburger);
		chickenburger = new Cheese(chickenburger);
		
		
		System.out.println("You orderd - chickenburger");
		System.out.println("Your total amount is - $" + chickenburger.price());

	}

}
