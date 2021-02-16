package com.codecool.pa;

public class Staff {
    private String name;
    private PositionType position;
    private int numberOfDays;

    public Staff(String name, PositionType position, int numberOfDays) {
        this.name = name;
        this.position = position;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public PositionType getPosition() {
        return position;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public enum PositionType{
        WORKER,
        MEDIC,
        MANAGER
    }
}
