public class LunchComboRunner
{
	public static void main(String[] args)
	{
		Sandwich cheeseBurger = new Sandwich("Cheese Burger", 3.50);
		Sandwich chicken = new Sandwich("Chicken Sandwich", 3.00);
		Sandwich club = new Sandwich("Club Sandwich", 2.75);

		Salad spinach = new Salad("Spinach Salad", 1.25);
		Salad slaw = new Salad("Coleslaw", 1.25);
		Salad pickel = new Salad("Pickel", 1.25);

		Drink orange = new Drink("Orange Soda", 1.25);
		Drink icedTea = new Drink("Iced Tea", 1.50);
		Drink cola = new Drink("Cola", 3.50);

		LunchCombo trio1 = new LunchCombo(cheeseBurger, slaw, orange);
		LunchCombo trio2 = new LunchCombo(club, spinach, cappuccino);

		System.out.println(trio1);
		System.out.println(trio2);
	}
}

/*
Cheese Burger / Coleslaw / Orange Soda Trio 4.75
Club Sandwich / Spinach Salad / Cappuccino Trio 6.25
Press any key to continue . . . 
*/