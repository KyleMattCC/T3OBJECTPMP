import java.util.*;

/** 
 * @authors	Winfed Villaluna, Birgham Serrano, Kyle Chua
 *
 * This class refers to the game.
 */
public class GameEngine{
	
	/**
	 * This method allows the player to play the game.
	 */
	public void PlayGame(){
	
		Scanner sc = new Scanner(System.in);
		
		try{
			String hello   = "Hello! What is your name new player? ";
			for(int i = 0; i < hello.length() ; i++){
				System.out.print(hello.charAt(i));
				Thread.sleep(100);
			}
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
		/**
		 * will contain the name of the player.
		 */
		String name    = sc.next();
		
		try{
			String opening = "... Are you a [Male] or a [Female]? ";
			
			System.out.print("\nS");
			Thread.sleep(100);
			System.out.print("o");
			Thread.sleep(100);
			System.out.print(" ");
			Thread.sleep(100);
			
			for(int i = 0; i < name.length() ; i++){
				System.out.print(name.charAt(i));
				Thread.sleep(100);
			}
			for(int i = 0; i < opening.length(); i++){
				System.out.print(opening.charAt(i));
				Thread.sleep(100);
			}
			
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}

		/**
		 * will contain the gender of the player.
		 */
		String gender = sc.next();
				
		/**
		 * variable of the Player class.
		 *
		 * @param name the name of the player.
		 * @param gender the gender of the player.
		 */
		Player One = new Player(name, gender);
		
		/**
		 *variable of the Shop class.
		 */
		Shop shop = new Shop ();
		
		System.out.println();
		
		/**
		 * The cursor of the player which will represent the player in the map.
		 */
		char cursor = '-';
		
		try {
			String greet = "Hello " + One.getName() + ". Welcome to the Pokemon fishing world! \nYou are to start with these following equipment:\n\n";
			for(int i = 0; i < greet.length(); i++){
				System.out.print(greet.charAt(i));
				Thread.sleep(100);
			}
			Thread.sleep(2000);
			System.out.println("Fishing Rod : " + One.getEquipment(0).getRodName());
			Thread.sleep(1500);
			System.out.println("Fishing Line: " + One.getEquipment(0).getLineName());
			Thread.sleep(1500);
			System.out.println("Fishing Lure: " + One.getEquipment(0).getLureName());
			Thread.sleep(1500);
			System.out.println("Fishing Reel: " + One.getEquipment(0).getReelName());
			Thread.sleep(1500);
			System.out.println("Tackle  Box : " + One.getEquipment(0).getTackleBoxName());
			Thread.sleep(1500);
			System.out.println("Fishing Boat: " + One.getEquipment(0).getBoatName());
			Thread.sleep(1500);
			System.out.println("Cash        : " + One.getCash());
			Thread.sleep(1500);			
			System.out.println("Your cursor : " + cursor);
			Thread.sleep(1500);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		};
		
		System.out.println();
		System.out.println();
		
		/**
		 * the array of maps in the game containing all maps.
		 */
		ArrayList <Locale>maps = new ArrayList<Locale>();
		
		/**
		 * Locale class variables that will be added to the array list of maps
		 *
		 * @param string the name of the locale.
		 */
		Locale map1 = new Locale("Lake of Rage");
		Locale map2 = new Locale("Union Cave");
		Locale map3 = new Locale("Route 119");
		Locale map4 = new Locale("Fiore's Sea");
		Locale map5 = new Locale("Marine Cave");
		
		maps.add(map1);
		maps.add(map2);
		maps.add(map3);
		maps.add(map4);
		maps.add(map5);
		
		/**
		 * refers to the current day.
		 */
		int    day      = 1;		
		/**
		 * will contain either 'Y' or 'N' which will state if the players wants to exit the map.
		 */
		char   exitMap  = 0;		
		/**
		 *will contain either 'Y' or 'N' which will state if the players wants to exit the game.
		 */
		char   exitGame = 0;		
		/**
		 *will contain either 'Y' or 'N' which will state if the players wants to end the day.
		 */
		int    endDay   = 0;
		
		while(exitGame == 0){
			System.out.println("Where do you wanna fish?");
			System.out.println("\t[1] Lake of Rage");
			System.out.println("\t[2] Union Cave");
			System.out.println("\t[3] Route 119");
			System.out.println("\t[4] Fiore's Sea");
			System.out.println("\t[5] Marine Cave");
			System.out.println("\t[6] EXIT GAME");
			int option = sc.nextInt();
			if(option == 6)
				return;
			while(option != 1){
				if(option > 1 && option < 6)
					System.out.println("DEMO VERSION. ACCESS TO MAP NOT ALLOWED!");
				else if(option != 6)
					System.out.println("INVALID INPUT!");
				option = sc.nextInt();
			}					
			
			do{
				/**
				 * will contain the treasure caught.
				 */
				Treasure tempTreasure = null;
				Treasure treasure = null;
				endDay = 0;
				One.setPosX(maps.get(option-1).accessPortX());
				One.setPosY(maps.get(option-1).accessPortY());
				System.out.print("\nDAY " + day);
				
				/**
				 * contains what the player wishes to do before the player starts fishing.
				 */
				int toDo;
				
				do{
					try{
						System.out.println();
						String question = "What would you like to do?";
						for(int i = 0; i < question.length() ; i++){
							System.out.print(question.charAt(i));
							Thread.sleep(100);
						}
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				
					System.out.println("\n\t[1] Start fishing");
					System.out.println("\t[2] Check equipments");
					System.out.println("\t[3] Go to shop");
					System.out.println("\t[4] Show badges");
				
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				
					toDo = sc.nextInt();
				
					if(toDo == 2){
						One.getEquipment(option-1).showEquipment(One.getCash());
					}
				
					else if(toDo == 3){
						shop.goShop(One.getEquipment(option-1), One);
					}
					
					else if(toDo == 4){
						One.displayBadges();
					}										
				}while(toDo != 1);
				
				if(!(maps.get(option-1).caughtLegendary()))
					maps.get(option-1).updateLegendaryEncounterRate(100);
				
				/**
				 * contains the possible number of moves the player is allowed to do.
				 */
				double moves = One.getEquipment(option-1).getMoves();
				/**
				 * contains the possible number of casts the player is allowed to do.
				 */
				int casts = One.getEquipment(option-1).getCasts();
				/**
				 * contains the number of treasure the player caught.
				 */
				int caughtTreasure = 0;
				
				do{
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					
					System.out.println("MOVES AVAILABLE : " + moves);
					System.out.println("CASTS AVAILABLE : " + casts);
					
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
					
					System.out.println();
					
					maps.get(option-1).displayLocale(One.getPosX(), One.getPosY(), cursor);
					 
					System.out.println("\nYou are now at " + ((One.getPosX()-5)) + ", " + ((One.getPosY()-5)*-1));
					System.out.println("Your currently on top of tile " + maps.get(option-1).accessCoordinate(One.getPosY(), One.getPosX()).getName());
					System.out.println("\nW - FORWARD");
					System.out.println("S - BACKWARD");
					System.out.println("A - LEFT");
					System.out.println("D - RIGHT");
					System.out.println("F - FISH IN CURRENT TILE");
					System.out.println("E - END DAY\n");
					System.out.print("Enter action: ");
					
					/**
					 * contains the movement/action the player wants to do.
					 */
					char action = sc.next().charAt(0);
					
					System.out.println();
						
						if(action == 'W' || action == 'w' || action == 'S' || action == 's' || action == 'A' || action == 'a' || action == 'D' || action == 'd'){
							if(moves > 0){
							
								if(action == 'W' || action == 'w'){
									
									One.moveUp(maps.get(option-1));
									
								}else if(action == 'S' || action == 's'){
									
									One.moveDown(maps.get(option-1));
									
								}else if(action == 'A' || action == 'a'){
									
									One.moveLeft(maps.get(option-1));
								
								}else if(action == 'D' || action == 'd'){
								
									One.moveRight(maps.get(option-1));
								
								}
							
								if(One.getEquipment(option-1).getBoat().hasEngine()){
									moves = moves - 0.5;
								}
							
								else{
									moves--;									
								}
								
							}else if(casts > 0){
								
								System.out.println("UNABLE TO MOVE. END THE DAY OR FISH IN THIS SPOT");
								
							}else{
								
								System.out.println("UNABLE TO MOVE. END THE DAY");
								
							}
							if(maps.get(option-1).accessCoordinate(One.getPosY(), One.getPosX()).getName().equals("Port")){
										maps.get(option-1).displayLocale(One.getPosX(), One.getPosY(), cursor);
										System.out.println("YOU HAVE RETURNED TO THE PORT. DAY " + day + " HAS ENDED.");
										endDay = 1;
							}
						}else if(action == 'F' || action == 'f'){
							if(!(maps.get(option-1).accessCoordinate(One.getPosY(), One.getPosX()).getName().equals("Port"))){
								
								if(maps.get(option-1).accessCoordinate(One.getPosY(), One.getPosX()).getName().equals("Legendary Tile") && One.getFame(option-1) < 100){
									
									System.out.println("You can not fish here. You still need " + (100-One.getFame(option-1)) + " Fame to be able to fish here."); 	
									
								}else{								
									if(casts > 0){
										
										tempTreasure = (Treasure)One.fish(maps.get(option-1), option-1);
										
										if(tempTreasure != null){
											treasure = tempTreasure;
											caughtTreasure++;
										}
									
										casts--;
								
									}
								
								}
								
							}else{
								
								System.out.println("Can't fish here...\n");
							
							}
						}else if(action == 'E' || action == 'e'){
							
							try{
								String prompt = "Are you sure you want to end this day? [Y or N]: ";
								for(int  i = 0; i < prompt.length(); i++){
									System.out.print(prompt.charAt(i));
									Thread.sleep(100);
								}
							}catch(InterruptedException ex){
								Thread.currentThread().interrupt();
							};
							
							action = sc.next().charAt(0);
							
							System.out.println();
							if(action == 'Y' || action == 'y')
								endDay = 1;		
								
						}
						
					if(casts == 0 && moves == 0){
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						};
						
						System.out.println("NO MORE MOVES OR CASTS AVAILABLE. DAY WILL NOW END\n");
						
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ex){
							Thread.currentThread().interrupt();
						};
						
						endDay = 1;
						
					}
					
				}while(endDay != 1);
			
				if(caughtTreasure > 0){
					System.out.println("You have acquired " + caughtTreasure + " " + treasure.getName() + " which amounts to " + (treasure.getPrice()*caughtTreasure) + " cash!");
					One.addCash(treasure.getPrice()*caughtTreasure);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					};
					System.out.println(One.getName() + " has obtained " + (treasure.getPrice()*caughtTreasure) + " cash!\n");
				}
				day++;
				
				String leave = "Want to leave the map? [Y or N]: ";
				
				for(int i = 0; i < leave.length(); i++){
					try{
						System.out.print(leave.charAt(i));
						Thread.sleep(100);
					}catch(InterruptedException ex){
						Thread.currentThread().interrupt();
					}
				}
				
				exitMap = sc.next().charAt(0);
				
				System.out.println();
			}while(day != 30 && exitMap == 'N');
		}
	}
}