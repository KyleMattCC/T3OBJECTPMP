/**
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the treasure that can be found in specific parts of the locale.
 */
public class Treasure extends TileObject{
	/**
	 * Price of the treasure.
	 */
	private long   price;

	/**
	 * Initializes the default of the treasure.
	 * @param name name of the treasure.
	 */
	public Treasure(String name){
		super(name);
		setPrice(name);
		this.encounterRate = 25;
		this.captureRate = 100;
	}
	
	/**
	 * This method sets the name of the treasure.
	 * @param name name of the treasure where the name will be assigned.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * This method sets the price of the treasure, given its name.
	 * @param name name of the treasure where the price will be assigned.
	 */
	public void setPrice(String name){
		if(name.equals("Pearl"))
			price = 1000;
		else if(name.equals("Stardust"))
			price = 2500;
		else if(name.equals("Big Pearl"))
			price = 3000;
		else if(name.equals("Nugget"))
			price = 4500;
		else if(name.equals("Big Nugget"))
			price = 10000;
	}
	
	/**
	 * This method gets the price of the treasure.
	 */
	public long getPrice(){
		return this.price;
	}
}