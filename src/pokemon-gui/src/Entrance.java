/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This method refers to the tile connecting the maps to each other.
 */
public class Entrance extends Tile{
	/*
	 * Contains the Terrain where it is connected to.
	 */
	private Terrain entranceTo;
	
	/*
	 * Sets the entry point of the entrance tile and as well as its name.
	 *
	 * @param name name of the Tile for referencing.
	 * @param terrain Terrain object that is being connected to by the tile.
	 */
	public Entrance(String name, Terrain terrain){
		super(name);
		entranceTo = terrain;
	}
	
	/*
	 * This method returns the terrain pointed to by the tile.
	 * @returns Terrain where the tile is connected to.
	 */
	public Terrain accessLocale(){
		return entranceTo;
	}
	
	/* 
	 * This method sets where the tile is connected to.
	 * @param locale Locale that will be pointed to by the Tile.
	 */
	public void setEntranceTo(Locale locale){	
		entranceTo = locale;
	}
}