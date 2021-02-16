package com.codecool.pa;

public abstract class Extractor {
    private int serialNumber;
    private int intendedCapacity;
    private int quantity;

    public Extractor(int serialNumber, int intendedCapacity, int quantity) {
        this.serialNumber = serialNumber;
        this.intendedCapacity = intendedCapacity;
        this.quantity = quantity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getIntendedCapacity() {
        return intendedCapacity;
    }

    public int getQuantity() {
        return quantity;
    }
}
