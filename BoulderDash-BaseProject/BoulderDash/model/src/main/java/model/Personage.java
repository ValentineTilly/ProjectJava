package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Personage extends Object {
	private int largeur, hauteur; 
	private int x, y ; 
	private boolean marche;
	private boolean versDroite;
	private boolean versGauche; 
	public int compteur; 
	
	
	private ImageIcon perso; 
	
	public Image  imgperso;
	
	public Personage(int x, int y) 
	{
		this.x= x; 
		this.y = y; 
		this.compteur = 0 ; 
		this.marche = false;
		this.versDroite = false;
		this.versGauche = false ; 
		
		
		
		perso = new ImageIcon(getClass().getResource("/name/image.png"));
		this.imgperso = this.perso.getImage();
		
		
		
	}
	
	
	public Image getImgMario() 
	{ return imgperso;
	
	}


	private int getLargeur() {
		return largeur;
	}


	private void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	private int getHauteur() {
		return hauteur;
	}


	private void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}


	private int getX() {
		return x;
	}


	private void setX(int x) {
		this.x = x;
	}


	private int getY() {
		return y;
	}


	private void setY(int y) {
		this.y = y;
	}


	private boolean isMarche() {
		return marche;
	}


	private void setMarche(boolean marche) {
		this.marche = marche;
	}


	private boolean isVersDroite() {
		return versDroite;
	}


	private void setVersDroite(boolean versDroite) {
		this.versDroite = versDroite;
	}


	private boolean isVersGauche() {
		return versGauche;
	}


	private void setVersGauche(boolean versGauche) {
		this.versGauche = versGauche;
	}


	private int getCompteur() {
		return compteur;
	}


	private void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	

}
