import java.util.*;

/** 
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the locale where the player can fish.
 */
public class Locale{
	
	/**
	 * The name of the locale.
	 */
	private String              mapName;
	/**
	 * The boolean showing whether map is accessible or not.
	 */
	private boolean             allowedAccess; 
	private Tile 				port = new Tile ("Port");
	private	Tile 				shallow = new Tile ("Shallow Water");
	private	Tile 				deep = new Tile ("Deep Water");
	private	Tile 				vDeep = new Tile ("Very Deep Water");
	private	Tile 				legendary = new Tile ("Legendary Tile");
	private	Tile 				treasure = new Tile ("Treasure Tile");
	private	Tile 				land = new Tile ("Land");
	/**
	 * The two-dimensional array showing the terrain type of each tile.
	 */
	private Tile[][]            terrain;
	/**
	 * The boolean telling whether the legendary pokemon in the map has been caught or not.
	 */
	private boolean 			caughtLegendary;
	
	/** 
	 * Initializes the map coordinates with its terrain, pokemon and treasures.
	 *
	 * @param mapName name of the locale.
	 */
	public Locale(String mapName){
		setMapName(mapName);
		setTerrain(mapName);
		setObjects(mapName);
		caughtLegendary = false;
	}
	
	/** 
	 * This method sets the type of each tile in the terrain.
	 *
	 * @param mapName name that will be assigned to the name of the locale.
	 */
	public void setMapName(String mapName){
		this.mapName = mapName;
	}
	
	public void setObjects(String mapName){		
		if(mapName.equals("Lake of Rage")){
			
			Pokemon magikarp    = new Pokemon ("Magikarp");
			Pokemon tentacool   = new Pokemon ("Tentacool");
			Pokemon staryu      = new Pokemon ("Staryu");
			Pokemon redGyarados = new Pokemon ("Red Gyarados");
			Treasure pearl  = new Treasure("Pearl");
			
			shallow.setObject(magikarp);
			deep.setObject(tentacool);
			vDeep.setObject(staryu);
			legendary.setObject(redGyarados);
			treasure.setObject(pearl);
			
		}else if(mapName.equals("Union Cave")){
			Pokemon tentacool = new Pokemon("Tentacool");
			Pokemon horsea    = new Pokemon("Horsea");
			Pokemon shelder   = new Pokemon("Shelder");
			Pokemon lapras    = new Pokemon("Lapras");
			Treasure stardust = new Treasure("Stardust");
			
			shallow.setObject(tentacool);
			deep.setObject(horsea);
			vDeep.setObject(shelder);
			legendary.setObject(lapras);
			treasure.setObject(stardust);
			
		}else if(mapName.equals("Route 119")){
			Pokemon remoraid = new Pokemon("Remoraid");
			Pokemon quilfish = new Pokemon("Quilfish");
			Pokemon carvanha = new Pokemon("Carvanha");
			Pokemon feebas   = new Pokemon("Feebas");
			Treasure bigPearl = new Treasure("Big Pearl");
			
			shallow.setObject(remoraid);
			deep.setObject(quilfish);
			vDeep.setObject(carvanha);
			legendary.setObject(feebas);
			treasure.setObject(bigPearl);
			
		}else if(mapName.equals("Fiore's Sea")){
			Pokemon frillish  = new Pokemon("Frillish");
			Pokemon finneon   = new Pokemon("Finneon");
			Pokemon alomomora = new Pokemon("Alomomora");
			Pokemon manaphy   = new Pokemon("Manaphy");
			Treasure nugget = new Treasure("Nugget");
			
			shallow.setObject(frillish);
			deep.setObject(finneon);
			vDeep.setObject(alomomora);
			legendary.setObject(manaphy);
			treasure.setObject(nugget);
			
		}else if(mapName.equals("Marine Cave")){
			Pokemon chinchou  = new Pokemon("Chinchou");
			Pokemon wailmer   = new Pokemon("Wailmer");
			Pokemon relicanth = new Pokemon("Relicanth");
			Pokemon kyogre    = new Pokemon("Kyogre");
			Treasure bigNugget = new Treasure("Big Nugget");
			
			shallow.setObject(chinchou);
			deep.setObject(wailmer);
			vDeep.setObject(relicanth);
			legendary.setObject(kyogre);
			treasure.setObject(bigNugget);
		
		}
	}
	
