package nl.test.service.helper;

import nl.test.model.robot.Robot;

public abstract class Helper {

    public abstract Robot createRobot();

    public void performAction() {
        Robot robot = createRobot();
        robot.performAction();
    }

    public void statePurpose() {
        Robot robot = createRobot();
        robot.statePurpose();
    }
}
