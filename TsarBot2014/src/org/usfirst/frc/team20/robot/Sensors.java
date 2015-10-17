package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

public class Sensors {

	public Gyro gyro = new Gyro(0);

	// Encoders
	public Encoder leftMidEnc = new Encoder(10, 11);
	public Encoder rightMidEnc = new Encoder(13, 14);

	// Switches
	DigitalInput catapultSwitch = new DigitalInput(2);
}
