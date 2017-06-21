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
	public static int fenHeight = 400; 
	
	
	public static int seconde; 
	


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
	
	
	
	
	
	
	
	

	
	
	public void timer() {
		   while (this.getSeconde() < 60) {
				   try { 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			  this.setSeconde(getSeconde() + 1); 
			  System.out.println(this.getSeconde());
	
		   }
				this.dispose(); 
	}




	public int getSeconde() {
		return seconde;
	}


	public void setSeconde(int seconde) {
		this.seconde = seconde;
	}
	
	

	
}
	
	

