/**
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This function refers to the pokemons that are present in the whole locale 
 */
public class Pokemon extends TileObject{
	
	/**
	 * Initializes the default of a pokemon
	 * @param name name of the pokemon
	 */
	public Pokemon(String name){
		super(name);
		setRates(name);
	}
	
	/**
	 * This method sets the encounter rate and capture rate of the pokemon
	 * @param name name of the pokemon where the rates will be assigned.
	 */
	public void setRates(String name){
		if(name.compareTo("Magikarp") == 0 || name.compareTo("Goldeen") == 0 || name.compareTo("Remoraid") == 0 || name.compareTo("Frillish") == 0 || name.compareTo("Chinchou") == 0){
			encounterRate = 50;
			captureRate   = 40;
		}else if(name.compareTo("Tentacool") == 0 || name.compareTo("Horsea") == 0 || name.compareTo("Quilfish") == 0 || name.compareTo("Finneon") == 0 || name.compareTo("Wailmer") == 0){
			encounterRate = 25;
			captureRate   = 20;
		}else if(name.compareTo("Staryu") == 0  || name.compareTo("Shelder") == 0  || name.compareTo("Carvanha") == 0  || name.compareTo("Alomomora") == 0  || name.compareTo("Relicanth") == 0 ){
			encounterRate = 15;
			captureRate   = 10;
		}else if(name.equals("Red Gyarados") || name.equals("Lapras") || name.equals("Feebas") || name.equals("Manaphy") || name.equals("Kyogre")){
			encounterRate = 100;	
			captureRate   = 10;
		}
	}
}	