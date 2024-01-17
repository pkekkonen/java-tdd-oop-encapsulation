package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    @Test
    public void setValidColourTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertNotEquals("pink", car.getColour());
        Assertions.assertTrue(car.setColour("pink"));
        Assertions.assertEquals("pink", car.getColour());
    }

    @Test
    public void setInvalidColourTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertNotEquals("blue", car.getColour());
        Assertions.assertFalse(car.setColour("blue"));
        Assertions.assertNotEquals("blue", car.getColour());
    }

    @Test
    public void moveForwardTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        int meters = 100;
        int preXCoord = car.getXCoordinate();
        int preYCoord = car.getYCoordinate();
        int postXCoord = preXCoord;
        int postYCoord = preYCoord;
        String direction = car.getDirection();
        switch (direction) {
            case "n" -> postYCoord += meters;
            case "e" -> postXCoord += meters;
            case "s" -> postYCoord -= meters;
            case "w" -> postXCoord -= meters;
        }

        car.moveForward(meters);

        Assertions.assertEquals(postXCoord, car.getXCoordinate());
        Assertions.assertEquals(postYCoord, car.getYCoordinate());
    }
}


