package org.launchcode.java.studios.interfaces;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Hybrid Theory", 700, "CD_R",650);
        DVD dvd = new DVD("Dumb and Dumber", 4500, "DVD", 4000);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8));

        System.out.println(cd.discInfo());
        System.out.println(dvd.discInfo());

    }
}
