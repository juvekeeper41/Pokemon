package poke.model;

public class Graveler extends Pokemon implements Rock
{
	public Graveler()
	{
		super("Graveler", 75);
	}
	
	public int tackle()
	{
		return 30;
	}
	
	public int rockSmash()
	{
		return 30;
	}
}
