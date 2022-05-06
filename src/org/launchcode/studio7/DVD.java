package org.launchcode.studio7;

public class DVD implements OpticalDisc {


    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeDate(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
