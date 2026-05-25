package org.firstinspires.ftc.teamcode.src.main.java.org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import com.qualcomm.robotcore.hardware.ColorSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
@TeleOp()
public class C10_ColorSensorOpMode extends OpMode {
    private PB_ColorSensor colorSensor = null;
    @Overide
    public void loop() {
        telemetry.addData("Red", colorSensor.getRed());
        telemetry.addData("Green", colorSensor.getGreen());
        telemetry.addData("Blue", colorSensor.getBlue());
        telemetry.update();
    }
    @Overide
    public void init() {
        colorSensor.init(hardwareMap);
    }
}
class PB_ColorSensor {
    private ColorSensor colorSensor = null;
    public void init(HardwareMap hwMap ) {
        colorSensor = hwMap.get(ColorSensor.class, "Sensor");
    }
    public double getRed(){
        return colorSensor.red();
    }
    public double getGreen(){
        return colorSensor.green();
    }
    public double getBlue(){
        return colorSensor.blue();
    }
}
