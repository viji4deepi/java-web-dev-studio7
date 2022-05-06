package org.launchcode.studio7;

public class CD implements OpticalDisc{


    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
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
