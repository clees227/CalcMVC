package edu.elon.math;

public interface ModelInterface{

	void setFirstNum(String num);

	void setOp(String op);

	void setSecondNum(String num);

	void evaluate();

	void clearText();
	
	String getText();

	void appendText(String num);
	
	/**
	   * Notifies all of the observers that are listening to the function.
	   */
	  public void notifyObservers();

	  /**
	   * Adds the observer to this listeners of this function
	   * 
	   * @param o observer to add
	   */
	  public void registerObserver(Observer o);

	  /**
	   * Removes the observer from listening to this function
	   * 
	   * @param o observer to remove
	   */
	  public void removeObserver(Observer o);

}
