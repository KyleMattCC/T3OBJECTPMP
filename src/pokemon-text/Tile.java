public class Tile{
	private String name;
	private TileObject object;
	private boolean passable;
	
	public Tile(String name){
		setName(name);
		setPassable(name);
		this.object = null;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPassable(String name){
		if(name.equals("Land"))
			this.passable = false;
		else
			this.passable = true;
	}
	
	public void setObject(TileObject object){
		this.object = object;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean isPassable(){
		return this.passable;
	}
	
	public TileObject getObject(){
		return this.object;
	}
}