package pokemon.controller;

import java.util.ArrayList;
import java.util.Map;
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.HashMap;

	public class PokemonController
	{
		private PokemonFrame baseFrame;
		private ArrayList<Pokemon> pokedex;
		
		public PokemonController()
		{
			
			pokedex = newArrayList<Pokemon>();
			buildPokedex();
			baseFrame = new baseFrame(this);
		}

	public void start()
	{
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Graveler());
		pokedex.add(new Bulbasaur());
		pokedex.add(new Gyarados());
		pokedex.add(new Zapados());
		pokedex.add(new Blaziken());
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
		return baseFrame;
	}
		
}

