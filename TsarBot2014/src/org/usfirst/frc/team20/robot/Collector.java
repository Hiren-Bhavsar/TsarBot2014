package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Collector {
	Pneumatics pneu = new Pneumatics();
	Motors motors = new Motors();
	
	public void collecterDown() {
		pneu.collector.set(Value.kForward);
	}

	public void collecterUp() {
		pneu.collector.set(Value.kReverse);
	}

	public void rollersIntake() {
		motors.collectorTal.set(1);
	}

	public void rollersBackDrive() {
		motors.collectorTal.set(-1);
	}
	
	public void rollersStop(){
		motors.collectorTal.set(0);
	}

}
