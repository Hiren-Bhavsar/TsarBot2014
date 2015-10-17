package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OperatorControls {

	Joystick opJoy = new Joystick(1);
	CatcherPanels catcher = new CatcherPanels();
	Catapult catapult = new Catapult();
	Collector collect = new Collector();
	boolean left, back, right, all = false;

	public void opControls() {
		if (opJoy.getRawButton(2) || opJoy.getRawButton(3)) {
			collect.rollersStop();
		}
		if (opJoy.getRawButton(4)) {
			collect.rollersBackDrive();
		}
		if (opJoy.getRawButton(1)) {
			collect.rollersIntake();
		}
		if (opJoy.getPOV() == 270) {
			left = !left;
			if (left) {
				catcher.leftPanelBloom();
			} else {
				catcher.leftPanelWilt();
			}
		}
		if (opJoy.getPOV() == 90) {
			right = !right;
			if (right) {
				catcher.rightPanelBloom();
			} else {
				catcher.rightPanelWilt();
			}
		}
		if (opJoy.getPOV() == 180) {
			back = !back;
			if (back) {
				catcher.backPanelBloom();
			} else {
				catcher.backPanelWilt();
			}
		}
		if (opJoy.getPOV() == 0) {
			all = !all;
			if (all) {
				catcher.backPanelBloom();
				catcher.leftPanelBloom();
				catcher.rightPanelBloom();
				back = true;
				left = true;
				right = true;
			} else {
				catcher.backPanelWilt();
				catcher.leftPanelWilt();
				catcher.rightPanelWilt();
				back = false;
				left = false;
				right = false;

			}
		}
		if(opJoy.getRawAxis(3)>=.1){
			collect.collecterDown();
		}
		if(opJoy.getRawButton(6)){
			collect.collecterUp();
		}
		if(opJoy.getRawButton(5) && opJoy.getRawAxis(2) ==0){
			catapult.slowFire();
		}
		if(!opJoy.getRawButton(5) && opJoy.getRawAxis(2) >=.1){
			catapult.slowFire();
		}
		if(opJoy.getRawButton(5) && opJoy.getRawAxis(2) >=.1){
			catapult.fire();
		}
	}
}
