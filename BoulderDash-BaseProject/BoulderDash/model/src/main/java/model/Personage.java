package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Personage extends Object {
	private int largeur, hauteur; 
	private static int persox = 224; 
	private static int persoy = 224; 
	
	private boolean marche;
	private boolean versDroite;
	private boolean versGauche; 
	public int compteur; 
	
	
	private ImageIcon perso; 
	
	public Image  imgperso;
	
	public Personage() 
	{
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
	
	public static int getPersox() {
		return persox;
	}


	public static void setPersox(int persox) {
		Personage.persox = persox;
	}


	public static int getPersoy() {
		return persoy;
	}


	public static void setPersoy(int persoy) {
		Personage.persoy = persoy;
	}


}
