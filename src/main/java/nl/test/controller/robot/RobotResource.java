package nl.test.controller.robot;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import nl.test.common.annotations.Cook;
import nl.test.common.annotations.Gardener;
import nl.test.service.helper.Helper;

@Path("/robot")
public class RobotResource {

    @Inject
    @Cook
    Helper cookingHelp;

    @Inject
    @Gardener
    Helper gardeningHelp;

    @Path("/cook")
    @POST
    public void createCookingRobot() {
        cookingHelp.statePurpose();
        cookingHelp.performAction();
    }

    @Path("/gardener")
    @POST
    public void createGardeningRobot() {
        gardeningHelp.performAction();
        gardeningHelp.statePurpose();
    }
}
