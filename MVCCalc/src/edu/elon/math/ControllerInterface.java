package edu.elon.math;

public interface ControllerInterface {
  void appendText(String num);

  void evaluate();

  String getText();

  void setFirstNum(String num);

  void setOp(String op);

  void setSecondNum(String num);
}
