package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Pneumatics {
	
	public Compressor compress = new Compressor(1);	
	
	public DoubleSolenoid leftPanel = new DoubleSolenoid(2,5,6);
	public DoubleSolenoid rightPanel = new DoubleSolenoid(2,1,2);
	public DoubleSolenoid backPanel = new DoubleSolenoid(2,3,4);
	public DoubleSolenoid collector = new DoubleSolenoid(2,7,8);
	public DoubleSolenoid shifter = new DoubleSolenoid(1,5,6);
	
	
}
