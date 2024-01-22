/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.services;

import com.mycompany.java1.models.*;
import com.mycompany.java1.repository.WarehouseRepository;
import com.mycompany.java1.repository.ItemRepository;
import com.mycompany.java1.repository.SectionRepository;
import com.mycompany.java1.repository.StorageBinRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class InventoryServices {

    private WarehouseRepository warehouseRepository;
    private ItemRepository itemRepository;
    private StorageBinRepository storageBinRepository;
    private SectionRepository sectionRepository;

    public InventoryServices() {
        this.warehouseRepository = new WarehouseRepository();
        //this.itemRepository = new ItemRepository();
        //this.storageBinRepository = new StorageBinRepository();
        this.sectionRepository = new SectionRepository();
        
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouseRepository.addWarehouse(warehouse);
    }

    public Warehouse getWarehouseById(int warehouseID) {
        return warehouseRepository.getWarehouseById(warehouseID);
    }

    public void updateWarehouse(Warehouse updatedWarehouse) {
        warehouseRepository.updateWarehouse(updatedWarehouse);
    }

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.getAllWarehouses();
    }

    public void addSection(Section section, Warehouse warehouse) {
        
        this.sectionRepository = new SectionRepository();
        this.sectionRepository = new SectionRepository(warehouse.getSections());
        this.sectionRepository.addSection(section);
        warehouse.setSections(this.sectionRepository.getAllSections());
        this.updateWarehouse(warehouse);
    }

    public Section getSectionById(int sectionID, Warehouse warehouse) {
        SectionRepository sr = new SectionRepository(warehouse.getSections());
        return sr.getSectionById(sectionID);
    }

    public void updateSection(Warehouse warehouse, Section section) {
        SectionRepository sr = new SectionRepository(warehouse.getSections());
        sr.updateSection(section);
    }

    public List<Section> getAllSections(Warehouse warehouse) {
        SectionRepository sr = new SectionRepository(warehouse.getSections());
        return sr.getAllSections();
    }

    public void addStorageBin(Section section, StorageBin storageBin) {
        StorageBinRepository sb = new StorageBinRepository(section.getStorageBins());
        sb.addStorageBin(storageBin);
        section.setStorageBins(sb.getAllStorageBins());
        this.updateSection(warehouseRepository.getWarehouseById(section.getShelfNumber()), section);
    }

    public StorageBin getStorageBinById(int storageBinID, Section section) {
        StorageBinRepository sb = new StorageBinRepository(section.getStorageBins());
        return sb.getStorageBinById(storageBinID);
    }

    public void updateStorageBin(Section section, StorageBin storageBin) {
        StorageBinRepository sb = new StorageBinRepository(section.getStorageBins());
        sb.updateStorageBin(storageBin);
    }

    public List<StorageBin> getAllStorageBins(Section section) {
        StorageBinRepository sb = new StorageBinRepository(section.getStorageBins());
        return sb.getAllStorageBins();
    }

    public void addItem(Item item, StorageBin storageBin) {
        ItemRepository i = new ItemRepository(storageBin.getItems());
        i.addItem(item);
        storageBin.setItems(i.getAllItems());
        this.updateStorageBin(sectionRepository.getSectionById(storageBin.getSectionID()), storageBin);
    }

    public Item getItemById(int itemID, StorageBin storageBin) {
        ItemRepository i = new ItemRepository(storageBin.getItems());
        return i.getItemById(itemID);
    }

    public void updateItemBin(Item item, StorageBin storageBin) {
        ItemRepository i = new ItemRepository(storageBin.getItems());
        i.updateItem(item);
    }

    public List<Item> getAllItems(StorageBin storageBin) {
        ItemRepository i = new ItemRepository(storageBin.getItems());
        return i.getAllItems();
    }
    
    public void deleteWarehouseById(int id){
        warehouseRepository.deleteWarehouseById(id);
    }
    
    public void deleteSectionById(int sectionid, Warehouse warehouse){
        this.sectionRepository = new SectionRepository(warehouse.getSections());
        sectionRepository.deleteSectionById(sectionid);
        warehouse.setSections(sectionRepository.getAllSections());
        this.updateWarehouse(warehouse);
    }

}
