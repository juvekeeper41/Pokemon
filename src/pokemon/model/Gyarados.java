package pokemon.model;

public class Gyarados extends Pokemon implements Water
{
	public Gyarados()
	{
		super("Gyarados", 130);
	}
	
	public int aquaJet()
	{
		return 30;
	}
	
	public int bubble()
	{
		return 30;
	}
}
