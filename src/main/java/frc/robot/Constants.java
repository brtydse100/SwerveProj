// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class ModuleConst {

        public static final int mVel_PORT_NUM1 = 0;
        public static final int mAngle_PORT_NUM1 = 0;
        public static final int CAN_PORT_NUM1 = 0;

        public static final int mVel_PORT_NUM2 = 0;
        public static final int mAngle_PORT_NUM2 = 0;
        public static final int CAN_PORT_NUM2 = 0;

        public static final int mVel_PORT_NUM3 = 0;
        public static final int mAngle_PORT_NUM3 = 0;
        public static final int CAN_PORT_NUM3 = 0;

        public static final int mVel_PORT_NUM4 = 0;
        public static final int mAngle_PORT_NUM4 = 0;
        public static final int CAN_PORT_NUM4 = 0;

        public static final double mVel_Kp = 0;
        public static final double mVel_Ki = 0;
        public static final double mVel_Kd = 0;

        public static final double mAngle_Kp = 0;
        public static final double mAngle_Ki = 0;
        public static final double mAngle_Kd = 0;

        public static final double PPR_FALCON = 2048;
        public static final double WHEEL_PEREMITER = 0;
        public static final double GEAR_RATIO_VEL = 0;
        public static final double PULSE_PER_METER = PPR_FALCON * GEAR_RATIO_VEL / WHEEL_PEREMITER;

        public static final double GEAR_RATIO_ANGLE = 0;
        public static final double PULSE_PER_ANGLE = GEAR_RATIO_ANGLE * PPR_FALCON / 360;

        public static final double Ks = 0;
        public static final double Kv = 0;

    }

    public final class Buttons {
        public static final int joystickxy_PORT_NUM = 0;
        public static final int joystickDirections_PORT_NUM = 0;
        public static final double j_RANGE = 0;

    }

    public final static class ChassiConst {
        public static final int jyro_PORT_NUM = 0;
        public final static Translation2d[] wheelsMeters = new Translation2d[] {};
        public static final double a2r_Kp = 0;
        public static final double a2r_Ki = 0;
        public static final double a2r_Kd = 0;
    }

    
    public final static class kinematics {
        // Locations for the swerve drive modules relative to the robot center.
        public static final double FRONT_RIGHT_LOCATION_X = 0;
        public static final double FRONT_RIGHT_LOCATION_Y = 0;
        
        public static final double FRONT_LEFT_LOCATION_X = 0;
        public static final double FRONT_LEFT_LOCATION_Y = 0;
        
        public static final double BACK_LEFT_LOCATION_X = 0;
        public static final double BACK_LEFT_LOCATION_Y = 0;
        
        public static final double BACK_RIGHT_LOCATION_X = 0;
        public static final double BACK_RIGHT_LOCATION_Y = 0;
        
        // define modules location
        public static final Translation2d FRONT_LEFT_LOCATION = new Translation2d(FRONT_LEFT_LOCATION_X,
        FRONT_LEFT_LOCATION_Y);
        public static final Translation2d BACK_LEFT_LOCATION = new Translation2d(BACK_LEFT_LOCATION_X,
        BACK_LEFT_LOCATION_Y);
        public static final Translation2d FRONT_RIGHT_LOCATION = new Translation2d(FRONT_RIGHT_LOCATION_X,
        FRONT_RIGHT_LOCATION_Y);
        public static final Translation2d BACK_RIGHT_LOCATION = new Translation2d(BACK_RIGHT_LOCATION_X,
        BACK_RIGHT_LOCATION_Y);
        
        public static final SwerveDriveKinematics SWERVE_KINEMATICS = new SwerveDriveKinematics(
            FRONT_LEFT_LOCATION,
            FRONT_RIGHT_LOCATION,
            BACK_LEFT_LOCATION,
            BACK_RIGHT_LOCATION);
        }


    public static final int GYRO_PORT = -1;
        
}
