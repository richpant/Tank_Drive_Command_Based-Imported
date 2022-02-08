package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Intake extends SubsystemBase {
    PWMSparkMax intake;
 
    
        public Intake(){
          intake = new PWMSparkMax(Constants.intakeMotorR);
            intake.setInverted(true);

        }


@Override
public void periodic() {
  // This method will be called once per scheduler run
}
public void intakeBall(double speed)
{
  //check the axis in drive station for right trigger 
  intake.set(speed); 
}
public void stop()
{
  intake.set(0);
}

}

