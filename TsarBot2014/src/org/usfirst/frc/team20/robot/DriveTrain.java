package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class DriveTrain {

	Pneumatics pneu = new Pneumatics();
	Motors motors = new Motors();
	
	public void arcadeDrive(double speed, double turnValue){
		double leftEquation = speed + turnValue;
		double rightEquation = speed - turnValue;
		
		motors.backLeft.set(-leftEquation);//5
		motors.midLeft.set(leftEquation);//4
		motors.frontLeft.set(-leftEquation);//6
		
		motors.backRight.set(rightEquation);//3
		motors.midRight.set(rightEquation);//2
		motors.frontRight.set(-rightEquation);//1
		
	}
	 public void highGear(){
	        pneu.shifter.set(DoubleSolenoid.Value.kReverse);
	    }

	 public void lowGear(){
	        pneu.shifter.set(DoubleSolenoid.Value.kForward);
	    }
}
