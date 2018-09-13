public class TileObject{
	
	/**
	 * name of the object
	 */
	protected String  name;
	/**
	 * the encounter rate of the object
	 */
	protected int     encounterRate;
	/**
	 * capture rate of the object
	 */
	protected int     captureRate;
	
	public TileObject(String name){
		setName(name);
	}
	
	/**
	 * This method sets the name of the pokemon
	 * @param name name of the pokemon where the name will be assigned.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * This function gets the name of the pokemon
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the encounter rate of the pokemon
	 */
	public int getEncounterRate(){
		return this.encounterRate;
	}
	
	/**
	 * This method gets the capture rate of the pokemon
	 */
	public int getCaptureRate(){
		return this.captureRate;
	}
	
	/**
	 * This method updates the encounter rate of the pokemon
	 * @param rate the new encounter rate of the pokemon
	 */
	public void updateEncounterRate(int rate){
		this.encounterRate = rate;
	}
}