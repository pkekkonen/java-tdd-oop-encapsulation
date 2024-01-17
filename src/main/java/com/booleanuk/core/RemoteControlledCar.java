package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoteControlledCar {
    private String colour;
    private int xCoordinate, yCoordinate;
    private String direction;
    private final ArrayList<String> validColours;

    public RemoteControlledCar() {
        colour = "white";
        xCoordinate = 0;
        yCoordinate = 0;
        direction = "n";
        validColours = new ArrayList<>(Arrays.asList("orange","pink", "black", "white"));
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

    public void moveForward(int meters) {
        switch (direction) {
            case "n" -> yCoordinate += meters;
            case "e" -> xCoordinate += meters;
            case "s" -> yCoordinate -= meters;
            case "w" -> xCoordinate -= meters;
        }
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getDirection() {
        return direction;
    }
}
