package nl.test.service.robotcreator;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.model.annotations.Gardener;
import nl.test.model.robot.GardeningRobot;
import nl.test.model.robot.Robot;

@ApplicationScoped
@Gardener
public class GardeningRobotCreator extends RobotCreator {

    @Override
    public Robot createRobot() {
        return new GardeningRobot();
    }
}
