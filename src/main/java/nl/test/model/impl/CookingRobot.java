package nl.test.model.impl;

import lombok.extern.slf4j.Slf4j;
import nl.test.model.interfaces.Robot;

@Slf4j
public class CookingRobot implements Robot {

    @Override
    public void statePurpose() {
        log.info("I can help you with cooking delicious meals.");
    }

    @Override
    public void performAction() {
        log.info("*grabs a pan and starts frying eggs*");
    }

}
