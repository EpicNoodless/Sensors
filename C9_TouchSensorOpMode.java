package org.firstinspires.ftc.teamcode.src.main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp()
public class C9_TouchSensorOpMode extends OpMode {
    PB_TouchSensor myFirstbBoard = new PB_TouchSensor();

    @Overide
    public void loop() {
        String x = "?";
        if (myFirstbBoard.isTouchSensorPressed()) {
            x = "Pressed";
        }
        if (myFirstbBoard.isTouchSensorReleased()) {
            x = "Released";
        }
        telemetry.addData("touchSensor statue", x);

    }
    @Overide
    public void init() {
        myFirstbBoard.init(hardwareMap);
    }
}

class PB_TouchSensor {
    private DigitalChannel touchSensor;

    public void init (HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touchSensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }
    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }
    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

}
