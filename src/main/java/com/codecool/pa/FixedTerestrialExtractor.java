package com.codecool.pa;

public class FixedTerestrialExtractor extends Extractor{
    private final String location;

    public FixedTerestrialExtractor(int serialNumber, int intendedCapacity, int quantity, String location) {
        super(serialNumber, intendedCapacity, quantity);
        this.location = location;
    }
}
