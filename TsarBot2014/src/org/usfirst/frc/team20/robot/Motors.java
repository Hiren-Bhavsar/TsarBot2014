package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.Talon;

public class Motors {

	// Drive Train Talons
	public Talon frontLeft = new Talon(6);
	public Talon frontRight = new Talon(1);
	public Talon backLeft = new Talon(5);
	public Talon backRight = new Talon(2);
	public Talon midLeft = new Talon(4);
	public Talon midRight = new Talon(3);

	// Collector Talon
	public Talon collectorTal = new Talon(9);

	//  Talon
	public Talon winchTal = new Talon(7);
	public Talon winchTal2 = new Talon(8);
}
