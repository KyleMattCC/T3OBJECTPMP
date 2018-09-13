import java.util.*;

/** 
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the shop that can be accessed in all locales
 */
public class Shop{
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

	private Scanner scan = new Scanner (System.in);
	private String ask       = "What would you like to purchase? ";
	private String query     = "Are you sure you want to purchase ";	
	private String success   = "Item has been equipped in player's equipment.";
	private String exitMes   = "Are you sure there is nothing else [Y/N]? ";
	
	/**
	 * Sets up the shop.
	 */
	public Shop(){
		
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
     * This method allows the user to go to the same shop, no matter what map the user is.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void goShop(Equipment playerItems, Player player){
		int choice;
		do{
			System.out.println();
			try{
				String intro   = "Hello! How may I help you?";
				for(int i = 0; i < intro.length() ; i++){
					System.out.print(intro.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			displayCategories();
			System.out.print("\nInput Choice: ");
			choice = scan.nextInt();
	
			switch(choice){
				case 1: shopRods(playerItems, player);
						break;
						
				case 2: shopLures(playerItems, player);
						break;
						
				case 3: shopLines(playerItems, player);
						break;
						
				case 4: shopReels(playerItems, player);
						break;
						
				case 5: shopTackleBoxes(playerItems, player);
						break;
						
				case 6: shopBoats(playerItems, player);
						break;
						
				case 7: shopEngine(playerItems, player);
						break;
						
				case 0: System.out.println();
						try{
							for(int i = 0; i < exitMes.length() ; i++){
								System.out.print(exitMes.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						
						char exitChoice = scan.next().charAt(0);
						if(exitChoice == 'Y' || exitChoice == 'y'){	
							try{
								String thank   = "Thank you for shopping! ";
								for(int i = 0; i < thank.length() ; i++){
									System.out.print(thank.charAt(i));
									Thread.sleep(100);
								}
							}catch(InterruptedException ex){
								Thread.currentThread().interrupt();
							}
							System.out.println();
						}
						
						else
							choice = -1;
						
						break;
						
				default : System.out.println("Choice is out of bound");							
			}
		}while(choice != 0);
	}
	
	/**
	 * This method allows the system to display the categories for the user to choose from.
	 */
	public void displayCategories(){
		System.out.println("\n\nChoose a category:");
		System.out.println("[1] Rod");
		System.out.println("[2] Lure");
		System.out.println("[3] Line");
		System.out.println("[4] Reel");
		System.out.println("[5] Tackle Box");
		System.out.println("[6] Boat");
		System.out.println("[7] Engine");
		System.out.println("[0] Exit");
	}
	
	/**
	 * This method allows the user to shop for Fishing Rods.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopRods(Equipment playerItems, Player player){		
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayRods();
			
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= rods.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				
				System.out.print(rods.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= rods.get(choice-1).getCost()){
						playerItems.equipRod(rods.get(choice-1));
						player.reduceCash(rods.get(choice-1).getCost());
						System.out.println("You have bought " + rods.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");	
			
		}while(choice != 0);
	}
		
	/**
	 * This method allows the user to shop for Fishing Lures.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopLures(Equipment playerItems, Player player){	
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayLures();
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= lures.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print(lures.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= lures.get(choice-1).getCost()){
						playerItems.getRod().equipLure(lures.get(choice-1));
						player.reduceCash(lures.get(choice-1).getCost());
						System.out.println("You have bought " + lures.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");			
			
		}while(choice != 0);
	}
	
	/**
	 * This method allows the user to shop for Fishing Lines.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopLines(Equipment playerItems, Player player){	
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayLines();
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= lines.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print(lines.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= lines.get(choice-1).getCost()){
						playerItems.getRod().equipLine(lines.get(choice-1));
						player.reduceCash(lines.get(choice-1).getCost());
						System.out.println("You have bought " + lines.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");
			
		}while(choice != 0);
	}
	
	/**
	 * This method allows the user to shop for Fishing Reels.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopReels(Equipment playerItems, Player player){
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayReels();
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= reels.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print(reels.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= reels.get(choice-1).getCost()){
						playerItems.getRod().equipReel(reels.get(choice-1));
						player.reduceCash(reels.get(choice-1).getCost());
						System.out.println("You have bought " + reels.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");
			
		}while(choice != 0);
	}
	
	/**
	 * This method allows the user to shop for Tackle Boxes.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopTackleBoxes(Equipment playerItems, Player player){
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayTackleBoxes();
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= boxes.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print(boxes.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= boxes.get(choice-1).getCost()){
						playerItems.equipTackleBox(boxes.get(choice-1));
						player.reduceCash(boxes.get(choice-1).getCost());
						System.out.println("You have bought " + boxes.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");
			
		}while(choice != 0);
	}
	
	/**
	 * This method allows the user to shop for Fishing Boats.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopBoats(Equipment playerItems, Player player){
		int choice;
		
		do{
			char answer;
			
			System.out.println();
			displayBoats();
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice > 0 && choice <= boats.size()){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print(boats.get(choice-1).getName() + "? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= boats.get(choice-1).getCost()){
						playerItems.equipBoat(boats.get(choice-1));
						player.reduceCash(boats.get(choice-1).getCost());
						System.out.println("You have bought " + boats.get(choice-1).getName() + "!");
						try{
							for(int i = 0; i < success.length() ; i++){
								System.out.print(success.charAt(i));
								Thread.sleep(100);
							}
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
						System.out.println("\n");
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
				}
			}
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");
			
		}while(choice != 0);
	}
	
	/**
	 * This method allows the user to shop for Team Aqua Engine.
	 *
	 * @param playerItems the items that the player currently has
	 * @param player the player that will shop for items.
	 */
	public void shopEngine(Equipment playerItems, Player player){
		int choice;
		
		do{
			char answer;
			
			for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < 3; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == 2){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - "Team Aqua Engine".length() - 3;
				System.out.print("[1]Team Aqua Engine");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf("1000").length();
				System.out.print(1000);	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == 2){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
			
			try{
				for(int i = 0; i < ask.length() ; i++){
					System.out.print(ask.charAt(i));
					Thread.sleep(100);
				}
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		
			choice = scan.nextInt();
			
			if(choice == 1){
				System.out.println();
				try{
					for(int i = 0; i < query.length() ; i++){
						System.out.print(query.charAt(i));
						Thread.sleep(100);
					}
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}	
				System.out.print("Team Aqua Engine? [Y/N] ");
				
				answer = scan.next().charAt(0);
			
				if(answer == 'Y'){
					if(player.getCash() >= 1000){
						if(playerItems.getBoat().upgradeEngine()){
							player.reduceCash(1000);
							System.out.println("You have bought Team Aqua Engine!");
							try{
								for(int i = 0; i < success.length() ; i++){
									System.out.print(success.charAt(i));
									Thread.sleep(100);
								}
							}catch(InterruptedException ex){
								Thread.currentThread().interrupt();
							}
							System.out.println("\n");
						}
						
						else{
							System.out.println("Can not install engine on " + playerItems.getBoat().getName() + "!");
						}
					}
				
					else{
						System.out.println("You have insufficient cash!\n");
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						}
					}
					
				}
			}
			
			else if(choice != 0)
				System.out.println("Choice is out of bound\n");
			
		}while(choice != 0);	
	}
	
	/**
	 * This method displays all Fishing Rods for sale.
	 */
	public void displayRods(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < rods.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == rods.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - rods.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + rods.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(rods.get(i-1).getCost()).length();
				System.out.print(rods.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == rods.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
	}
	
	/**
	 * This method displays all Fishing Lures for sale.
	 */
	public void displayLures(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < lures.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == lures.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - lures.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + lures.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(lures.get(i-1).getCost()).length();
				System.out.print(lures.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == lures.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}		
	}
	
	/**
	 * This method displays all Fishing Lures for sale.
	 */
	public void displayLines(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < lines.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == lines.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - lines.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + lines.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(lines.get(i-1).getCost()).length();
				System.out.print(lines.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == lines.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
	}
	
	/**
	 * This method displays all Fishing Reels for sale.
	 */
	public void displayReels(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < reels.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == reels.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - reels.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + reels.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(reels.get(i-1).getCost()).length();
				System.out.print(reels.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == reels.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
	}
	
	/**
	 * This method displays all Tackle Boxes for sale.
	 */
	public void displayTackleBoxes(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < boxes.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == boxes.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - boxes.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + boxes.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(boxes.get(i-1).getCost()).length();
				System.out.print(boxes.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == boxes.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
	}
	
	/**
	 * This method displays all Fishing Boats for sale.
	 */
	public void displayBoats(){
		for(int i = 0; i < 35; i++){
			if(i == 0)
				System.out.print("\u2554");
			else if(i == 26)
				System.out.print("\u2566");
			else if(i == 34)
				System.out.print("\u2557\n");
			else
				System.out.print("\u2550");
		}
		
		for(int i = 0; i < boats.size()+2; i++){
			
			if(i == 0){
				System.out.print("\u2551 ");
				int len = 24 - "Price".length();
				System.out.print("Price");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - "Cost".length();
				System.out.print("Cost");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else if(i == boats.size() + 1){
				System.out.print("\u2551 ");
				int len = 24 - "Exit".length() - 3;
				System.out.print("[0]Exit");
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6;
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}else{
				System.out.print("\u2551 ");
				int len = 24 - boats.get(i-1).getName().length() - 3;
				System.out.print("[" + i + "]" + boats.get(i-1).getName());
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.print("\u2551 ");
				len = 6 - String.valueOf(boats.get(i-1).getCost()).length();
				System.out.print(boats.get(i-1).getCost());	
				for(int j = 0; j < len; j++){
					System.out.print(" ");
				}
				System.out.println("\u2551");
			}
			
			for(int j = 0; j < 35; j++){
				if(i == boats.size()+1){
					if(j == 0){
						System.out.print("\u255A");
					}else if(j == 34){
						System.out.print("\u255D\n");
					}else if(j == 26){
						System.out.print("\u2569");
					}else
						System.out.print("\u2550");
				}else{
					if(j == 0){
						System.out.print("\u2560");
					}else if(j == 34){
						System.out.print("\u2563\n");
					}else if(j == 26){
						System.out.print("\u256C");
					}else
						System.out.print("\u2550");
				}
			}
		}
	}
}