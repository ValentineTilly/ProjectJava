package model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Diamants extends Objets {

	
	private ImageIcon icoDiamants;

	private Image imgDiamants;
	
	
	
	
	public Diamants(int x, int y ) 
	{
		
		
		icoDiamants = new ImageIcon(getClass().getResource("/image/pierre.jpg"));
		this.imgDiamants = this.icoDiamants.getImage();
		
		
		
		
	}
	
	
	
	
	
}
