package nl.test.model.robot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GardeningRobot implements Robot {

    @Override
    public void statePurpose() {
        log.info("I'll help you out with your garden.");
    }

    @Override
    public void performAction() {
        log.info("*plants two rows of potatoes*");
    }

}
