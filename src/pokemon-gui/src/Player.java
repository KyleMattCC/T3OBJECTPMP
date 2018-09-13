import java.util.*;

/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the user's character in the fishing game.
 */
public class Player{
	/**
	 * The boolean that acts like a determiner whether the player can fish in a spot or not. Utility variable.
	 */
	private boolean fishable = true;
	/**
	 * The boolean that determines whether a player has successfully caught a pokemon.
	 */
    private boolean caught = false;
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
	private int posY;
	/** 
	 * The x coordinate plus facing direction where the player will fish.
	 */
	private int fishPosX = posX;
	/** 
	 * The y coordinate plus facing direction where the player will fish.
	 */
	private	int fishPosY = posY;
	/**
	 * Contains the data of the caught Pokemon.
	 */
	private Pokedex              pokeDex;

	/**
	 * Initializes the defaults of the Player.
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
        
	public void changeFishPos(String direction){
		fishPosX = posX;
		fishPosY = posY;
		
		switch(direction){
		case "up"		: fishPosY--;
						break;
		case "down"		: fishPosY++;
						break;
		case "left" 	: fishPosX--;
						break;
		case "right" 	: fishPosX++;
						break;
		}	
	}
	
    public boolean canFish(Locale map){
        if(fishPosX >= 0 && fishPosX < 11 & fishPosY >=0 && fishPosX < 11)
			return map.accessCoordinate(fishPosX, fishPosY).isFishable();
        return false;
    }
       
    public boolean isCaught(){
        return caught;
    }
       
    public int getFishPosX(){
        return fishPosX;
    }
       
    public int getFishPosY(){
        return fishPosY;
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
         * @return name of the String
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the gender of the user.
         * @return gender of character
	 */
	public char getGender(){
		return this.gender;
	}
	
	/**
	 * This method gets the X position of the player.
         * @return x-coordinate position of the player
	 */	
	public int getPosX(){
		return this.posX;
	}
	
	/**
	 * This method gets the Y position of the player.
         * @return the y-coordinate poistin of the player
	 */
	public int getPosY(){
		return this.posY;
	}

	/**
	 * This method increases the fame of the player in the current map given the map number and the pokemon's fame.
	 * @param map the map where the player is currently fishing.
	 * @param fame the value to be added to variable fame.
	 */
	public void increaseFame(Locale map, int fame){
		if(this.fame[map.getMapIndex()] + fame <= 100)
			this.fame[map.getMapIndex()] += fame;
		else
			this.fame[map.getMapIndex()] = 100;
	}
	
	/**
	 * This method gets the player's fame on a given map. 
	 * @param map the map where the player is currently fishing. 
         * @return fame inside the given map
	 */
	public int getFame(Locale map){
		return this.fame[map.getMapIndex()];
	}
	
	/**
	 * This method returns the player's equipment on a given map.
	 * @param map the map where the player is currently fishing.
         * @return equipment inside the given map
	 */
	public Equipment getEquipment(Locale map){
		return this.inventory.get(map.getMapIndex());
	}
	
    /**
     *
     * @param index index of the given map
     * @return equipment for the given "map" index
     */
    public Equipment getEquipment(int index){
		return this.inventory.get(index);
	}
	
	/**
	 * This method returns the player's cash at hand.
         * @return cash at hand of the player
	 */
	public long getCash(){
		return this.cash;
	}
	
	/**
	 * This method returns the Pokedex of the player that can be used for referencing captures, and other data.
	 * @return Pokedex of the Player
	 */
	public Pokedex getPokeDex(){
		return this.pokeDex;
	}
	
