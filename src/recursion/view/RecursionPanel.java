package recursion.view;

import java.awt.Color;
import javax.swing.*;
import RecursionController.controller.RecursionController;

/**
 * @author rbar3155
 * @version 0.x Feb 11, 2016
 */
public class RecursionPanel extends JPanel 
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibbonacciButton;
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
  		resultsArea = newJTextArea(10, 20);
  		
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
  
}


