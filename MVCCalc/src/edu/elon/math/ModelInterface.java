package edu.elon.math;

public interface ModelInterface {

  public void notifyObservers();

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  void appendText(String num);

  void evaluate();

  String getText();

  void setFirstNum(double num);

  void setOp(String op);

  void setSecondNum(double num);

}
