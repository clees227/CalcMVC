package edu.elon.math;

import javax.swing.JOptionPane;

public class Controller implements ControllerInterface {
  private CalcGui gui;
  private ModelInterface model;

  public Controller(ModelInterface m) {
    model = m;
    gui = new CalcGui(this);
    gui.createCalc();
    gui.disableTextBox();
    model.registerObserver(gui);
  }

  @Override
  public void appendText(String num) {
    if ((num.equals(".") && model.getText().indexOf(".") == -1)
            || !num.equals(".")) {
      model.appendText(num);
    } else {
      JOptionPane.showMessageDialog(gui, "You can't add another decimal",
              "Decimal Error", JOptionPane.ERROR_MESSAGE);
    }
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
    model.setFirstNum(Double.parseDouble(num));
  }

  @Override
  public void setOp(String op) {
    model.setOp(op);
  }

  @Override
  public void setSecondNum(String num) {
    model.setSecondNum(Double.parseDouble(num));
  }
}
