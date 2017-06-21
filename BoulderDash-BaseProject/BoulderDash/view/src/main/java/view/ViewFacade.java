package view;

import model.IModel;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     * 
     * 
     * 
     * 
     */
	
	private IModel model;
	
	public ViewFacade(IModel model) {
		this.model = model;
	}
	
	public void start() {
	Fenetre fenetre = new Fenetre("BoulderDash", this.model);
    
	//scene = new Scene();
	//fenetre.setContentPane(scene);

	fenetre.setVisible(true); 
	fenetre.timer(); 

	}
}
