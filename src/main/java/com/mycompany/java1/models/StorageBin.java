/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.models;

/**
 *
 * @author omen
 */
public class StorageBin {
    int binID;
    int sectionID;
    int itemID;
    int quantity;
    int maxCapacity;
    
    public int getBinID(){
        return binID;
    }
    public void setBinID(int binID){
        this.binID = binID;
    }
    public int getSectionID(){
        return sectionID;
    }
    public void setSectionID(int sectionID){
        this.sectionID = sectionID;
    }   
    public int getItemID(){
        return itemID;
    }
    public void setItemID(int itemID){
        this.itemID = itemID;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }
}
