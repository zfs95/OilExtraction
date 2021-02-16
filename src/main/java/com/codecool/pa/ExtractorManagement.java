package com.codecool.pa;

import java.util.List;
import java.util.stream.Collectors;

public class ExtractorManagement {
    private List<Extractor> extractorList;

    public ExtractorManagement(List<Extractor> extractorList) {
        this.extractorList = extractorList;
    }

    public List<Extractor> getExtractorList() {
        return extractorList;
    }

    public void addExtractor(Extractor extractor){
        extractorList.add(extractor);
    }

    public int countNumberOfDevicesWithFault(){
        int numberOfDevices = 0;
        for(Extractor extractor : extractorList){
            if(extractor instanceof Reportable){
                if(((Reportable) extractor).reportFault()){
                    numberOfDevices++;
                }
            }
        }
        return numberOfDevices;
    }

    public List<Extractor> getDevicesWithAlmoastFullCapacity(){
        return extractorList.stream()
                .filter(singleExtractor -> singleExtractor.getQuantity() >= singleExtractor.getIntendedCapacity()*0.95)
                .collect(Collectors.toList());
    }
}
