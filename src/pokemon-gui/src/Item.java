/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This abstract class is the superclass of all items that can be used by the player.
 */
public  abstract class Item{
	
	/**
	 * Name of the item.
	 */
	protected String name;
	/**
	 * Price of the item.
	 */
	protected long cost;
	
	/**
	 * This constructor sets the name of the item. 
	 * @param name name of the Item.
	 */ 
	public Item(String name){
		setName(name);
	}
	
	/**
	 * This method sets the name of the item.
	 * @param name name to be assigned to the item.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	
	/*
	 * This method serves as an abstract class that sets the cost that is furthered by individual implementations of the setting.
	 * @param name name of the item that will determine its price.
	 */
	public abstract void setCost(String name); 
	
	/**
	 * This method gets the name of the Fishing item.
	 * @return name of the Item
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the cost of the Fishing item.
	 * @return cost of the item
	 */
	public long getCost(){
		return this.cost;
	}	
}