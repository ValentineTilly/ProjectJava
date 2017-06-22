package model;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Diamants extends Objets {

	
	int lx; 
	int ly; 
	int lo; 
	
	
	
	public Diamants(int lx, int ly, int lo ) 
	{
		this.lx = lx; 
		this.ly = ly; 
		this.lo = lo; 

	}
	
	public void RecolteDiamant () {
		if (Personage.getPersox() == lx 
				&& Personage.getPersoy() == ly)
			lo = 1; 
			
					
	}
	
		
	}
	
	
	

