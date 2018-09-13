import java.util.*;

/**
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the user's character in the fishing game.
 */
public class Player{
	
	/**
	 * The name of the player.
	 */
	private String               name;
	/**
	 * The gender of the player. Either 'M' or 'F'.
	 */
	private char                 gender;
	/**
	 * The array of fame in every locale in the game.
	 */
	private int[]                fame;
	/**
	 * Cash of the player.
	 */
	private long	             cash = 0;	
	
	/**
	 * The array of badges of the player
	 */
	private ArrayList <Badge>    badges;
	/**
	 * Checks if the player has caught a Lapras.
	 */
	private boolean              laprasChecker;
	/**
	 * Check if the player has caught a Red Gyarados.
	 */
	private boolean              redGyaradosChecker;
	
	/**
	 * The items of the player
	 */
	private ArrayList <Equipment> 	 inventory;
	
	/**
	 * The position of the player in the X-axis.
	 */
	private int                  posX;
	/**
	 * The position of the player in the Y-axis.
	 */
	private int                  posY;
	/**
	 * Contains the data of the caught Pokemon.
	 */
	private Pokedex              pokeDex;

	/**
	 * Initializes the defaults of the Player.
	 *
	 * @param name name of the player that will be assigned to name.
	 * @param gender the gender of the player that will e assigned to gender.
	 */
	public Player(String name, String gender){
	
		setName(name);
		setGender(gender);
		
		inventory = new ArrayList <Equipment> ();
		Equipment inventory1 = new Equipment();
		Equipment inventory2 = new Equipment();
		Equipment inventory3 = new Equipment();
		Equipment inventory4 = new Equipment();
		Equipment inventory5 = new Equipment();
		
		inventory.add(inventory1);
		inventory.add(inventory2);
		inventory.add(inventory3);
		inventory.add(inventory4);
		inventory.add(inventory5);
		
		badges             = new ArrayList <Badge> ();
		Badge badge1 	   = new Badge("Scale Badge");
		Badge badge2       = new Badge("Shell Badge");
		Badge badge3	   = new Badge("Coral Badge");
		Badge badge4	   = new Badge("Droplet Badge");
		Badge badge5	   = new Badge("Legend Badge");

		badges.add(badge1);
		badges.add(badge2);
		badges.add(badge3);
		badges.add(badge4);
		badges.add(badge5);
		
		laprasChecker      = false;
		redGyaradosChecker = false;
		fame               = new int[5];
		pokeDex            = new Pokedex();
		
		for(int i = 0; i < 5; i++)
			fame[i]        = 0;
	}
	
