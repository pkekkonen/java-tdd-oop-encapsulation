package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoteControlledCar {
    private String colour;
    private final ArrayList<String> validColours;

    public RemoteControlledCar() {
        colour = "white";
        validColours = new ArrayList<>(Arrays.asList("orange","pink", "black"));
    }

    public boolean setColour(String colour) {
        if(!validColours.contains(colour)) {
            return false;
        }
        this.colour = colour;
        return true;
    }

    public String getColour() {
        return colour;
    }
}
