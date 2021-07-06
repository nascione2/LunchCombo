public class Sandwich implements MenuItem
{
	private String name;
	private double price;

	public Sandwich(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	/** @return the name of the Sandwich  */
	public String getName()
	{
		return name;
	}

	/** @return the price of the Sandwich  */
	public double getPrice()
	{
		return price;
	}
}