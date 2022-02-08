/*
package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class DriveToDistance extends CommandBase {
    DriveTrain drivetrain;
    private boolean finish = false;
    public DriveToDistance(DriveTrain dt){
        drivetrain = dt;
        addRequirements(drivetrain);
    }
@Override
public void initialize(){
    finish = drivetrain.driveToDistance(Constants.drivePoint, Constants.AutoSpeed);
}
@Override
public void execute(){}

@Override
public void end(boolean interrupted){
    drivetrain.stop;
}

@Override
public boolean isFinished(){
    return finish;
}

}
*/