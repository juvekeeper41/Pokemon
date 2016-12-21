package pokemon.model;

public class Blaziken extends Pokemon implements Fire
{
	public Blaziken()
	{
		super("Blaziken", 257);
	}
	
	public int blazeKick()
	{
		return 70;
	}
	
	public int flareBlitz()
	{
		return 50;
	}
}
