package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseDisc {
    //variables
    private String discData;
    //    private HashMap<String, String> discInfo;
    private boolean isInserted;

    private final int storageCapacityInMB;
    private final int spinSpeedInRpm;
    private final String name;
    private String contents;
    private String discType;

    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRpm = spinSpeed;
        this.discData = "";
//        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;
        this.name = "";
//        this.discInfo.put("Storage Capacity", String.valueOf((storageCapacity)));
//        this.discInfo.put("Spin Speed" , String.valueOf((spinSpeed)));
        this.discType = "";
    }

    public void writeData(String data) {
        this.discData += data;

    }

    public String r