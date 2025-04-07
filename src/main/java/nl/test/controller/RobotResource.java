package nl.test.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import nl.test.model.annotations.Cook;
import nl.test.model.annotations.Gardener;
import nl.test.model.robot.Robot;
import nl.test.service.robotcreator.RobotCreator;

@Path("/robot")
public class RobotResource {

    @Inject
    @Cook
    RobotCreator cookingCreator;

    @Inject
    @Gardener
    RobotCreator gardenerCreator;

    @Path("/cook")
    @POST
    public void createCookingRobot() {
        Robot robot = cookingCreator.createRobot();
        robot.statePurpose();
        robot.performAction();
    }

    @Path("/gardener")
    @POST
    public void createGardeningRobot() {
        Robot robot = gardenerCreator.createRobot();
        robot.statePurpose();
        robot.performAction();
    }
}
