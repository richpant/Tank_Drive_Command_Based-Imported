// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
//import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  
  DifferentialDrive drive;
  
  public DriveTrain() {
  PWMSparkMax leftBack = new PWMSparkMax(Constants.leftBack);
  PWMSparkMax leftFront = new PWMSparkMax(Constants.leftFront);
  PWMSparkMax rightBack = new PWMSparkMax(Constants.rightBack);
  PWMSparkMax rightFront = new PWMSparkMax(Constants.rightFront);
  leftBack.setInverted(true); leftFront.setInverted(true); rightBack.setInverted(false); rightFront.setInverted(false);
  /*
all false = drive good, but backwards, y = turning x = forward 
left true, right false = 
  */



  MotorControllerGroup leftMotors = new MotorControllerGroup(leftFront, leftBack);
  MotorControllerGroup rightMotors = new MotorControllerGroup(rightFront, rightBack);
  drive = new DifferentialDrive(leftMotors, rightMotors);
  //AnalogInput rangeFinder = new AnalogInput(Constants.rangeFinder);
  


  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void driveWithJoystick(XboxController controller, double speed){
    drive.arcadeDrive(controller.getRawAxis(Constants.XboxLeftY)*Constants.speed, controller.getRawAxis(Constants.XboxLeftX)*Constants.speed);

  }
  public void driveForward(){
    drive.tankDrive(Constants.speed, Constants.speed);

  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

 /* public boolean driveToDistance(double setPointDistance, double speed){
    while(rangeFinder.getAverageVoltage() > setPointDistance){
      driveForward();
    }
  }

*/
  public void stop(){
    drive.stopMotor();
  }
}
