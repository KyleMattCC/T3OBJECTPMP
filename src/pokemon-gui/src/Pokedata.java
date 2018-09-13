/** 
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the data of a pokemon.
 */
public class Pokedata{
	/**
	 * The name of the pokemon in the data
	 */
	private String name;
	/**
	 * The fame of the pokemon in the data
	 */
	private int    fame;
	/**
	 * The loss per capture of the pokemon in the data
	 */
	private int    lossPerCapture;
	/**
	 * The nubmer of times the pokemon in the data was captured
	 */
	private int    timesCaptured;
	/**
	 * The size of the pokemon in the data
	 */
	private double size;
	/**
	 * The weight of the pokemon in the data
	 */
	private double weight;
	/**
	 * The description of the pokemon in the data
	 */
	private String description;
	/**
	 * The home place of the pokemon in the data
	 */
	private String homePlace;
	/**
	 * The home type of the pokemon in the data
	 */
	private char   homeType;
	
	/**
	 * Initializes the defaults of the Pokemon.
	 * @param name name of the pokemon that will be assigned to name.
	 */
	public Pokedata(String name){
		setName(name);
		setHomePlace(name);
		setDetails(name);
		setTimesCaptured(name);
	}

	/**
	 * This method sets the name of the pokemon.
	 * @param name name of the pokemon that will be assigned to name.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * This method sets the home place of the pokemon given its name.
	 * @param name name of the pokemon.
	 */
	public void setHomePlace(String name){
		if(name.equals("Magikarp") || name.equals("Tentacool") || name.equals("Staryu") || name.equals("Red Gyarados")){
			this.homePlace = "Lake of Rage";
		}else if(name.equals("Goldeen") || name.equals("Horsea") || name.equals("Shelder") || name.equals("Lapras")){
			this.homePlace = "Union Cave";
		}else if(name.equals("Remoraid") || name.equals("Quilfish") || name.equals("Carvanha") || name.equals("Feebas")){
			this.homePlace = "Route 119";
		}else if(name.equals("Frillish") || name.equals("Finneon") || name.equals("Alomomora") || name.equals("Manaphy")){
			this.homePlace = "Fiore's Sea";
		}else if(name.equals("Chinchou") || name.equals("Wailmer") || name.equals("Relicanth") || name.equals("Kyogre")){
			this.homePlace = "Marine Cave";
		}
	}
	
	/**
	 * This method sets the details necessary after capturing a pokemon in a terrain, given its name.
	 * @param name name of the pokemon.
	 */
	public void setDetails(String name){
		if(name.compareTo("Magikarp") == 0 || name.compareTo("Goldeen") == 0 || name.compareTo("Remoraid") == 0 || name.compareTo("Frillish") == 0 || name.compareTo("Chinchou") == 0){
			fame          = 10;
			homeType      = 'S';
			lossPerCapture= 2;
		}else if(name.compareTo("Tentacool") == 0 || name.compareTo("Horsea") == 0 || name.compareTo("Quilfish") == 0 || name.compareTo("Finneon") == 0 || name.compareTo("Wailmer") == 0){
			fame          = 20;
			homeType      = 'D';
			lossPerCapture= 5;
		}else if(name.compareTo("Staryu") == 0  || name.compareTo("Shelder") == 0  || name.compareTo("Carvanha") == 0  || name.compareTo("Alomomora") == 0  || name.compareTo("Relicanth") == 0 ){
			fame          = 30;
			homeType      = 'V';
			lossPerCapture= 10;
		}else if(name.equals("Red Gyarados") || name.equals("Lapras") || name.equals("Feebas") || name.equals("Manaphy") || name.equals("Kyogre")){
			fame          = 0;
			homeType      = 'L';
			lossPerCapture= 0;
		}
	}
	