	/** 
	 * This method sets the type of each tile in the terrain.
	 *
	 * @param mapName name of the locale.
	 */
	public void setTerrain(String mapName){	
		if(mapName.equals("Lake of Rage")){
			Tile[][] temp = { {land,land,land,land,land,land,land,land,land,land,land},
						      {land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land,land},
						      {land,land,vDeep,vDeep,deep,deep,deep,deep,deep,land,land},
						      {land,land,vDeep,deep,shallow,shallow,treasure,shallow,deep,vDeep,land},
						      {land,vDeep,deep,deep,shallow,shallow,shallow,shallow,deep,vDeep,land},
						      {land,vDeep,shallow,shallow,shallow,port,shallow,deep,deep,vDeep,land},
      						  {land,vDeep,deep,deep,shallow,shallow,shallow,deep,deep,vDeep,land},
						      {land,vDeep,deep,deep,deep,shallow,deep,deep,deep,vDeep,land},
      						  {land,vDeep,vDeep,deep,deep,deep,deep,deep,vDeep,vDeep,land},
						      {land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,legendary,land,land},
						      {land,land,land,land,land,land,land,land,land,land,land} };
			this.terrain = temp;
		}else if(mapName.equals("Union Cave")){
			Tile[][] temp = { {land,land,land,land,land,legendary,land,land,land,land,land},
						      {land,land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land,land},
						      {land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land},
						      {land,vDeep,deep,deep,deep,deep,deep,deep,deep,vDeep,land},
						      {land,deep,deep,deep,deep,deep,deep,treasure,deep,deep,land},
						      {land,deep,deep,deep,deep,deep,deep,deep,deep,deep,land},
						      {land,deep,shallow,shallow,shallow,shallow,shallow,shallow,shallow,deep,land},
						      {land,deep,shallow,treasure,shallow,shallow,shallow,shallow,shallow,deep,land},
						      {land,shallow,shallow,shallow,shallow,shallow,shallow,shallow,shallow,shallow,shallow},
						      {land,land,shallow,shallow,shallow,shallow,shallow,shallow,shallow,land,land},
						      {land,land,land,land,land,port,land,land,land,land,land} };
			this.terrain = temp;
		}else if(mapName.equals("Route 119")){
			Tile[][] temp = { {port,shallow,shallow,shallow,shallow,deep,deep,land,land,land,land},
						      {land,shallow,shallow,shallow,shallow,deep,treasure,land,land,land,land},
						      {land,shallow,shallow,shallow,shallow,deep,deep,land,land,land,land},
						      {land,shallow,shallow,shallow,legendary,deep,deep,land,land,land,land},
						      {land,shallow,deep,deep,deep,deep,deep,land,land,land,land},
						      {land,deep,deep,deep,deep,deep,deep,land,land,land,land},
						      {land,deep,vDeep,treasure,vDeep,vDeep,vDeep,land,land,land,land},
						      {land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land,land},
						      {land,land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,land,land},
						      {land,land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land},
						      {land,land,land,land,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,land} };
			this.terrain = temp;
		}else if(mapName.equals("Fiore's Sea")){
			Tile[][] temp = { {vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,legendary},
      						{vDeep,vDeep,vDeep,vDeep,vDeep,vDeep,shallow,land,shallow,vDeep,vDeep},
						      {deep,deep,deep,deep,deep,shallow,land,land,land,shallow,vDeep},
						      {shallow,shallow,land,shallow,shallow,deep,shallow,land,shallow,deep,vDeep},
						      {shallow,land,land,land,shallow,deep,deep,deep,deep,deep,vDeep},
						      {deep,deep,land,deep,deep,deep,treasure,deep,deep,deep,vDeep},
						      {treasure,deep,deep,deep,deep,deep,deep,deep,deep,deep,vDeep},
						      {shallow,shallow,shallow,shallow,shallow,deep,deep,deep,deep,deep,vDeep},
						      {shallow,shallow,shallow,shallow,shallow,deep,deep,deep,deep,deep,vDeep},
						      {shallow,shallow,shallow,shallow,shallow,deep,deep,deep,deep,deep,vDeep},
						      {port,shallow,shallow,shallow,shallow,deep,deep,deep,deep,deep,vDeep} };
			this.terrain = temp;
		}else if(mapName.equals("Marine Cave")){
			Tile[][] temp = { {land,vDeep,vDeep,deep,vDeep,legendary,vDeep,vDeep,vDeep,vDeep,land},
						      {land,vDeep,deep,shallow,deep,vDeep,vDeep,vDeep,vDeep,vDeep,land},
						      {land,deep,shallow,land,shallow,deep,deep,deep,deep,deep,land},
						      {land,shallow,land,land,land,shallow,deep,deep,deep,deep,land},
						      {land,deep,shallow,land,shallow,deep,deep,shallow,deep,deep,land},
						      {land,deep,deep,shallow,deep,deep,shallow,land,treasure,deep,land},
						      {land,deep,deep,deep,deep,shallow,land,land,land,shallow,land},
						      {land,deep,deep,treasure,shallow,shallow,shallow,land,shallow,deep,land},
						      {land,deep,deep,shallow,shallow,shallow,shallow,shallow,deep,deep,land},
						      {land,deep,deep,shallow,shallow,shallow,shallow,shallow,deep,deep,land},
						      {land,deep,deep,shallow,shallow,port,shallow,shallow,deep,deep,land} }; 
			this.terrain = temp;
		}
	}
	
