package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class CatcherPanels {
	Pneumatics pneu = new Pneumatics();

	public void leftPanelBloom() {
		pneu.leftPanel.set(Value.kForward);
	}

	public void leftPanelWilt() {
		pneu.leftPanel.set(Value.kReverse);
	}

	public void rightPanelBloom() {
		pneu.rightPanel.set(Value.kForward);
	}

	public void rightPanelWilt() {
		pneu.rightPanel.set(Value.kReverse);
	}

	public void backPanelBloom() {
		pneu.backPanel.set(Value.kForward);
	}

	public void backPanelWilt() {
		pneu.backPanel.set(Value.kReverse);
	}

}
