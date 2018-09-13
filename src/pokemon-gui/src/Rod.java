/** 
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the Fishing rod of the player 
 */
public class Rod extends Item{
	
	/**
	 * contains the encounter rate of the reel.
	 */
	private int    encounterRate;
	/**
	 * contains the capture rate of the reel.
	 */
	private int    captureRate;
	/**
	 * contains the lure customization of the rod.
	 */
	private Lure   lure;
	/**
	 * contains the line customization of the rod.
	 */
	private Line   line;
	/**
	 * contains the reel customization of the rod.
	 */
	private Reel   reel;
	
	/**
	 * initializes the default rod.
	 * @param name name of the rod.
	 */
	public Rod(String name){
		super(name);
		setCost(name);
		setCaptureRate(name);
		setEncounterRate(name);
		setLure();
		setLine();
		setReel();
	}
	
	/**
	 * The method assigns the cost of the fishing rod given the name.
	 * @param name name of the string used for identification of the rod's cost
	 */
	public void setCost(String name){
		if(name.equals("Old Rod"))
			this.cost = 0;
		else if(name.equals("Good Rod"))
			this.cost = 3000;
		else if(name.equals("Super Rod"))
			this.cost = 8000;
		else if(name.equals("Master Rod"))
			this.cost = 20000;
	}
	
	/**
	 * This method sets the encounter rate bonus of the Fishing rod, given its name
	 * @param name name of the rod where the encounter rate bonus will be assigned to.
	 */
	public void setEncounterRate(String name){
		if(name.equals("Old Rod"))
			this.encounterRate = 0;
		else if(name.equals("Good Rod"))
			this.encounterRate = 10;
		else if(name.equals("Super Rod"))
			this.encounterRate = 15;
		else if(name.equals("Master Rod"))
			this.encounterRate = 20;
	}
	
	/**
	 * This method sets the capture rate bonus of the Fishing rod, given its name.
	 * @param name name of the rod where the capture rate bonus will be assigned to.
	 */
	public void setCaptureRate(String name){
		if(name.equals("Old Rod"))
			this.captureRate = 0;
		else if(name.equals("Good Rod"))
			this.captureRate = 5;
		else if(name.equals("Super Rod"))
			this.captureRate = 20;
		else if(name.equals("Master Rod"))
			this.captureRate = 40;
	}
	
	/**
      * This method sets the lure of the rod.
	  *  
	  */	
	public void setLure(){
		this.lure = new Lure("Basic Lure");
	}
	
	/**
      * This method sets the rod of the rod.
	  * 
	  */		
	public void setLine(){
		this.line = new Line("Basic Line");
	}
	
	/**
      * This method sets the reel of the rod.
	  *
	  */		
	public void setReel(){
		this.reel = new Reel("Basic Reel");
	}
	
	/**
      * This method gets the encounter rate bonus of the rod.
	  * @return encounter rate bonus of the rod with all its upgrades.
	  */			
	public int getEncounterRate(){
		return (this.encounterRate + this.getLure().getEncounterRate() + this.getLine().getEncounterRate() + this.getReel().getEncounterRate());
	}
	
	/**
      * This method gets the capture rate bonus of the rod.
	  * @return capture rate bonus of the rod with all its upgrades.
	  */			
	public int getCaptureRate(){
		return (this.captureRate + this.getLure().getCaptureRate() + this.getLine().getCaptureRate() + this.getReel().getCaptureRate());
	}

	/**
      * This method returns the lure of the rod.
	  * @return equipped lure in the fishing rod.
	  */		
	public Lure getLure(){
		return this.lure;
	}
	
	/**
      * This method returns the rod of the rod.
	  * @return equipped line in the fishing rod.
	  */		
	public Line getLine(){
		return this.line;
	}
	
	/**
      * This method returns the reel of the rod.
	  * @return reel in the rod
	  */		
	public Reel getReel(){
		return this.reel;
	}
	
	/**
      * This method allows the player to equip a new Lure.
	  * @param newLure Lure that will replace the rod's current lure.
	  */		
	public void equipLure(Lure newLure){
		this.lure = newLure;
	}
	
	/**
      * This method allows the player to equip a new Line.
	  * @param newLine Line that will replace the rod's current line.
	  */		
	public void equipLine(Line newLine){
		this.line = newLine;
	}
	
	/**
      * This method allows the player to equip a new Reel.
	  * @param newReel Reek that will replace the rod's current reel.
	  */		
	public void equipReel(Reel newReel){
		this.reel = newReel;
	}
}