/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the reel of the player 
 */
public class Reel extends Item{
	
	/**
	 * bonus encounter rate of the reel.
	 */
	private int  encounterRate;
	/**
	 * bonus capture rate of the reel.
	 */
	private int  captureRate;
	
	/**
	 * initializes the default of the reel.
	 * @param name name of the reel.
	 */
	public Reel(String name){
		super(name);
		setCost(name);
		setEncounterRate(name);
		setCaptureRate(name);
	}
	
	/**
	 * This method sets the cost of the reel, given its name
	 * @param name name of the reel where the price will be assigned.
	 */
	public void setCost(String name){
		if(name.equals("Basic Reel"))
			this.cost = 0;
		else if(name.equals("Great Reel"))
			this.cost = 800;
		else if(name.equals("Ultra Reel"))
			this.cost = 950;
		else if(name.equals("Master Reel"))
			this.cost = 1000;
	}
	
	/**
	 * This method sets the encounter rate bonus of the reel, given its name
	 * @param name name of the reel where the bonus encounter rate will be assigned.
	 */
	public void setEncounterRate(String name){
		if(name.equals("Basic Reel"))
			this.encounterRate = 0;
		else if(name.equals("Great Reel"))
			this.encounterRate = 10;
		else if(name.equals("Ultra Reel"))
			this.encounterRate = 18;
		else if(name.equals("Master Reel"))
			this.encounterRate = 21;
	}
	
	/**
	 * This method sets the capture rate bonus of the reel, given its name
	 * @param name name of the reel where the bonus encounter rate will be assigned.
	 */
	public void setCaptureRate(String name){
		if(name.equals("Basic Reel"))
			this.captureRate = 0;
		else if(name.equals("Great Reel"))
			this.captureRate = 10;
		else if(name.equals("Ultra Reel"))
			this.captureRate = 18;
		else if(name.equals("Master Reel"))
			this.captureRate = 21;
	}
	
	/**
	 * This method gets the encounter rate bonus of the reel
	 * @return encounter rate bonus of the reel
	 */	
	public int getEncounterRate(){
		return this.encounterRate;
	}
	
	/**
	 * This method gets the capture rate bonus of the reel
	 * @return capture rate bonus of the reel
	 */
	public int getCaptureRate(){
		return this.captureRate;
	}
}