package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSub;

public class ShooterCMD extends Command  {
    private final ShooterSub shooterSub;
    private final boolean intakeBool;
    private final boolean outakeBool;

    public ShooterCMD(ShooterSub shooterSub,boolean intakeBool,
    boolean outakeBool ){
        this.shooterSub = shooterSub;
        this.intakeBool = intakeBool;
        this.outakeBool = outakeBool;

    }
    
    @Override
    public void initialize(){
        System.out.println("shootercmd started!");
    }

    @Override
    public void execute() {
        shooterSub.setShooterSpeed(intakeBool, outakeBool);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Shootercmd ended!");
        shooterSub.setShooterSpeed(false, false); //defaults end to set motors to 0
    }
}
