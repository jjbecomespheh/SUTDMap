package com.example.sutdmap;

import android.net.wifi.ScanResult;

public class WAPData implements Comparable<WAPData>{
    private int wapStrength;
    private String wapAddress;
    private String wapName;

    public WAPData(ScanResult s) {
        //ScanResult is from android.net.wifi.ScanResult
        wapStrength = s.level;
        wapAddress = s.BSSID;
        wapName = s.SSID;
    }

    public WAPData(int wapStrength, String wapAddress, String wapName) {
        this.wapStrength = wapStrength;
        this.wapAddress = wapAddress;
        this.wapName = wapName;
    }

    @Override
    public boolean equals(Object o){
        return wapAddress.equals(((WAPData)o).wapAddress);
    }

    @Override
    public int compareTo(WAPData o) {
        return getwapAddress().compareTo(
                o.getwapAddress());
    }

    public int getwapStrength() {
        return wapStrength;
    }

    public String getwapAddress() {
        return wapAddress;
    }

    public String getwapName() {
        return wapName;
    }

    @Override
    public String toString(){
        return wapName + ":" + wapStrength + " -- ";
    }
}
