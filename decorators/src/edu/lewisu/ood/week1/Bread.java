package edu.lewisu.ood.week1;

public class Bread extends BurgerIngredients {

	public Bread(Burger burger) {
		this.burger = burger;

	}
	
	@Override
	public String details() {
		return "Bread";
	}

	@Override
	public Double price() {
		return burger.price() +1.0 ;
	}

	
}

				
				
