package view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import model.IModel;





@SuppressWarnings("serial")
public class Fenetre extends JFrame  {


	Scene panneau;
	IModel model;
	

	
	KeyEven keyEven = new KeyEven(); 
	

	
	
	public static int fenWidth = 700; 
	public static int fenHeight = 700; 
	
	
	
	
	

	public Fenetre (String valeur, IModel model)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(fenWidth, fenHeight);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
        this.setTitle(valeur);
		

        this.addKeyListener((KeyListener)keyEven);
        
        this.panneau = new Scene(this.model);
    	this.setContentPane(panneau);
	}
	
	
	
}
	


	

