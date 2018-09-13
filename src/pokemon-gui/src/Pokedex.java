import java.util.*;

/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the holder of pokemon data 
 */
public class Pokedex{
	/**
	 * Array list that contains pokedata
	 */
	private ArrayList<Pokedata> pokeList;
	
	/**
	 * Initializes the data of each pokemon and adds them to array pokeList
	 */
	public Pokedex(){
		pokeList = new ArrayList<Pokedata>();
		Pokedata magikarp    = new Pokedata ("Magikarp");
		Pokedata tentacool   = new Pokedata ("Tentacool");
		Pokedata staryu      = new Pokedata ("Staryu");
		Pokedata redGyarados = new Pokedata ("Red Gyarados");
		
		Pokedata goldeen   = new Pokedata("Goldeen");
		Pokedata horsea    = new Pokedata("Horsea");
		Pokedata shelder   = new Pokedata("Shelder");
		Pokedata lapras    = new Pokedata("Lapras");		
		
		Pokedata remoraid = new Pokedata("Remoraid");
		Pokedata quilfish = new Pokedata("Quilfish");
		Pokedata carvanha = new Pokedata("Carvanha");
		Pokedata feebas   = new Pokedata("Feebas");
		
		Pokedata frillish  = new Pokedata("Frillish");
		Pokedata finneon   = new Pokedata("Finneon");
		Pokedata alomomora = new Pokedata("Alomomora");
		Pokedata manaphy   = new Pokedata("Manaphy");
		
		Pokedata chinchou  = new Pokedata("Chinchou");
		Pokedata wailmer   = new Pokedata("Wailmer");
		Pokedata relicanth = new Pokedata("Relicanth");
		Pokedata kyogre    = new Pokedata("Kyogre");
		
		pokeList.add(magikarp);
		pokeList.add(tentacool);
		pokeList.add(staryu);
		pokeList.add(redGyarados);
		
		pokeList.add(goldeen);
		pokeList.add(horsea);
		pokeList.add(shelder);
		pokeList.add(lapras);
		
		pokeList.add(remoraid);
		pokeList.add(quilfish);
		pokeList.add(carvanha);
		pokeList.add(feebas);
		
		pokeList.add(frillish);
		pokeList.add(finneon);
		pokeList.add(alomomora);
		pokeList.add(manaphy);
		
		pokeList.add(chinchou);
		pokeList.add(wailmer);
		pokeList.add(relicanth);
		pokeList.add(kyogre);
	}
	
	/**
	 * This method gets the index of the pokemon in the pokedex
	 * @param name name of the pokemon
	 * @return index of the pokemon in the list
	 */
	public int getPokemon(String name){
		int hold = 0;
		for(int i = 0; i < pokeList.size(); i++){
			if(this.pokeList.get(i).getName().equals(name))
				hold = i;
		}
		return hold;
	}
	
	/**
	 * This method increments the number of times the pokemon was captured
	 * @param name name of the pokemon.
	 */
	public void addCapture(String name){
		this.pokeList.get(getPokemon(name)).addTimesCaptured();
	}
	
	/**
	 * This method gets the number of times the pokemon was captured before
	 * @param name name of the pokemon.
	 * @return number of times the certain pokemon was caught
	 */
	public int getCapture(String name){
		return this.pokeList.get(getPokemon(name)).getTimesCaptured();
	}
	
	/**
	 * This method gets the fame returned by the pokemon
	 * @param name name of the pokemon.
	 * @return fame that will be received if the pokemon is caught.
	 */
	public int getReducedFame(String name){
		return this.pokeList.get(getPokemon(name)).getReducedFame();
	}
		
	/**
	 * This method gets the total number of pokemon captured.
         * @return number of pokemon captured
	 */
	public int getPokemonNum(){
        int hold = 0;
        for(int i = 0; i < pokeList.size(); i++){
            if(this.pokeList.get(i).getTimesCaptured() > 0)
                hold++;
        }
        return hold;
    }
}