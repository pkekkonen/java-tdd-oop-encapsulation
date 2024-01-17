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
}


