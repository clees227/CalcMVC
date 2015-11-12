package edu.elon.math;

import java.util.ArrayList;

public class CalcModel implements ModelInterface {
  double firstNum;
  ArrayList<Observer> observers;
  String op;
  double secondNum;
  String text;

  public CalcModel() {
    text = "";
    firstNum = 0.0;
    secondNum = 0.0;
    observers = new ArrayList<Observer>();
  }

  @Override
  public void appendText(String num) {
    text = text + num;
    notifyObservers();
  }

  @Override
  public void evaluate() {
    double num = 0.0;
    switch (op) {
      case "+":
        num = firstNum + secondNum;
        break;
      case "-":
        num = firstNum - secondNum;
        break;
      case "/":
        num = firstNum / secondNum;
        break;
      case "*":
        num = firstNum * secondNum;
        break;
      default:
        num = 0;
    }
    firstNum = num;
    text = firstNum + "";
    notifyObservers();
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public void notifyObservers() {
    for (Observer s : observers) {
      s.update();
    }
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void setFirstNum(double num) {
    firstNum = num;
  }

  @Override
  public void setOp(String op) {
    this.op = op;
    text = "";
    notifyObservers();
  }

  @Override
  public void setSecondNum(double num) {
    secondNum = num;
  }
}
