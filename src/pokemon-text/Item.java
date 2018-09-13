public  abstract class Item{
	
	/**
	 * Name of the item.
	 */
	protected String name;
	/**
	 * Price of the item.
	 */
	protected long cost;
	
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
	
	public abstract void setCost(String name); 
	
	/**
	 * This method gets the name of the Fishing item.
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the cost of the Fishing item.
	 */
	public long getCost(){
		return this.cost;
	}	
}