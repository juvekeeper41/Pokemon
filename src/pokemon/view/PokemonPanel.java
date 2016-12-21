package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;
import pokemon.controller.PokemonController;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		this.nameField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"Graveler", "Blaziken", "Gyarados", "Zapados", "Bulbasaur"});
		this.advancedLabel = new JLabel("Advanced Information:");
		this.combatLabel = new JLabel ("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("Pokemon Name:");
		this.pokemonLabel = new JLabel("The current Pokemon:", pokemonIcon, SwingConstants.CENTER);
		
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
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				System.out.println(baseController.getPokedex().get(selected));
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHitPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
	}
	
			
//	this.addMouseListener(new MouseListener()
//	{
//		public void mouseEntered(MouseEvent entered)
//		{
//			//JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is in!");
//		}
//		
//		public void mouseExited(MouseEvent exited)
//		{
//			//JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is out!");
//		}
//		
//		public void mousePressed(MouseEvent pressed)
//		{
//			//JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was pressed!");
//		}
//		
//		public void mouseReleased(MouseEvent released)
//		{
//			//JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was released!");
//		}
//		
//		public void MouseClicked(MouseEvent click)
//		{
//			//JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was clicked!");
//		}
//		
//	});
	
//	this.addMouseMotionListener(new MouseMotionListener()
//			{
//				public void mouseDragged(MouseEvent dragged)
//				{
//					setRandomColor();
//					if(Math.abs(dragged.getX() - updateButton.getX()) < 5 || (Math.abs(dragged.getY() - updateButton.getY()) < 5))
//						{
//							updateButton.setLocation(dragged.getX(), dragged.getY() + 20);
//						}
//	
//				}
//				
//				public void mouseMoved(MouseEvent moved)
//				{
//					JOptionPane.ShowMessageDialog(baseController.getBaseFrame(), "Moving from X:" + moved.getX() + ", Y:" + moved.getY());
//				}
//			});
//	}
	
	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
	}
	
	private void changeColorBaseOnData(String data)
	{
		if (data.contains("Electric"))
		{
			this.setBackground(Color.YELLOW);			
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		else if (data.contains("Rock"))
		{
			this.setBackground(Color.GRAY);
		}
		else 
		{
			this.setBackground(Color.CYAN);
		}
		
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			pokemonLabel.setIcon(pokemonIcon);
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
			pokemonLabel.setIcon(pokemonIcon);
		}
		repaint();
	}
	
	private boolean checkValidInteger(String input)
	{
		
	}
	
	private boolean checkValidInteger(String input)
	{
		
	}
	
	private boolean checkValidName(String name)
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, speedField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, speedField);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 16, SpringLayout.SOUTH, speedField);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 24, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -444, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -312, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 278, SpringLayout.WEST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 68, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 24, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -484, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -284, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 0, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -38, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -24, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -218, SpringLayout.SOUTH, this);
		
	}
	
}
