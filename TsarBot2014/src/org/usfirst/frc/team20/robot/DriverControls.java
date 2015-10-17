package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DriverControls {

	Joystick driveJoy = new Joystick(0);
	Motors motors = new Motors();
	Pneumatics pneu = new Pneumatics();
	DriveTrain driveTrain = new DriveTrain();

	public void driveControls() {
		double speed = driveJoy.getRawAxis(0);
		double turnValue = driveJoy.getRawAxis(4);

		driveTrain.arcadeDrive(speed, turnValue);

		if (driveJoy.getRawAxis(2) >= .1) {
			driveTrain.lowGear();
		}
		if (driveJoy.getRawAxis(3) >= .1) {
			driveTrain.highGear();
		}
	}
}
