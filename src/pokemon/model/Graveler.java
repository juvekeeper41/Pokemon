package pokemon.model;

public class Graveler extends Pokemon implements Rock
{
	public Graveler()
	{
		super("Graveler", 75);
	}
	
	public Graveler(String name)
	{
		super(name, 75);
	}
	
	public int rockSmash()
	{
		return 25;
	}
	
	public int magnetPull()
	{
		return this.getAttackPoints() * 15;
	}
}
