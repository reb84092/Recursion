package recursion.view;

import javax.swing.JFrame;
import recursion.controller.*;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Lets recurse");
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
