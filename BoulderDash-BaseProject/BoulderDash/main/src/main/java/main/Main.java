package main;

import controller.ControllerFacade;
import controller.IController;
import model.IModel;
import model.ModelFacade;
import model.dao.Demojbc;
import view.Fenetre;
import view.IView;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
	
		
		IModel model = new ModelFacade();
		IView view = new ViewFacade(model); 
		IController controller = new ControllerFacade(view, model);
       
        
        view.start();
 
     
        
       
    }

    
    
}
