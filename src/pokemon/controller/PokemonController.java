package pokemon.controller;

import java.util.ArrayList;
import java.util.Map;
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.HashMap;

	public class PokemonController
	{
		private BaseFrame baseFrame;
		private ArrayList<Pokemon> pokedex;
		
		public PokemonController()
		{
			pokedex = newArrayList<Pokemon>();
			buildPokedex();
			baseFrame = new baseFrame(this);
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
		pokedex.add(new Blaziken("Fire Serpent"));
	}
	
	public String [] buildPokedexText()
	{
		String [] pokemonNames = new String [pokedex.size()];
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHitPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	public PokemonFrame getBaseFrame()
	{
		
	}
		
}

