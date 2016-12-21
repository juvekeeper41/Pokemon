package pokemon.model;

public class Zapados extends Pokemon implements Electric
{
	public Zapados()
	{
		super("Zapados", 145);
	}
	
	public int zapCannon()
	{
		return 30;
	}
	
	public int thunderShock()
	{
		return 30;
	}
}
