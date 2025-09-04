package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Hello World", group="Examples")
public class HelloWorldOpMode extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Hello FTC Teams!");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Looping", "Still running...");
            telemetry.update();
        }
    }
}