package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.IntakeConstants;

public class IntakeOutakeSub extends SubsystemBase {
    private CANSparkMax intakeMotor = new CANSparkMax(IntakeConstants.kIntakeMotorID, MotorType.kBrushless);
   
    public void IntakeSub(){
    }

    public void setIntakeSpeed(boolean intakeBool, boolean outakeBool){
        if(intakeBool){
            intakeMotor.set(IntakeConstants.intakeSpeed);
        
        }else if (outakeBool){
            intakeMotor.set(-IntakeConstants.intakeSpeed);

        } else {
            intakeMotor.set(0);
        }


    
}
}