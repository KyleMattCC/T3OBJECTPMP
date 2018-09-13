/**
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the items of the player on each map 
 */
public class Equipment{
	/**
	 * The currently equipped rod.
	 */
	private Rod 				 fishingRod;
	/**
	 * The currently equipped boat.
	 */
	private Boat 				 fishingBoat;
	/**
	 * The currently equipped tackle box.
	 */
	private	TackleBox 			 tackleBox;

	/**
	 * Initializes the default items.
	 */
	public Equipment(){	
		fishingRod  = new Rod ("Old Rod");
		fishingBoat = new Boat("Row Boat");
		tackleBox   = new TackleBox("Basic Tackle Box");
	}

	/**
	 * This method gets the name of the Fishing Rod.
	 */
	public String getRodName(){
		return this.fishingRod.getName();
	}
	
	/**
	 * This method gets the name of the Fishing Reel
	 */
	public String getReelName(){
		return this.fishingRod.getReel().getName();
	}
	
	/**
	 * This method gets the name of the Fishing Lure.
	 */
	public String getLureName(){
		return this.fishingRod.getLure().getName();
	}
	
	/**
	 * This method gets the name of the Fishing Line.
	 */	
	public String getLineName(){
		return this.fishingRod.getLine().getName();
	}
	
	/**
	 * This method gets the name of the Fishing Boat.
	 */
	public String getBoatName(){
		return this.fishingBoat.getName();
	}
	
	/**
	 * This method gets the name of the Tackle Box.
	 */
	public String getTackleBoxName(){
		return this.tackleBox.getName();
	}
	
	/**
	 * This method gets the Encounter rate bonus.
	 */
	public int getEncounterUp(){
		return this.fishingRod.getEncounterRate();
	}
	
	/**
	 * This method gets the Capture rate bonus.
	 */
	public int getCaptureUp(){
		return this.fishingRod.getCaptureRate();
	}
	
	/**
	 * This method gets the number of moves that can be done by the player.
	 */
	public double getMoves(){
		return this.fishingBoat.getMoves();
	}
	
	/**
	 * This method gets the number of casts that can be done by the player.
	 */
	public int getCasts(){
		return this.tackleBox.getCasts();
	}
	
	/**
	 * This method allows the player to equip the given Fishing Rod.
	 * @param newRod the rod to be equipped.
	 */
	public void equipRod(Rod newRod){
		this.fishingRod = newRod;
	}
	
	/**
	 * This method allows the player to equip the given Fishing Rod.
	 * @param newBoat the boat to be equipped.
	 */
	public void equipBoat(Boat newBoat){
		this.fishingBoat = newBoat;
	}
	
	/**
	 * This method allows the player to equip the given Tackle Box.
	 * @param newTackleBox the tackle box to be equipped.
	 */
	public void equipTackleBox(TackleBox newTackleBox){
		this.tackleBox = newTackleBox;
	}
	
	/**
	 * This method returns the Fishing Rod. 
	 */
	public Rod getRod(){
		return this.fishingRod;
	}
	
	/**
	 * This method returns the Fishing Boat.
	 */
	public Boat getBoat(){
		return this.fishingBoat;
	}
	
	/**
	 * This method allows the player to see his current equipment.
	 * @param cash the available cash of the player.
	 */
	public void showEquipment(long cash){
		System.out.println("\nEQUIPMENTS:");
		System.out.println("Fishing Rod : " + getRodName());
		System.out.println("Fishing Line: " + getLineName());
		System.out.println("Fishing Lure: " + getLureName());
		System.out.println("Fishing Reel: " + getReelName());
		System.out.println("Tackle  Box : " + getTackleBoxName());
		System.out.println("Fishing Boat: " + getBoatName());
		System.out.println("Cash        : " + cash);

	}
}