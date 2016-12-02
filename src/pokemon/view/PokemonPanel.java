package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;
import pokemon.controller.PokemonController;



public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel pokemonLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.updateButton = new JButton("Update the stats!");
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -10, SpringLayout.EAST, this);
		this.nameField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, speedField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, speedField);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, healthField);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"Graveler", "Blaziken", "Gyarados", "Zapados", "Bulbasaur"});
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 20, SpringLayout.WEST, this);
		this.advancedLabel = new JLabel("Advanced Information:");
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 16, SpringLayout.SOUTH, speedField);
		this.combatLabel = new JLabel ("Combat Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 278, SpringLayout.WEST, combatLabel);
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 24, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -444, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -312, SpringLayout.EAST, this);
		this.speedLabel = new JLabel("Speed Rate:");
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 68, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 24, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -484, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -284, SpringLayout.EAST, this);
		this.nameLabel = new JLabel("Pokemon Name:");
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 0, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -38, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -24, SpringLayout.NORTH, numberLabel);
		this.pokemonLabel = new JLabel("The current Pokemon:", pokemonIcon, SwingConstants.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -218, SpringLayout.SOUTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900,600));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		this.setBackground(Color.MAGENTA);
		this.add(pokedexSelector);
		this.add(updateButton);
		this.add(nameField);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(pokemonLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		
		this.add(numberField);
		this.add(advancedArea);
		
	}
	
	private void setupListeners()
	{
	
	}
	
	private void setupLayout()
	{
		
	}
	
}
