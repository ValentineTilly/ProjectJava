package model;

import java.awt.Image;

public abstract class Objets  {

	
protected float xo ; 

protected float yo ; 


protected boolean  pull;

protected boolean fall;



	
	
	
public Objets()

{
	
	
	
	
	
}





/* (non-Javadoc)
 * @see model.IObjet#getXo()
 */

public float getXo() {
	return xo;
}






/* (non-Javadoc)
 * @see model.IObjet#setXo(float)
 */

public void setXo(float xo) {
	this.xo = xo;
}






/* (non-Javadoc)
 * @see model.IObjet#getYo()
 */

public float getYo() {
	return yo;
}






/* (non-Javadoc)
 * @see model.IObjet#setYo(float)
 */

public void setYo(float yo) {
	this.yo = yo;
}






/* (non-Javadoc)
 * @see model.IObjet#isPull()
 */

public boolean isPull() {
	return pull;
}






/* (non-Javadoc)
 * @see model.IObjet#setPull(boolean)
 */

public void setPull(boolean pull) {
	this.pull = pull;
}


/* (non-Javadoc)
 * @see model.IObjet#getImgPierre()
 */




/* (non-Javadoc)
 * @see model.IObjet#isFall()
 */

public boolean isFall() {
	return fall;
}






/* (non-Javadoc)
 * @see model.IObjet#setFall(boolean)
 */

public void setFall(boolean fall) {
	this.fall = fall;
}
	
	
}
