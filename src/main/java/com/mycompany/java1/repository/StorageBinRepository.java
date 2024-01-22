/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.repository;

import com.mycompany.java1.models.StorageBin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class StorageBinRepository {

    public static List<StorageBin> StorageBins = new ArrayList<>();

    public StorageBinRepository(List<StorageBin> storageBins) {
        this.StorageBins = storageBins;
    }

    public StorageBinRepository() {
       
    }

    public void addStorageBin(StorageBin storageBin) {
        StorageBins.add(storageBin);
    }

    public StorageBin getStorageBinById(int storageBinID) {
        for (int i = 0; i < StorageBins.size(); i++) {
            if (storageBinID == StorageBins.get(i).getBinID()) {
                return StorageBins.get(i);
            }
        }
        return null;
    }

    public void updateStorageBin(StorageBin storageBin) {
        for (int i = 0; i < StorageBins.size(); i++) {
            if (storageBin.getBinID() == StorageBins.get(i).getBinID()) {
                StorageBins.set(i, storageBin);
                break;
            }
        }
    }

    public List<StorageBin> getAllStorageBins() {
        return StorageBins;
    }

    public void deleteStorageBinById(int storageBinID) {
        for (int i = 0; i < StorageBins.size(); i++) {
            if (storageBinID == StorageBins.get(i).getBinID()) {
                StorageBins.remove(i);
                break;
            }
        }
    }

}
