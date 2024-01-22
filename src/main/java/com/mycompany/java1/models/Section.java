/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.models;

import java.util.List;

/**
 *
 * @author omen
 */
public class Section {

    int sectionID;
    String aisleName;
    int shelfNumber;
    int maxCapacity;
    int currentQuantity;
    List<StorageBin> storageBins;

    public Section(int sectionID, String aisleName, int shelfNumber, int maxCapacity, int currentQuantity, List<StorageBin> storageBins) {
        this.sectionID = sectionID;
        this.aisleName = aisleName;
        this.shelfNumber = shelfNumber;
        this.maxCapacity = maxCapacity;
        this.currentQuantity = currentQuantity;
        this.storageBins = storageBins;
    }

    public Section() {
    }
    
    

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public List<StorageBin> getStorageBins() {
        return storageBins;
    }

    public void setStorageBins(List<StorageBin> storageBins) {
        this.storageBins = storageBins;
    }

}
