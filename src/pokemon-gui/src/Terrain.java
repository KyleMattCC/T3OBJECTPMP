public class Terrain{
	
	/**
     * Port tile that will be added to each map later on.
	 */
	protected Tile 				port = new Tile ("Port");
	/**
     * Shallow tile holding a pokemon having the same hometype.
	 */
	protected Tile 				shallow = new Tile ("shallow");
	/**
     * Deep tile holding a pokemon having the same hometype.
	 */
	protected Tile 				deep = new Tile ("deep");
	/**
     * Very Deep tile holding a pokemon having the same hometype.
	 */
	protected Tile 				vDeep = new Tile ("vDeep");
	/**
     * Legendary tile holding a pokemon having the same hometype.
	 */
	protected Tile 				legendary = new Tile ("legendary");
	/**
     * Treasure tile holding a treasure sellable by the end of the day.
	 */
	protected Tile 				treasure = new Tile ("treasure");
	/**
     * Land tile denoting impassable terrain. (for MP specs purposes)
	 */
	protected Tile 				land = new Tile ("Land");
	/**
	 * Impassable tile for use in designer tiles.
	 */
	protected Tile				impass = new Tile ("Impassable");
	/**
	 * Road tile for player to walk on
	 */
	protected Tile				road = new Tile ("Road");
	/**
	 * Sign tile allowing player to read where the road leads to.
	 */
	protected Tile				sign = new Tile ("Sign");
	/**
	 * Shop tile allowing player to read where the road leads to.
	 */
	protected Tile				shop = new Tile ("Shop");
	/**
	 * Exit tile that shows where player can leave a terrain.
	 */
	protected Tile				exit = new Tile ("Exit");
	/**
	 * String holding the name of the terrain.
	 */
	protected String mapName;
	/**
	 * 2d Tile array holding the tiles that can either have pokemons, treasures, or simpoly impassable
	 */ 
	protected Tile[][] terrain;
	/**
	  * Boolean that contains whether a map can be entered or not
	  */
	private boolean          allowedAccess; 
	
	/**
	 * This method initializes the whole terrain.
	 * @param name String that has the name of the terrain
	 */
	public Terrain(String name){
		setMapName(name);
		setAccessable(mapName);
	}
	
	/**
	 * This method sets the name of the terrain
	 * @param mapName holds the name of the Terrain
	 */
	public void setMapName(String mapName){
		this.mapName = mapName;
	}
	
	/**
	 * This method sets whether a given map is impassable.
	 * @param mapName String holding the name of the terrain.
	 */
	public void setAccessable(String mapName){
		if(mapName.equals("Route 119") || mapName.equals("Fiore's Sea") || mapName.equals("Marine Cave"))
			allowedAccess = false;
		else
			allowedAccess = true;
	}
	
	/**
	 * This method gets the name of the terrain
	 * @return name of the terrain
	 */
	public String getName(){
		return this.mapName;
	}
	
	/**
	 * This method accesses a tile given the coordinates.
	 * @param x integer holding the x-coordinate to be accessed
	 * @param y integer holding the y-coordinate to be accessed
	 * @return tile that is in the coordinates
	 */
	public Tile accessCoordinate(int x, int y){
             if((x >= 0 && x < 11) && (y >=0 && y < 11))
		return this.terrain[x][y];
             return null;
	}
    
	/**
	 * This method gets the index of the map.
	 * @return index of the map.
	 */
	public int getMapIndex(){
            return 0;
	}
    
	/**
	 * This method gets the index of the store.
	 * @return index of the store
	 */
    public int getStoreIndex(){
        return 1;
    }
	
	/**
	 * This method returns a boolean that says whether the map is accessible or not.
	 * @return true if accessible, otherwise false
	 */
	public boolean isAccessible(){
		return this.allowedAccess;
	}
	
	/**
	 * This method modifies the accessibility of a terrain.
	 * @param value boolean that determines whether the map can ve accessible or not.
	 */
	public void changeAccessible(boolean value){
		this.allowedAccess = value;
	}
			
	/**
	 * This method returns the terrain as a whole.
	 * @return Terrain as a whole
	 */
    public Terrain accessLocale(){
		return null;
	}
        
}