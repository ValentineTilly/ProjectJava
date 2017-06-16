package view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Fenetre extends JFrame  {

	
	
	public Fenetre (String valeur )
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
         this.setTitle(valeur);
	}
	
	
	
	
}
	
	

