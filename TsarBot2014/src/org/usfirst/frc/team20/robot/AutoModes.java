package org.usfirst.frc.team20.robot;

public class AutoModes {
	Pneumatics pneu = new Pneumatics();
	Sensors sense = new Sensors();
	Catapult catapult = new Catapult();
	CatcherPanels catcher = new CatcherPanels();
	Collector collect = new Collector();
	DriveTrain drive = new DriveTrain();
	ReadJSON rjson = new ReadJSON();

	int counter = 0;

	public void oneBallHigh() {
		int driveEncVal = rjson.travelEncVal;
		while (counter < 240) {
			counter++;
			if (counter < 40) {
				collect.collecterDown();
				catcher.backPanelBloom();
				drive.arcadeDrive(0, 0);
			} else if (counter < 170 && counter > 39) {
				if (sense.leftMidEnc.get() > driveEncVal) {
					drive.arcadeDrive(1, 0);
				}else{
					drive.arcadeDrive(0, 0);
				}
			} else if (counter > 170) {
				drive.arcadeDrive(0, 0);
//				catapult.fire();
				collect.collecterUp();
			}

		}
		if(counter>240){
			drive.arcadeDrive(0, 0);
		}
	}
}
