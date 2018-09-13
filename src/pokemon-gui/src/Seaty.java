import java.util.*;

/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the user's character in the fishing game.
 */
public class Seaty extends Terrain{
	
	/**
	 * ArrayList holding the entrances to each map.
	 */
	private ArrayList <Entrance> localeEntrances = new ArrayList <Entrance>();
	/**
	 * One of the entrances used for the map (Hardcoded for easier referencing)
	 */
	private Entrance entry1;
	/**
	 * One of the entrances used for the map (Hardcoded for easier referencing)
	 */
	private Entrance entry2;
	/**
	 * One of the entrances used for the map (Hardcoded for easier referencing)
	 */
	private Entrance entry3;
	/**
	 * One of the entrances used for the map (Hardcoded for easier referencing)
	 */
	private Entrance entry4;
	/**
	 * One of the entrances used for the map (Hardcoded for easier referencing)
	 */
	private Entrance entry5;
	/**
	 * One of the five entrances of the shops (Hardcoded for easier referencing)
	 */
	private Entrance storeEntry1;
	/**
	 * One of the five entrances of the shops (Hardcoded for easier referencing)
	 */
	private Entrance storeEntry2;
	/**
	 * One of the five entrances of the shops (Hardcoded for easier referencing)
	 */
	private Entrance storeEntry3;
	/**
	 * One of the five entrances of the shops (Hardcoded for easier referencing)
	 */
	private Entrance storeEntry4;
	/**
	 * One of the five entrances of the shops (Hardcoded for easier referencing)
	 */
	private Entrance storeEntry5;
	
	/**
	 * One of the terrains that will be a fishing spot.
	 */
	private Locale map1;
	/**
	 * One of the terrains that will be a fishing spot.
	 */
	private Locale map2;
	/**
	 * One of the terrains that will be a fishing spot.
	 */
	 /**
	 * One of the terrains that will be a fishing spot.
	 */
	private Locale map3;
	/**
	 * One of the terrains that will be a fishing spot.
	 */
	private Locale map4;
	/**
	 * One of the terrains that will be a fishing spot.
	 */
	private Locale map5;
	/**
	 * Store that corresponds to the first map
	 */
	private Store store1;
	/**
	 * Store that corresponds to the second map
	 */
	private Store store2;
	/**
	 * Store that corresponds to the third map
	 */
	private Store store3;
	/**
	 * Store that corresponds to the fourth map
	 */
	private Store store4;
	/**
	 * Store that corresponds to the last map
	 */
	private Store store5;
	
        
    /**
     * This method sets up the whole Seaty.
	 */ 
	public Seaty(){
		super("Seaty");

		map1 = new Locale("Lake of Rage", 0);
		map2 = new Locale("Union Cave", 1);
		map3 = new Locale("Route 119", 2);
		map4 = new Locale("Fiore's Sea", 3);
		map5 = new Locale("Marine Cave", 4);
		store1 = new Store(0);
		store2 = new Store(1);
		store3 = new Store(2);
		store4 = new Store(3);
		store5 = new Store(4);
                
                
		
		localeEntrances.add(entry1);
		localeEntrances.add(entry2);
		localeEntrances.add(entry3);
		localeEntrances.add(entry4);
		localeEntrances.add(entry5);
		
		setTerrain();
	}
	
	/**
	 * This method sets the terrain of the Seaty.
	 */
	public void setTerrain(){
		Tile [][] temp = {{impass, impass, impass, impass, impass, impass, impass, impass, impass, impass, impass},
				{impass, impass, impass, impass, impass, impass, impass, impass, impass, impass, impass},
				{impass, impass, impass, impass, impass, road, impass, impass, impass, impass, impass},
				{impass, sign, storeEntry1 = new Entrance("Store Entrance", store1), impass, impass, road, impass, impass, storeEntry2 = new Entrance("Store Entrance", store2), sign, impass},
				{entry1 = new Entrance("Locale Entrance", map1), road, road, road, road, road, road, road, road, road, entry2 = new Entrance("Locale Entrance", map2)},
				{impass, impass, impass, impass, impass, road, impass, impass, impass, impass, impass},
				{impass, sign, storeEntry3 = new Entrance("Store Entrance", store3), impass, impass, road, impass, impass, storeEntry4 = new Entrance("Store Entrance", store4), sign, impass},
				{entry3 = new Entrance("Locale Entrance", map3), road, road, road, road, road, road, road, road, road, entry4 = new Entrance("Locale Entrance", map4)},
				{impass, impass, impass, impass, impass, road, impass, impass, impass, impass, impass},
				{impass, impass, impass, impass, storeEntry5 = new Entrance("Store Entrance", store5), road, sign, impass, impass, impass, impass},
				{impass, impass, impass, impass, impass, entry5 = new Entrance("Locale Entrance", map5), impass, impass, impass, impass, impass}};
			this.terrain = temp;
	}
	
	/**
	 * This method returns the terrain held by the entrance tiles
	 * @param x x-coordinate of the tile
	 * @param y y-coordinate of the tile
	 * @return Terrain held by entrance tile
	 */
	public Terrain getEntranceLocale(int x, int y){
		return ((Entrance)terrain[x][y]).accessLocale();
	}
	
	/**
	 * This method updates a player can gain access on a given map.
	 * @param player Player that updates the ability to enter locales
	 */
	public void updateLocaleEntry(Player player){
		if(player.checkGyarados()){
			map3.changeAccessible(true);
			map5.changeAccessible(true);
		}
		
		if(player.checkLapras()){
			map4.changeAccessible(true);
		}
	}
    
	/**
	 * This method updates the acessiblity of a locale given conditions
	 */
	public void updateLocaleAccessible(){
		if(map1.caughtLegendary()){
			map3.changeAccessible(true);
			map5.changeAccessible(true);
		}
			
		if(map2.caughtLegendary())
			map4.changeAccessible(true);
	}
	
	/**
	 * This method updates the entrances of each locale.
	 */
	public void updateLocaleEntrances(){
		for(int i = 0; i < localeEntrances.size(); i++){
			if(localeEntrances.get(i).accessLocale().isAccessible())
				localeEntrances.get(i).changePassable(true);
		}
	}
}