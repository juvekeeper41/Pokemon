package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass
{
	public Bulbasaur()
	{
		super("Bulbasaur", 51);
	}
	
	public int sleepPowder()
	{
		return 30;
	}
	
	public int solarBeam()
	{
		return 30;
	}
}
