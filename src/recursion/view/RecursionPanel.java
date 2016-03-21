package recursion.view;

import java.awt.Color;
import javax.swing.*;
import recursion.controller.RecursionController;
import java.awt.event.*;

/**
 * @author rbar3155
 * @version 0.x Feb 11, 2016
 */
public class RecursionPanel extends JPanel 
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
  	private JTextArea resultsArea;
  
  	
  	public RecursionPanel(RecursionController baseController)
  	{
  		this.baseController = baseController;
  		baseLayout = new SpringLayout();
  		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
  		factorialButton = new JButton("Get n!");
  		inputField = new JTextField(20);
  		resultsArea = new JTextArea(10, 20);
  		
  		setupPanel();
  		setupLayout();
  		setupListeners();
  	}
  	
  	private void setupPanel()
  	{
  		this.setLayout(baseLayout);
  		this.add(fibonacciButton);
  		this.add(factorialButton);
  		this.add(inputField);
  		this.add(resultsArea);
  		this.setBackground(Color.MAGENTA);
  		resultsArea.setWrapStyleWord(true);
  		resultsArea.setLineWrap(true);
  	}
  	
  	private void setupLayout()
  	{
  		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 65, SpringLayout.NORTH, this);
  		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 66, SpringLayout.WEST, this);
  		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -183, SpringLayout.EAST, this);
  		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, fibonacciButton);
  		
  	}
  	
  	private void setupListeners()
  	{
  		fibonacciButton.addActionListener(new ActionListener()
  		{
  			public void actionPerformed(ActionEvent click)
  			{
  				
  			}
  		});
  	}
  
}


