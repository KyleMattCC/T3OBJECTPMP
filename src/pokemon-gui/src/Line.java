/** @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the Fishing Line of the player.
 */
public class Line extends Item{
	
	/**
	 * Bonus encounter rate of the line.
	 */
	private int  encounterRate;
	/**
	 * Bonus capture rate of the line.
	 */
	private int  captureRate;
	
	/**
	 * Initializes the default of the line.
         * @param name String holding the name
	 */
	public Line(String name){
		super(name);
		setCost(name);
		setEncounterRate(name);
		setCaptureRate(name);
	}
	
	/**
	 * This method sets the cost of the line, given its name.
	 * @param name name of the line where the cost will be assigned to.
	 */
	public void setCost(String name){
		if(name.equals("Basic Line"))
			this.cost = 0;
		else if(name.equals("Great Line"))
			this.cost = 700;
		else if(name.equals("Ultra Line"))
			this.cost = 800;
		else if(name.equals("Master Line"))
			this.cost = 900;
	}
	
	/**
	 * This method sets the encounter rate bonus of the Fishing line, given its name
	 * @param name name of the line where the encounter rate bonus will be assigned to.
	 */
	public void setEncounterRate(String name){
		if(name.equals("Basic Line"))
			this.encounterRate = 0;
		else if(name.equals("Great Line"))
			this.encounterRate = 0;
		else if(name.equals("Ultra Line"))
			this.encounterRate = 0;
		else if(name.equals("Master Line"))
			this.encounterRate = 0;
	}
	
	/**
	 * This method sets the capture rate bonus of the Fishing line, given its name.
	 * @param name name of the line where the capture rate bonus will be assigned to.
	 */
	public void setCaptureRate(String name){
		if(name.equals("Basic Line"))
			this.captureRate = 0;
		else if(name.equals("Great Line"))
			this.captureRate = 10;
		else if(name.equals("Ultra Line"))
			this.captureRate = 15;
		else if(name.equals("Master Line"))
			this.captureRate = 25;
	}
	
	/**
	 * This method gets the encounter rate of the Fishing line.
	 * @return encounter rate bonus of the fishing line.
	 */
	public int getEncounterRate(){
		return this.encounterRate;
	}
	
	/**
	 * This method gets the capture rate of the Fishing line.
	 * @return capture rate bonus of the fishing line.
	 */
	public int getCaptureRate(){
		return this.captureRate;
	}
}