/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.repository;

import com.mycompany.java1.models.Warehouse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class WarehouseRepository {
    private static List<Warehouse> warehouses = new ArrayList<>();
    
    public void addWarehouse(Warehouse warehouse){
        warehouses.add(warehouse);
    }
    public Warehouse getWarehouseById(int warehouseId){
        for(Warehouse warehouse : warehouses){
            if(warehouse.getWarehouseId()==warehouseId){
                return warehouse;
            }
        }
        return null;
    }
    public void updateWarehouse(Warehouse updatedWarehouse){
        for(int i = 0 ; i < warehouses.size();i++){
            if(warehouses.get(i).getWarehouseId() == updatedWarehouse.getWarehouseId()){
                warehouses.set(i, updatedWarehouse);
                break;
            }
        }
    }
    public List<Warehouse> getAllWarehouses(){
        return warehouses;
    }
    public void deleteWarehouse(int warehouseId){
        for(int i = 0 ; i < warehouses.size() ; i++){
            if(warehouseId == warehouses.get(i).getWarehouseId()){
                warehouses.remove(i);
                break;
            }
        }
    }
    
}
