package edu.elon.math;

public class Controller implements ControllerInterface {
  private CalcGui gui;
  private ModelInterface model;

  public Controller(ModelInterface m) {
    model = m;
    gui = new CalcGui(this, model);
    gui.createCalc();
    gui.disableTextBox();
    model.registerObserver(gui);
  }

  @Override
  public void appendText(String num) {
    model.appendText(num);
  }

  @Override
  public void evaluate() {
    model.evaluate();
  }

  @Override
  public String getText() {
    return model.getText();
  }

  @Override
  public void setFirstNum(String num) {
    model.setFirstNum(num);
  }

  @Override
  public void setOp(String op) {
    model.setOp(op);
  }

  @Override
  public void setSecondNum(String num) {
    model.setSecondNum(num);
  }
}
