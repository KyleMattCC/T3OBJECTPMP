/** 
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the Fishing boat of the player 
 */
public class Boat extends Item{

	/**
	 * contains the possible moves of the boat.
	 */
	private double   moves;
	
	/**
	 * contains true or false whether the boat is equipped with an engine.
	 */
	private boolean hasEngine;
	
	private boolean canInstall;
	
	/**
	 * initializes the default information of a boat.
	 * @param name the name of the boat.
	 */
	public Boat(String name){
		super(name);
		setMoves(name);
		setCost(name);
		setEngine(name);
	}
	
	
	/**
	 * This method sets the number of possible moves of the boat, given its name.
	 * @param name name of the boat.
	 */
	public void setMoves(String name){
		if(name.compareTo("Row Boat") == 0){
			this.moves = 5;
		}else if(name.compareTo("Speed Boat") == 0){
			this.moves = 10;
		}else if(name.compareTo("Sharpedo Boat") == 0){
			this.moves = 15;
		}else if(name.compareTo("Lapras") == 0){
			this.moves = 25;
		}
	}
	
	/**
	 * This method sets the cost of the boat, given its name.
	 * @param name name of the boat.
	 */
	public void setCost(String name){
		if(name.compareTo("Row Boat") == 0){
			this.cost = 0;
		}else if(name.compareTo("Speed Boat") == 0){
			this.cost = 3500;
		}else if(name.compareTo("Sharpedo Boat") == 0){
			this.cost = 5000;
		}else if(name.compareTo("Lapras") == 0){
			this.cost = -1;
		}
	}
	
	/**
	 * This method initializes the engine of the boat to false.
	 * @param name name of the boat.
	 */
	public void setEngine(String name){
		this.hasEngine = false;
		
		if(name.equals("Lapras"))
			this.canInstall = false;
		else
			this.canInstall = true;
	}
	
	/**
	 * This method gets the possible moves of the boat.
	 */
	public double getMoves(){
		return this.moves;
	}
	
	/**
	 * This method returns whether the boat has an engine or not.
	 */
	public boolean hasEngine(){
		return this.hasEngine;
	}
	
	/**
	 * This method updates the boolean of the hasEngine to true.
	 */
	public boolean upgradeEngine(){
		if(canInstall)
			this.hasEngine = true;
		
		return canInstall;
	}
}