package org.launchcode.java.studios.interfaces;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType,someUsedCapacity);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("This is a DVD dummy");

    }
}
