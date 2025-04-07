package nl.test.model.robot;

import lombok.extern.slf4j.Slf4j;

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
