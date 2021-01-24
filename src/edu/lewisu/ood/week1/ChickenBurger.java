package edu.lewisu.ood.week1;

public class ChickenBurger implements Burger {

	@Override
	public String details() {
		return "chicken burger";
	}


	@Override
	public Double price() {
		return 10.0;
	}

}
