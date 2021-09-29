package org.launchcode.java.studios.interfaces;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity){
        this.storageCapacity=maxCapacity;
        this.name=aName;
        this.discType=aType;
        capacityUsed = checkCapacity(someUsedCapacity);
        remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten){
        if(storageCapacity < dataWritten){
            return storageCapacity;
        }
        return dataWritten;

    }

    private int spaceLeft(){
        return storageCapacity - capacityUsed;
    }

    public String discInfo(){
        String output = String.format("\nDisc name: %s",name);
        return output;
    }

    public String writeData(int dataSize){
        if(dataSize > remainingCapacity){
            return "Not enough disc space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space "+remainingCapacity;
    }
}