	/**
	 * This method adds cash to the player's money
         * @param cash added cash
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
	 * @param map the badge in the list of badges.
	 */
	public void updateBadge(Locale map){
		if(map.caughtLegendary())
			this.badges.get(map.getMapIndex()).setBadge(true);
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
	
	/*
	 * Moves the player by 1 unit depending on the direction
	 * @param direction tells what direction the player moved
	 * @param map Terrain where the player will move.
	 * @return true if movement is done, otherwise false
	 */
	public boolean move(String direction, Terrain map){
            if(direction.equals("up")){
		return moveUp(map);
            }
            else if(direction.equals("down")){
                return moveDown(map);
            }
            else if (direction.equals("right")){
                return moveRight(map);
            }
            else if (direction.equals("left")){
                return moveLeft(map);
            }
            else
                return false;
	}
	
	/*
	 * Moves the player up by 1 unit.
	 * @param map Terrain where the player will move.
	 * @return true if movement is done, otherwise false
	 */
    public boolean moveUp(Terrain map){
        if((this.getPosY() - 1 >= 0)){
            if(!(map.accessCoordinate(this.getPosY()-1, this.getPosX()).isPassable())){
                System.out.println((this.getPosY()) + " " + this.getPosX());
                return false;
            }
					
            else{
                this.setPosY(this.getPosY()-1);
                return true;
            }
        }
        return false;
    }
		
	/*
	 * Moves the player to down by 1 unit.
	 * @param map Terrain where the player will move.
	 * @return true if movement is done, otherwise false
	 */
	public boolean moveDown(Terrain map){
            if(this.getPosY() + 1 < 11){
		if(!(map.accessCoordinate(this.getPosY()+1, this.getPosX()).isPassable())){
                    System.out.println((this.getPosY()) + " " + this.getPosX());
                    return false;
                }
									
                else{
                    this.setPosY(this.getPosY()+1);
                    //System.out.println("truly");
                    return true;
                }
            }
            
                return false;
			
	}
	
	/*
	 * Moves the player to the left by 1 unit.
	 * @param map Terrain where the player will move.
	 * @return true if movement is done, otherwise false
	 */
	public boolean moveLeft(Terrain map){
            if(this.getPosX() - 1 >= 0){
		if(!(map.accessCoordinate(this.getPosY(), this.getPosX()-1).isPassable())){
                    System.out.println(this.getPosY() + " " + (this.getPosX()));
                    return false;
                }
									
                else{
                    this.setPosX(this.getPosX()-1);
                    return true;
                }	
            }
            return false;
			
	}
	
	/*
	 * Moves the player to the right by 1 unit.
	 * @param map Terrain where the player will move.
	 * @return true if movement is done, otherwise false
	 */
	public boolean moveRight(Terrain map){
            if(this.getPosX() + 1 < 11){
		if(!(map.accessCoordinate(this.getPosY(), this.getPosX()+1).isPassable())){
                    System.out.println(this.getPosY()+ " " + (this.getPosX()));
                    return false;
                }
									
                else{
                    this.setPosX(this.getPosX()+1);
                    return true;
                }		
            }
            return false;
			
	}
	
	/**
	 * Allows the player to fish for pokemon in the current locale.
	 * @param map the map which the player is currently fishing.
	 * @return TileObject in the map
	 */
	public TileObject fish(Locale map){
		Random rand = new Random();
              
                caught = false;
               
		if(!(map.accessCoordinate(fishPosY, fishPosX).getName().equals("treasure"))){
			try{
				for(int i = 0; i < 1; i++){
					System.out.println(".");
					Thread.sleep(1);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			};
	
			int encounterVal = (rand.nextInt(100) + 1);
											
			if(encounterVal <= map.accessCoordinate(fishPosY, fishPosX).getObject().getEncounterRate() + inventory.get(map.getMapIndex()).getEncounterUp()){
									
				System.out.println("A wild " + map.accessCoordinate(fishPosY, fishPosX).getObject().getName() + " appears to be on hook!");
											
					if(map.accessCoordinate(fishPosY, fishPosX).getName().equals("legendary"))
												
						map.updateLegendaryEncounterRate(0);
											
					try{
						System.out.print("Capturing...");
						Thread.sleep(1);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					};
				
					int captureVal = rand.nextInt(100) + 1;
										
					if(captureVal <= map.accessCoordinate(fishPosY, fishPosX).getObject().getCaptureRate() + inventory.get(map.getMapIndex()).getCaptureUp()){
						caught = true;					
						System.out.println("CONGRATULATIONS! YOU HAVE CAUGHT " + map.accessCoordinate(fishPosY, fishPosX).getObject().getName());
						increaseFame(map, getPokeDex().getReducedFame(map.accessCoordinate(fishPosY, fishPosX).getObject().getName())) ;
						getPokeDex().addCapture(map.accessCoordinate(fishPosY, fishPosX).getObject().getName());
						System.out.println("Your fame points in this map is now " + getFame(map) + " points!\n");
												
						if(map.accessCoordinate(fishPosY, fishPosX).getName().equals("legendary")){												
							map.updateCaughtLegendary();
							updateBadge(map);
							System.out.println("You have aqcuired " + badges.get(map.getMapIndex()).getName() + "!\n");
						}
						
						return map.accessCoordinate(fishPosY, fishPosX).getObject();
										
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
				
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			};
								
			if(rand.nextInt(100) + 1 <= getEquipment(map).getEncounterUp() + map.accessCoordinate(fishPosY, fishPosX).getObject().getEncounterRate()){
				caught = true;						
				System.out.print("REELING");
				try{
					System.out.print(".");
					Thread.sleep(500);
					
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				};
									
				System.out.println("CONGRATULATIONS! YOU JUST GOT A " + map.accessCoordinate(fishPosY, fishPosX).getObject().getName() + "!\n");
				addCash(((Treasure)map.accessCoordinate(fishPosY, fishPosX).getObject()).getPrice());					
				return map.accessCoordinate(fishPosY, fishPosX).getObject();
			
			}else{
									
				System.out.println("Not even a nibble...\n");	
			
				return null;
									
			}
		}
	}
	
	/**
	 * This method checks whether a player has a Red Gyarados or not.
	 * @return true if player has a Red Gyarados, otherwise false
	 */
	public boolean checkGyarados(){
		return redGyaradosChecker;
	}
	
	/**
	 * This method checks whether a player has a Lapras or not.
	 * @return true if player has a lapras, otherwise false
	 */
	public boolean checkLapras(){
		return laprasChecker;
	}
	
	/**
	 * This method returns the total number of pokemon caught.
	 * @return total number of pokemon caught
	 */
	public int getPokemonNum(){
        return pokeDex.getPokemonNum();
    }
}