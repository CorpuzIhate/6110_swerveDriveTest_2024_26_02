package frc.robot.subsystems;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.LimeLightConsants;
import frc.robot.Constants.ShooterConstants;

public class ShooterSub extends SubsystemBase {
   private CANSparkMax upperShooterMotor = new CANSparkMax(ShooterConstants.kUpperShooterMotorID, MotorType.kBrushless);

    private CANSparkMax lowerShooterMotor = new CANSparkMax(ShooterConstants.kLowerShooterPort,MotorType.kBrushless);
    public void shooterSub(){
        

    }
    public void setShooterSpeed(boolean intakeBool, boolean outakeBool){
        if(intakeBool){
            upperShooterMotor.set(IntakeConstants.intakeSpeed);
            lowerShooterMotor.set(ShooterConstants.shooterSpeed);
        
        }else if (outakeBool){
            upperShooterMotor.set(IntakeConstants.intakeSpeed);
            lowerShooterMotor.set(ShooterConstants.shooterSpeed);

        } else {
            upperShooterMotor.set(IntakeConstants.intakeSpeed);
            lowerShooterMotor.set(ShooterConstants.shooterSpeed);
        }
    }
}