	/**
	 * This method sets the weight of the pokemon, given its name.
	 * @param name name of the pokemon.
	 */
	public void setWeight(String name){
		if(name.equals("Magikarp"))
			weight = 10;
		else if(name.equals("Tentacool"))
			weight = 45.5;
		else if(name.equals("Staryu"))
			weight = 34.5;
		else if(name.equals("Goldeen"))
			weight = 15;
		else if(name.equals("Horsea"))
			weight = 8;
		else if(name.equals("Shelder"))
			weight = 4;
		else if(name.equals("Remoraid"))
			weight = 12;
		else if(name.equals("Quilfish"))
			weight = 3.9;
		else if(name.equals("Carvanha"))
			weight = 20.8;
		else if(name.equals("Frillish"))
			weight = 33;
		else if(name.equals("Finneon"))
			weight = 7;
		else if(name.equals("Alomomora"))
			weight = 31.6;
		else if(name.equals("Chinchou"))
			weight = 12;
		else if(name.equals("Wailmer"))
			weight = 130;
		else if(name.equals("Relicanth"))
			weight = 23.4;
		else if(name.equals("Red Gyarados"))
			weight = 235;
		else if(name.equals("Lapras"))
			weight = 220;
		else if(name.equals("Feebas"))
			weight = 7.4;
		else if(name.equals("Manaphy"))
			weight = 1.4;
		else if(name.equals("Kyogre"))
			weight = 352;
	}
	
	/**
	 * This method sets the size of the pokemon, given its name.
	 * @param name name of the pokemon.
	 */
	public void setSize(String name){
		if(name.equals("Magikarp"))
			size = 0.9;
		else if(name.equals("Tentacool"))
			size = 0.9;
		else if(name.equals("Staryu"))
			size = 0.8;
		else if(name.equals("Goldeen"))
			size = 0.6;
		else if(name.equals("Horsea"))
			size = 0.4;
		else if(name.equals("Shelder"))
			size = 0.3;
		else if(name.equals("Remoraid"))
			size = 0.6;
		else if(name.equals("Quilfish"))
			size = 0.5;
		else if(name.equals("Carvanha"))
			size = 0.8;
		else if(name.equals("Frillish"))
			size = 1.2;
		else if(name.equals("Finneon"))
			size = 0.4;
		else if(name.equals("Alomomora"))
			size = 1.2;
		else if(name.equals("Chinchou"))
			size = 0.5;
		else if(name.equals("Wailmer"))
			size = 2;
		else if(name.equals("Relicanth"))
			size = 10;
		else if(name.equals("Red Gyarados"))
			size = 6.5;
		else if(name.equals("Lapras"))
			size = 2.5;
		else if(name.equals("Feebas"))
			size = 0.6;
		else if(name.equals("Manaphy"))
			size = 0.3;
		else if(name.equals("Kyogre"))
			size = 4.5;
	}
	
