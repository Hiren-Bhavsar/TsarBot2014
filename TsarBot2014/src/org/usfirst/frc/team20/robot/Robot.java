
package org.usfirst.frc.team20.robot;

import edu.wpi.first.wpilibj.IterativeRobot;


public class Robot extends IterativeRobot {

    public void robotInit() {
    	
    }
    
    public void disabledPeriodic(){
    	ReadJSON read = new ReadJSON();
    	read.reader();
    }

    public void autonomousPeriodic() {
    	
    }

 
    public void teleopPeriodic() {
        
    }
    

    public void testPeriodic() {
    
    }
    
}
