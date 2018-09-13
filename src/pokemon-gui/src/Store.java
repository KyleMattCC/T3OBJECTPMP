
import java.util.ArrayList;
import java.util.Scanner;

public class Store extends Terrain{
	
	/**
     * contains the list of rods for sale 
	 */
	private ArrayList <Rod>  rods;
	/**
     * contains the list of lures for sale 
	 */
	private ArrayList <Lure> lures;
	/**
     * contains the list of lines for sale 
	 */
	private ArrayList <Line> lines;
	/**
     * contains the list of reels for sale 
	 */
	private ArrayList <Reel> reels;
	/**
     * contains the list of tackle box for sale 
	 */
	private ArrayList <TackleBox> boxes;
	/**
     * contains the list of boats for sale 
	 */
	private ArrayList <Boat> boats;
	/**
	 * Scanner object used by the shop
	 */
	private Scanner scan = new Scanner (System.in);
	/**
	 * String query that displays when asking the player what to purchase
	 */
	private String ask       = "What would you like to purchase? ";
	/**
	 * String query for confirmation
	 */
	private String query     = "Are you sure you want to purchase ";	
	/**
	 * String query showing the purchase as a success.
	 */
	private String success   = "Item has been equipped in player's equipment.";
	/**
	 * String query that displays hen the player wants to exit shopping.
	 */
	private String exitMes   = "Are you sure there is nothing else [Y/N]? ";
	/**
	 * Contains the value holding the store's number on the list.
	 */
	private int storeIndex;
	
	/**
	 * This method fixes the store's items.
	 * @param index holding the number of the Store in the list of stores.
	 */
	public Store(int index){
		super("Store");
		this.storeIndex = index;
		setTerrain();
		
		rods = new ArrayList <Rod> ();
		Rod goodRod = new Rod ("Good Rod");
		Rod superRod = new Rod ("Super Rod");
		Rod masterRod = new Rod ("Master Rod");
		rods.add(goodRod);
		rods.add(superRod);
		rods.add(masterRod);
		
		lures = new ArrayList <Lure> ();
		Lure greatLure = new Lure ("Great Lure");
		Lure ultraLure = new Lure ("Ultra Lure");
		Lure masterLure = new Lure ("Master Lure");
		lures.add(greatLure);
		lures.add(ultraLure);
		lures.add(masterLure);
		
		lines = new ArrayList <Line> ();
		Line greatLine = new Line ("Great Line");
		Line ultraLine = new Line ("Ultra Line");
		Line masterLine = new Line ("Master Line");
		lines.add(greatLine);
		lines.add(ultraLine);
		lines.add(masterLine);
		
		reels = new ArrayList <Reel> ();
		Reel greatReel = new Reel ("Great Reel");
		Reel ultraReel = new Reel ("Ultra Reel");
		Reel masterReel = new Reel ("Master Reel");
		reels.add(greatReel);
		reels.add(ultraReel);
		reels.add(masterReel);
		
		boxes = new ArrayList <TackleBox> ();
		TackleBox goodTackleBox = new TackleBox ("Good Tackle Box");
		TackleBox superTackleBox = new TackleBox ("Super Tackle Box");
		TackleBox masterTackleBox = new TackleBox ("Master Tackle Box");
		boxes.add(goodTackleBox);
		boxes.add(superTackleBox);
		boxes.add(masterTackleBox);
		
		boats = new ArrayList <Boat> ();
		Boat speedBoat = new Boat ("Speed Boat");
		Boat sharpedo = new Boat ("Sharpedo Boat");
		boats.add(speedBoat);
		boats.add(sharpedo);
                
	}
	
	/**
	 * This method sets the terrain of the shop
	 */
	public void setTerrain(){
		Tile [][] temp ={{impass, impass, impass, impass, impass, impass, impass, impass, impass, impass, impass},
				{impass, impass, impass, impass, impass, impass, impass, impass, impass, impass, impass},
				{impass, impass, impass, road, road, road, road, road, road, road, road},
				{impass, impass, impass, shop, road, impass, impass, road, impass, impass, road},
				{impass, impass, impass, road, road, impass, impass, road, impass, impass, road},
				{road, road, road, road, road, road, road, road, impass, impass, road},
				{impass, impass, impass, road, road, road, road, road, impass, impass, road},
				{impass, impass, impass, road, road, road, road, road, road, road, road},
				{impass, impass, impass, road, road, road, road, road, impass, impass, road},
				{impass, impass, impass, road, road, road, road, road, impass, impass, road},
				{road, road, road, road, road, exit, exit, road, road, road, road}};
		this.terrain = temp;
	}
	
