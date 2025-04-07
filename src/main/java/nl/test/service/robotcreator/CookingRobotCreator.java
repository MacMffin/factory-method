package nl.test.service.robotcreator;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.model.annotations.Cook;
import nl.test.model.robot.CookingRobot;
import nl.test.model.robot.Robot;

@ApplicationScoped
@Cook
public class CookingRobotCreator extends RobotCreator {

    @Override
    public Robot createRobot() {
        return new CookingRobot();
    }
}
