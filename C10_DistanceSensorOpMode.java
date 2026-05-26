package org.firstinspires.ftc.teamcode.src.main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
@TeleOp
public class C10_DistanceSensorOpmode extends OpMode{
    private PB_DistanceSensor distanceSensor = new PB_DistanceSensor();
    @Overide
    public void loop() {
        telemetry.addData("Distance", distanceSensor.getDistance(DistanceUnit.CM));
        telemetry.update();
    }
    @Overide
    public void init() {
        distanceSensor.init(hardwareMap);
    }
}

class PB_DistanceSensor{
    private DistanceSensor distanceSensor;
    public void init(HardwareMap hwMap) {
        distanceSensor = hwMap.get(DistanceSensor.class, "Sensor");
    }

    public double getDistance(DistanceUnit distanceUnit) {
        return distanceSensor.getDistance(distanceUnit);
    }
}