	/**
	 * This method sets the terrain of the index of the store
	 */
	public int getStoreIndex(){
		return this.storeIndex;
	}
    
	/**
	 * This method sets the index of the store
	 * @param index integer value holding the number to be assigned to the store
	 */
    public void setStoreIndex(int index){
        this.storeIndex = index;
    }
	
	/**
	 * This method allows the player to shop for rods
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 
	public boolean shopRod(int choice, Player player){
		Rod rod;
		
		if(player.getCash() >= rods.get(choice).getCost()){
			rod = new Rod(rods.get(choice).getName());
			player.getEquipment(storeIndex).equipRod(rod);
			player.reduceCash(rod.getCost());
			
			return true;
		}
		
		else return false;
	}
	
	/**
	 * This method allows the player to shop for lures
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 	
	public boolean shopLure(int choice, Player player){
		Lure lure;
		
		if(player.getCash() >= lures.get(choice).getCost()){
			lure = new Lure(lures.get(choice).getName());
			player.getEquipment(storeIndex).getRod().equipLure(lure);
			player.reduceCash(lure.getCost());
			
			return true;
		}
		
		else return false;
	}

	/**
	 * This method allows the player to shop for lines
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 	
	public boolean shopLine(int choice, Player player){
		Line line;
		
		if(player.getCash() >= lines.get(choice).getCost()){
			line = new Line(lines.get(choice).getName());
			player.getEquipment(storeIndex).getRod().equipLine(line);
			player.reduceCash(line.getCost());
			
			return true;
		}
		
		else return false;
	}

	/**
	 * This method allows the player to shop for reels
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 
	public boolean shopReel(int choice, Player player){
		Reel reel;
		
		if(player.getCash() >= reels.get(choice).getCost()){
			reel = new Reel(reels.get(choice).getName());
			player.getEquipment(storeIndex).getRod().equipReel(reel);
			player.reduceCash(reel.getCost());
			
			return true;
		}
		
		else return false;
	}
	
	/**
	 * This method allows the player to shop for tackle boxes
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 
	public boolean shopTackleBox(int choice, Player player){
		if(player.getCash() >= boxes.get(choice).getCost()){
			player.getEquipment(storeIndex).equipTackleBox(boxes.get(choice));
			player.reduceCash(boxes.get(choice).getCost());
			
			return true;
		}
		
		else return false;
	}
	
	/**
	 * This method allows the player to shop for boats
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 
	public boolean shopBoat(int choice, Player player){
		Boat boat;
		
		if(player.getCash() >= boats.get(choice).getCost()){
			boat = new Boat(boats.get(choice).getName());
			player.getEquipment(storeIndex).equipBoat(boat);
			player.reduceCash(boat.getCost());
			
			return true;
		}
		
		else return false;
	}
	
	/**
	 * This method allows the player to shop for engines
	 * @param choice integer holding the index of the item to be bought
	 * @param player the player who will buy the item
	 * @return true if item was successfully bought, otherwise false
	 */ 
	public boolean shopEngine(int choice, Player player){
		if(player.getCash() >= 1000){
			if(player.getEquipment(storeIndex).getBoat().upgradeEngine()){
				player.reduceCash(1000);
				return true;
			}
			else return false;
		}
		
		else return false;
	}
	
	/**
	 * This method gets the number of rods for sale.
	 * @return number of rods for sale
	 */
	public int getRodNum(){
		return rods.size();
	}

	/**
	 * This method gets the number of lines for sale.
	 * @return number of lines for sale
	 */	
	public int getLineNum(){
		return lines.size();
	}

	/**
	 * This method gets the number of lures for sale.
	 * @return number of lures for sale
	 */	
	public int getLureNum(){
		return lures.size();
	}
	
	/**
	 * This method gets the number of reels for sale.
	 * @return number of reels for sale
	 */	
	public int getReelNum(){
		return reels.size();
	}
	
	/**
	 * This method gets the number of tackle boxes for sale.
	 * @return number of tackle boxes for sale
	 */	
	public int getTackleBoxNum(){
		return boxes.size();
	}
	
	/**
	 * This method gets the number of boats for sale.
	 * @return number of boats for sale
	 */	
	public int getBoatNum(){
		return boats.size();
	}
	
	/**
	 * This method gets the number of engines for sale.
	 * @return number of engines for sale
	 */	
	public int getEngineNum(){
		return 1;
	}
}