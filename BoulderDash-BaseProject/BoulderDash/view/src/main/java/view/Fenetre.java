package view;

import java.awt.Image;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame  {

	Scene panneau = new Scene(); 
	KeyEven keyEven = new KeyEven(); 
	public static int fenWidth = 700; 
	public static int fenHeight = 400; 
	
	

	public Fenetre (String valeur)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(fenWidth, fenHeight);

		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
        this.setTitle(valeur);
		

        this.addKeyListener((KeyListener)keyEven);

    	this.setContentPane(panneau);
	}
	
	
	
}
	
	

