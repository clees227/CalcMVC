package edu.elon.math;

public interface ModelInterface {

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

  void appendText(String num);

  void evaluate();

  String getText();

  void setFirstNum(String num);

  void setOp(String op);

  void setSecondNum(String num);

}
