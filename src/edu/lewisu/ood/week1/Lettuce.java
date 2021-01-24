package edu.lewisu.ood.week1;

public class Lettuce extends BurgerIngredients {

	public Lettuce(Burger burger) {
		this.burger = burger;

	}
	
	@Override
	public String details() {
		return " Lettuce";
	}

	@Override
	public Double price() {
		return burger.price() +1.5 ;
	}
	
	

}
