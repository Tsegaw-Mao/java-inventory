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
public class Warehouse {
    private int warehouseID;
    private String location;
    private int capacity;
    private int currentQuantity;
    private List<Section> sections; //(Association with Section class)
    
    public int getWarehouseId(){
        return warehouseID;
    }
    public void setWarehouseId(int warehouseID){
        this.warehouseID = warehouseID;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCurrentQuantity(){
        return currentQuantity;
    }
    public void setCurrentQuantity(int currentQuantity){
        this.currentQuantity = currentQuantity;
    }
    public List<Section> getSections(){
        return sections;
    }
    public void setSections(List<Section> sections){
        this.sections = sections;
    }
}
