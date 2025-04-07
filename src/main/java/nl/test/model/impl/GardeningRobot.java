package nl.test.model.impl;

import lombok.extern.slf4j.Slf4j;
import nl.test.model.interfaces.Robot;

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