	/**
	 * This method sets the description of the pokemon, given its name.
	 * @param name name of the pokemon.
	 */
	public void setDescription(String name){
		if(name.equals("Magikarp"))
			description = "Its swimming muscles are weak, so it is easily washed away by currents. In places where water pools, you can see many Magikarp deposited there by the flow.";
		else if (name.equals("Tentacool"))
			description = "Its body is almost entirely composed of water. It ensnares its foe with its two long tentacles, then stabs with the poison stingers at their tips.";
		else if (name.equals("Staryu"))
			description = "It gathers with others in the night and makes its red core glow on and off with the twinkling stars. It can regenerate limbs if they are severed from its body.";
		else if (name.equals("Goldeen"))
			description = "In the springtime, schools of Goldeen can be seen swimming up falls and rivers. It metes out staggering damage with its single horn.";
		else if (name.equals("Horsea"))
			description = "By cleverly flicking the fins on its back side to side, it moves in any direction while facing forward. It spits ink to escape if it senses danger.";
		else if (name.equals("Shelder"))
			description = "At night, it burrows a hole in the seafloor with its broad tongue to make a place to sleep. While asleep, it closes its shell, but leaves its tongue hanging out.";
		else if (name.equals("Remoraid"))
			description = "A Remoraid uses its abdominal muscles to forcefully expel swallowed water, then shoot down flying prey. When evolution approaches, it travels down rivers.";
		else if (name.equals("Quilfish"))
			description = "A Qwilfish uses the pressure of water it swallows to shoot toxic quills all at once from all over its body. It finds swimming to be somewhat challenging.";
		else if (name.equals("Carvanha"))
			description = "Carvanha attack ships in swarms, making them sink. Although it is said to be a very vicious Pokémon, it timidly flees as soon as it finds itself alone.";
		else if (name.equals("Frillish"))
			description = "If its veil-like arms stun and wrap a foe, that foe will be dragged miles below the surface, never to return.";
		else if (name.equals("Finneon"))
			description = "The line running down its side can store sunlight. It shines vividly at night.";
		else if (name.equals("Alomomora"))
			description = "It gently holds injured and weak Pokémon in its fins. Its special membrane heals their wounds.";
		else if (name.equals("Chinchou"))
			description = "When it senses danger, it discharges positive and negative electricity from its two antennae. It lives in depths beyond sunlight's reach.";
		else if (name.equals("Wailmer"))
			description = "While this Pokémon usually lives in the sea, it can survive on land, although not too long. It loses vitality if its body becomes dried out.";
		else if (name.equals("Relicanth"))
			description = "A Pokémon that was once believed to have been extinct. The species has not changed its form for 100 million years. It walks on the seafloor using its pectoral fins.";
		else if (name.equals("Red Gyarados"))
			description = "It is an extremely vicious and violent Pokémon. When humans begin to fight, it will appear and burn everything to the ground with intensely hot flames.";
		else if (name.equals("Lapras"))
			description = "People have driven Lapras almost to the point of extinction. In the evenings, this Pokémon is said to sing plaintively as it seeks what few others of its kind still remain.";
		else if (name.equals("Feebas"))
			description = "Feebas live in ponds that are heavily infested with weeds. Because of its hopelessly shabby appearance, it seems as if few Trainers raise it.";
		else if (name.equals("Manaphy"))
			description = "It is born with a wondrous power that lets it bond with any kind of Pokémon.";
		else if (name.equals("Kyogre"))
				description = "Kyogre is named in mythology as the Pokémon that expanded the sea by covering the land with torrential rains and towering tidal waves. It took to sleep after a cataclysmic battle with Groudon.";
	}
	
	/**
	 * This method initializes the times the pokemon was captured to zero.
	 * @param name name of the pokemon.
	 */
	public void setTimesCaptured(String name){
		this.timesCaptured = 0;
	}
	
	/**
	 * This method gets the name of the pokemon.
	 * @return name of the pokemon.
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * This method gets the weight of the pokemon.
	 * @return weight of the pokemon
	 */
	public double getWeight(){
		return this.weight;
	}
	
	/**
	 * This method gets the size of the pokemon.
	 * @return size of the pokemon
	 */
	public double getSize(){
		return this.size;
	}
	
	/**
	 * This method gets the description of the pokemon.
	 * @return description of the pokemon
	 */
	public String getDescription(){
		return this.description;
	}
	
	/**
	 * This method gets the loss per capture of a pokemon.
	 * @return loss per capture
	 */
	public int getLossPerCapture(){
		return this.lossPerCapture;
	}
	
	/**
	 * This method gets the number of times the pokemon has been captured.
	 * @return number of times a pokemon has captured.
	 */
	public int getTimesCaptured(){
		return this.timesCaptured;
	}
	
	/**
	 * This method gets the fame of the pokemon after its capture.
	 * @return reduced fame
	 */
	public int getReducedFame(){
		return (this.fame - this.lossPerCapture*this.timesCaptured < 0) ? 0 : this.fame - this.lossPerCapture*this.timesCaptured;
	}
	
	/**
	 * This method increments the number of times the pokemon was captured
	 */
	public void addTimesCaptured(){
		this.timesCaptured++;
	}
	
	/**
	 * This method displays the pokemon's data
	 */
	public void displayPokeInfo(){
		System.out.println("Name      : " + name);
		System.out.println("Home Place: " + homePlace + ", on tile " + homeType);
		System.out.println("Size      : " + size);
		System.out.println("Weight    : " + weight);
		System.out.println("Times Captured: " + timesCaptured);
		System.out.println(description);
	}
}