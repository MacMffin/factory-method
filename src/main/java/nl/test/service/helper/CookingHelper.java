package nl.test.service.helper;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.common.annotations.Cook;
import nl.test.model.robot.CookingRobot;
import nl.test.model.robot.Robot;

@ApplicationScoped
@Cook
public class CookingHelper extends Helper {

    @Override
    public Robot createRobot() {
        return new CookingRobot();
    }
}
