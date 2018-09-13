/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the lure of the player 
 */
public class Lure extends Item{
	
	/**
	 * Bonus encounter rate of the lure.
	 */
	private int  encounterRate;
	/**
	 * Bonus capture rate of the lure.
	 */
	private int  captureRate;
	
	/**
	 * Initializes the default of the lure
	 * @param name name of the lure
	 */
	public Lure(String name){
		super(name);
		setCost(name);
		setEncounterRate(name);
		setCaptureRate(name);
	}
	
	/**
	 * This method sets the cost of the lure, given its name
	 * @param name name of the lure where the price will be assigned
	 */
	public void setCost(String name){
		if(name.equals("Basic Lure"))
			this.cost = 0;
		else if(name.equals("Great Lure"))
			this.cost = 500;
		else if(name.equals("Ultra Lure"))
			this.cost = 700;
		else if(name.equals("Master Lure"))
			this.cost = 900;
	}
	
	/**
	 * This method sets the encouter rate bonus of the lure, given its name
	 * @param name name of the lure where the bonus encounter rate will be assigned
	 */
	public void setEncounterRate(String name){
		if(name.equals("Basic Lure"))
			this.encounterRate = 0;
		else if(name.equals("Great Lure"))
			this.encounterRate = 5;
		else if(name.equals("Ultra Lure"))
			this.encounterRate = 10;
		else if(name.equals("Master Lure"))
			this.encounterRate = 30;
	}
	
	/**
	 * This method sets the capture rate bonus of the lure, given its name
	 * @param name name of the lure where the bonus capture rate will be assigned
	 */
	public void setCaptureRate(String name){
		if(name.equals("Basic Lure"))
			this.captureRate = 0;
		else if(name.equals("Great Lure"))
			this.captureRate = 5;
		else if(name.equals("Ultra Lure")) 
			this.captureRate = 5;
		else if(name.equals("Master Lure"))
			this.captureRate = 7;
	}
	
	/**
	 * This method gets the encounter rate bonus of the lure
	 * @return encounter rate bonus of the lure
	 */
	public int getEncounterRate(){
		return this.encounterRate;
	}
	
	/**
	 * This method gets the capture rate bonus of the lure
	 * @return capture rate bonus of the lure
	 */
	public int getCaptureRate(){
		return this.captureRate;
	}
}