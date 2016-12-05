package pokemon.controller;

public class PokemonController
{

	
	
	
	
	
	
	
	
	
	
	
	
	
	baseFrame = new PokemonFrame(this);
	}

	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance!");
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Graveler("Graphite"));
		pokedex.add(new Bulbasaur("Hydroponic"));
		pokedex.add(new Gyarados("Water Elemental"));
		pokedex.add(new Zapados("Lightning Strike"));
		pokedex.add(new Blaziken("Fire Elemental"));
	}
	
	public String [] buildPokedexText()
	{
		String [] pokemonNames = new String [pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
}

