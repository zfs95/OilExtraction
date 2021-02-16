package com.codecool.pa;

public class MobileTerestrialExtractor extends Extractor implements Reportable{
    private String location;

    public MobileTerestrialExtractor(int serialNumber, int intendedCapacity, int quantity, String location) {
        super(serialNumber, intendedCapacity, quantity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean reportFault(){
        return getQuantity() < getIntendedCapacity()/4;
    }
}
