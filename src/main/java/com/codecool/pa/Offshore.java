package com.codecool.pa;

import java.util.List;

public class Offshore extends Extractor implements Reportable{
    private List<Staff> listOfWorkers;

    public Offshore(int serialNumber, int intendedCapacity, int quantity, List<Staff> listOfWorkers) {
        super(serialNumber, intendedCapacity, quantity);
        this.listOfWorkers = listOfWorkers;
    }

    public List<Staff> getListOfWorkers() {
        return listOfWorkers;
    }

    public void addWorker(Staff worker){
        listOfWorkers.add(worker);
    }

    public boolean reportFault(){
        if(getQuantity() < getIntendedCapacity()*0.7){
            return true;
        } else if(!medicIsPresent()){
            return true;
        } else if(reachedMaximumAmountOfDays()){
            return true;
        }
        return false;
    }

    public boolean medicIsPresent(){
        for(Staff member : listOfWorkers){
            if(member.getPosition().equals(Staff.PositionType.MEDIC)){
                return true;
            }
        }
        return false;
    }

    public boolean reachedMaximumAmountOfDays(){
        for(Staff member : listOfWorkers){
            if(member.getNumberOfDays() > 14){
                return true;
            }
        }
        return false;
    }
}