	/**
	 * This method gets the map name 
	 */
	public String getMapName(){
		return this.mapName;
	}
	
	/**
	 * This method accesses the terrain type in the given x and y coordinate 
	 */
	public Tile accessCoordinate(int x, int y){
		return this.terrain[x][y];
	}
	
	/**
	 * This method accesses the pokemon in the given x and y coordinate 
	 */
	/*public Pokemon accessPokemon(int x, int y){
		return this.pokeMap[x][y];
	}*/
	
	/**
	 * This method accesses the treasure in the given x and y coordinate 
	 */
	/*public Treasure accessTreasure(int x, int y){
		return this.treasureMap[x][y];
	}*/
	
	/**
	 * This method returns the x coordinate of the port in a given map 
	 */
	public int accessPortX(){
		int hold = 0;
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < 11; j++)
				if(this.accessCoordinate(i,j).getName().equals("Port"))
					hold = j;
		}
		return hold;
	}
	
	/**
	 * This method returns the y coordinate of the port in a given map 
	 */
	public int accessPortY(){
		int hold = 0;
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < 11; j++)
				if(this.accessCoordinate(i,j).getName().equals("Port"))
					hold = i;
		}		
		return hold;
	}
		
	/**
	 * This method displays the locale in a table like format 
	 */
	public void displayLocale(){
		
		for(int i = 0; i < 11*4+1; i++){
			if(i == 0){
				System.out.print("\u2554");
			}else if(i == 11*4){
				System.out.print("\u2557\n");
			}else if(i%4 == 0){
				System.out.print("\u2566");
			}else
				System.out.print("\u2550");
		}
			
		for(int i = 0; i < 11; i++){
			/* BETWEENS */
			for(int j = 0; j < 11*4+1; j++){
				if(j % 4 == 0){
					System.out.print("\u2551");
					if(j == 11*4)
						System.out.print("\n");
				}else if(j % 4 == 2){
					System.out.print(accessCoordinate(i, j/4).getName().charAt(0));
				}else
					System.out.print(" ");
			}
			/* SEPARATORS */
			for(int j = 0; j < 11*4+1; j++){
				if(i == 10){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 11*4){
						System.out.print("\u255D\n");
					}else if(j%4 == 0){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
					
				}else
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 11*4){
						System.out.print("\u2563\n");
					}else if(j%4 == 0){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
			}
		}

	}
	
	/** 
	 * This method, being an overload of the other, displays the locale in the same manner, but allows the user's cursor to be displayed as well 
	 */
	public void displayLocale(int x, int y, char Player){	
		for(int i = 0; i < 11*4+1; i++){
			if(i == 0){
				System.out.print("\u2554");
			}else if(i == 11*4){
				System.out.print("\u2557\n");
			}else if(i%4 == 0){
				System.out.print("\u2566");
			}else
				System.out.print("\u2550");
		}
			
		for(int i = 0; i < 11; i++){
			/* BETWEENS */
			for(int j = 0; j < 11*4+1; j++){
				if(j % 4 == 0){
					System.out.print("\u2551");
					if(j == 11*4)
						System.out.print("\n");
				}else if(j % 4 == 2){
					if(i == y && j/4 == x)
						System.out.print(Player);
					else
						System.out.print(accessCoordinate(i, j/4).getName().charAt(0));
				}else
					System.out.print(" ");
			}
			/* SEPARATORS */
			for(int j = 0; j < 11*4+1; j++){
				if(i == 10){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 11*4){
						System.out.print("\u255D\n");
					}else if(j%4 == 0){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
					
				}else
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 11*4){
						System.out.print("\u2563\n");
					}else if(j%4 == 0){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
			}
		}
	} 

	/**
	 * This method updates the encounter rate of the legendary pokemon in the given locale 
	 */
	public void updateLegendaryEncounterRate(int rate){
		legendary.getObject().updateEncounterRate(rate);
	}
	
	/*  
	 * This method tells whether the legendary pokemon in the locale has been caught 
	 */
	public boolean caughtLegendary(){
		return this.caughtLegendary;
	}
	
	/**
     * This method updates the value of the capture of the legendary pokemon to true 
	 */
	public void updateCaughtLegendary(){
		this.caughtLegendary = true;
	}
}