/**
 * @authors Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This is the main driver of the game 
 */
public class Driver{
	
	/** 
	 * This is the main function
	 * @param args
	 */
	public static void main(String [] args){
		GameEngine pokemonFishing = new GameEngine();
		
		/**
		 * Starts the game.
		 */
		pokemonFishing.PlayGame();
	}
}