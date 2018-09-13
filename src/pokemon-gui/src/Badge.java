/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * Refers to the player's badges.
 */
public class Badge{
	
    /**
     * Name of the badge.
     */
    private String  name;
	
    /**
     * Contains true or false whether the player has already obtained a specific badge.
     */
    private boolean playerHas;	
	
    /**
     * Initializes the basic information of a badge.
     * @param name the name of the badge.
     */
    public Badge(String name){
    	setName(name);
    	setBadge(false);
    }

    /**
     * This method sets the name of the badge.
     * @param name the name to be assigned to the badge name.
     */
    public void setName(String name){
    	this.name = name;
    }
	
    /**
     * This method sets the acquisition of the badge to false.
     * @param got contains either true or false that will state if the badge is already obtained
     */
    public void setBadge(boolean got){
    	this.playerHas = got;
    }

    /**
     * This method returns the name of the badge.
     * @return name of the badge
     */
    public String getName(){
    	return this.name;
    }
	
    /**
     * This method returns a boolean indicating whether the player has the badge or not.
     * @return true if player has the badge, false otherwise
     */
    public boolean hasBadge(){
		return this.playerHas;
	}
	
	
}
