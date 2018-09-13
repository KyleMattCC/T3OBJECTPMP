/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the user's character in the fishing game.
 */
public class Tile{
	/**
	 * Contains the name of the tile.
	 */
	private String name;
	/**
	 * Contains the object inside the Tile.
	 */
	private TileObject object;
	/**
	 * Boolean holding whether a tile is passable or not.
	 */
	private boolean passable;
	/**
	 * Boolean holding whether a tile is fishable or not.
	 */
	public boolean fishable;
	
	/**
	 * This method initializes the contents of a tile given its name
	 * @param name String holding the name of the tile
	 */
	public Tile(String name){
		setName(name);
		setPassable(name);
		setFishable(name);
		this.object = null;
	}
	
	/**
	 * This method initializes the name of the tile
	 * @param name name of the tile
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/** 
	 * This method gets the name of the String
	 * @return name of the tile
	 */
	public String getName(){
		return this.name;
	}	
	
	/** 
	 * This method gets the name of the String
	 * @param object object inside the tile.
	 */
	public void setObject(TileObject object){
		this.object = object;
	}
	
	/**
	 * This method returns the object inside the tile.
	 * @return object inside the tile
	 */
	public TileObject getObject(){
		return this.object;
	}
	
	/**
	 * This method sets the tiles to passable or impassable. 
	 * @param name String used for reference whether tile is impassable or not
	 */
	public void setPassable(String name){
		if(name.equals("Land") || name.equals("Impassable") || name.equals("Sign") || name.equals("Store Entrance"))
			this.passable = false;
		else
			this.passable = true;
	}
	
	
	/**
	 * This method changes the ability of the tile to be passable or not.
	 * @param value boolean holding a value whether the ability to enter the tile  is possible.
	 */
	public void changePassable(boolean value){
		this.passable = value;
	}
	
	/**
	 * This method returns if the tile is passable or not
	 * @return true if passable, false if not
	 */
	public boolean isPassable(){
		return this.passable;
	}
	
	/**
	 * This method sets whether a tile can be a fishing spot or not.
	 * @param name String holding the name of the tile for reference	 
	 */
	public void setFishable(String name){
		if(name.equals("Land") || name.equals("Impassable") || name.equals("Sign") || name.equals("Locale Entrance") || name.equals("Store Entrance")|| name.equals("Exit") || name.equals("Road") || name.equals("Port") || name.equals("Shop"))
			this.fishable = false;
		else
			this.fishable = true;
	}
	
	/**
	 * This method returns 
	 * @return return true if fishable or false if not
	 */ 
	public boolean isFishable(){
		return this.fishable;
	}
}