	/**
	 * This method sets the name of the player
	 * @param name the name to be assigned to variable name.
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * This method sets the gender of the user.
	 * @param gender the gender of the player.
	 */
	public void setGender(String gender){
		this.gender = (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Boy")) ? 'M' : 'F';
	}
	
	/**
	 * This method sets the X position of the player.
	 * @param x the position of the player in the x-axis.
	 */
	public void setPosX(int x){
		this.posX = x;
	}
	
	/**
	 * This method sets the Y position of the player.
	 * @param y the position of the player in the y-axis.
	 */
	public void setPosY(int y){
		this.posY = y;
	}
	
	/**
	 * This method gets the name of the player.
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the gender of the user.
	 */
	public char getGender(){
		return this.gender;
	}
	
	/**
	 * This method gets the X position of the player.
	 */	
	public int getPosX(){
		return this.posX;
	}
	
	/**
	 * This method gets the Y position of the player.
	 */
	public int getPosY(){
		return this.posY;
	}

	/**
	 * This method increases the fame of the player in the current map given the map number and the pokemon's fame.
	 * @param map the map where the player is currently fishing.
	 * @param fame the value to be added to variable fame.
	 */
	public void increaseFame(int map, int fame){
		if(this.fame[map] + fame <= 100)
			this.fame[map] += fame;
		else
			this.fame[map] = 100;
	}
	
	/**
	 * This method gets the player's fame on a given map. 
	 * @param map the map where the player is currently fishing. 
	 */
	public int getFame(int map){
		return this.fame[map];
	}
	
	/**
	 * This method returns the player's equipment on a given map.
	 * @param map the map where the player is currently fishing.
	 */
	public Equipment getEquipment(int map){
		return this.inventory.get(map);
	}
	
	/**
	 * This method returns the player's cash at hand.
	 */
	public long getCash(){
		return this.cash;
	}
	
	/**
	 * This method returns the Pokedex of the player that can be used for referencing captures, and other data.
	 */
	public Pokedex getPokeDex(){
		return this.pokeDex;
	}
	
	/**
	 * This method adds cash to the player's money
	 */
	public void addCash(long cash){
		this.cash += cash;
	}
	
	/**
	 * This method reduces the player's cash at hand
	 *@param cash the amount to be reduced to the player's cash.
	 */
	public void reduceCash(long cash){
		this.cash -= cash;
	}
	
	/**
	 * Updates the badge whether the player has obtained the badge or not for the current map.
	 * @param mapIndex the index of the badge in the list of badges.
	 */
	public void updateBadge(int mapIndex){
		this.badges.get(mapIndex).setBadge(true);
	}
	
	/**
	 * This method displays the badges that the player has earned.
	 */
	public void displayBadges(){
		System.out.println("\nBadges:");
		for(int i = 0; i < this.badges.size(); i++){
			if(this.badges.get(i).hasBadge())
				System.out.println("-" + this.badges.get(i).getName());
		}
	}
	
	public void moveUp(Locale map){
		if(!(map.accessCoordinate(this.getPosY()-1, this.getPosX()).isPassable())){
                    System.out.println("UPP");
                }
									
                else{
                    this.setPosY(this.getPosY()-1);
                    
                }
			
	}
	
	public void moveDown(Locale map){
		if(!(map.accessCoordinate(this.getPosY()+1, this.getPosX()).isPassable())){
                    System.out.println("UPP");
                }
									
                else{
                    this.setPosY(this.getPosY()+1);
                    
                }	
			
	}
	
	public void moveLeft(Locale map){
		if(!(map.accessCoordinate(this.getPosY(), this.getPosX()-1).isPassable())){
                    System.out.println("UPP");
                }
									
                else{
                    this.setPosX(this.getPosX()-1);
                   
                }	
			
	}
	
	public void moveRight(Locale map){
		if(!(map.accessCoordinate(this.getPosY(), this.getPosX()+1).isPassable())){
                    System.out.println("UPP");
                }
									
                else{
                    this.setPosX(this.getPosX()+1);
                    
                }		
			
	}
	
	/**
	 * allows the player to fish for pokemon in the current locale.
	 * @param map the map which the player is currently fishing.
	 * @param index the index of the map to access certain things in the different lists of the player.
	 */
	public TileObject fish(Locale map, int index){
		Random rand = new Random();
	
		if(!(map.accessCoordinate(posY, posX).getName().equals("Treasure Tile"))){
			try{
				for(int i = 0; i < 3; i++){
					System.out.println(".");
					Thread.sleep(500);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			};
	
			int encounterVal = (rand.nextInt(100) + 1);
											
			if(encounterVal <= map.accessCoordinate(posY, posX).getObject().getEncounterRate() + inventory.get(index).getEncounterUp()){
									
				System.out.println("A wild " + map.accessCoordinate(posY, posX).getObject().getName() + " appears to be on hook!");
											
					if(map.accessCoordinate(posY, posX).getName().equals("Legendary Tile"))
												
						map.updateLegendaryEncounterRate(0);
											
					try{
						System.out.print("Capturing...");
						Thread.sleep(2000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					};
				
					int captureVal = rand.nextInt(100) + 1;
										
					if(captureVal <= map.accessCoordinate(posY, posX).getObject().getCaptureRate() + inventory.get(index).getCaptureUp()){
											
						System.out.println("CONGRATULATIONS! YOU HAVE CAUGHT " + map.accessCoordinate(posY, posX).getObject().getName());
						increaseFame(index, getPokeDex().getReducedFame(map.accessCoordinate(posY, posX).getObject().getName())) ;
						getPokeDex().addCapture(map.accessCoordinate(posY, posX).getObject().getName());
						System.out.println("Your fame points in this map is now " + getFame(index) + " points!\n");
												
						if(map.accessCoordinate(posY, posX).getName().equals("Legendary Tile")){												
							map.updateCaughtLegendary();
							updateBadge(index);
							System.out.println("You have aqcuired " + badges.get(index).getName() + "!\n");
						}
										
					}else{
												
						System.out.println("AWW SHOOT! IT GOT AWAY!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						};
												
					}
										
			}else{
										
				System.out.println("Not even a nibble...\n");
										
			}
		
			return null;
		}
	
		else{
			try{
				System.out.println(".");
				Thread.sleep(500);
				System.out.println(".");
				Thread.sleep(500);
				System.out.println(".");
				Thread.sleep(500);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			};
								
			if(rand.nextInt(100) + 1 <= getEquipment(index).getEncounterUp() + map.accessCoordinate(posY, posX).getObject().getEncounterRate()){
										
				System.out.print("REELING");
				try{
					System.out.print(".");
					Thread.sleep(500);
					System.out.print(".");
					Thread.sleep(500);
					System.out.print(".");
					Thread.sleep(500);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				};
									
				System.out.println("CONGRATULATIONS! YOU JUST GOT A " + map.accessCoordinate(posY, posX).getObject().getName() + "!\n");
									
				return map.accessCoordinate(posY, posX).getObject();
			
			}else{
									
				System.out.println("Not even a nibble...\n");	
			
				return null;
									
			}
		}	
	}
}