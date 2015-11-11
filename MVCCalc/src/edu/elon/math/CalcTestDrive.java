package edu.elon.math;

public class CalcTestDrive {

	public static void main(String[] args) {
		ModelInterface model = new CalcModel();
		ControllerInterface controller = new Controller(model);
	}

}
