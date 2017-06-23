package model;


public class ModelFacade implements IModel {

	
	
	/**
	 * Instantiates a new model facade.
	 */
	private Map map;

	public ModelFacade() {

		this.setMap(new Map());

	}

	public Map getMap() {
		return map;
	}

	private void setMap(Map map) {
		this.map = map;
	}

}
