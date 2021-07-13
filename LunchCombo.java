public class LunchCombo implements MenuItem
{
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	

	public LunchCombo(Sandwich aSandwich, Salad aSalad, Drink aDrink)
	{
		sandwich = aSandwich;
		salad = aSalad;
		drink = aDrink;
	}

	public String getName()
	{
		return sandwich.getName() + " / " + salad.getName() + " Combo w/ " + drink.getName();
	}

	public double getPrice()
	{
		return sandwich.getPrice() + salad.getPrice();
	}

	public String toString()
	{
		return getName() + " " + getPrice();
	}
}


