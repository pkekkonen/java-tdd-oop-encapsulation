package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoteControlledCar {
    private String colour;

    public RemoteControlledCar() {

    }

    public boolean setColour(String colour) {
        this.colour = colour;
        return true;
    }

    public String getColour() {
        return colour;
    }
}
