/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the Tackle box that determines the number of casts a player can do per day.
 */
public class TackleBox extends Item{
	
	/**
	 * Number of possible casts of a tackle box.
	 */
	private int  casts;
	
	/**
	 * Initializes the default of a tackle box.
	 * @param name name of the tackle box.
	 */
	public TackleBox(String name){
		super(name);
		setCost(name);
		setCasts(name);
	}
	
	/**
	 * This method sets the cost of the Tackle Box, given its name.
	 * @param name name of the Tackle Box where the cost will be assigned to.
	 */
	public void setCost(String name){
		if(name.equals("Basic Tackle Box"))
			this.cost = 0;
		else if(name.equals("Good Tackle Box"))
			this.cost = 1500;
		else if(name.equals("Super Tackle Box"))
			this.cost = 2000;
		else if(name.equals("Master Tackle Box"))
			this.cost = 2500;
	}
	
	/**
	 * This method sets the casts of the tackle box.
	 * @param name name of the tackle box where the name will be assigned.
	 */
	public void setCasts(String name){
		if(name.equals("Basic Tackle Box"))
			this.casts = 5;
		else if(name.equals("Good Tackle Box"))
			this.casts = 8;
		else if(name.equals("Super Tackle Box"))
			this.casts = 10;
		else if(name.equals("Master Tackle Box"))
			this.casts = 15;
	}
	
	/**
	 * This method gets the casts of the tackle box.
	 * @return maximum casts offered by the tacklebox.
	 */
	public int getCasts(){
		return this.casts;
	}
}