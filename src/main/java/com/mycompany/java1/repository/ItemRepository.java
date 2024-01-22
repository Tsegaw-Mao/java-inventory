/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java1.repository;

import com.mycompany.java1.models.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class ItemRepository {

    private static List<Item> Items = new ArrayList<>();

    public ItemRepository(List<Item> items) {
        this.Items = items;
    }

    public ItemRepository() {
        
    }

    public void addItem(Item item) {
        Items.add(item);
    }

    public Item getItemById(int itemID) {
        for (Item item : Items) {
            if (item.getItemID() == itemID) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(Item updatedItem) {
        for (int i = 0; i < Items.size(); i++) {
            if (updatedItem.getItemID() == Items.get(i).getItemID()) {
                Items.set(i, updatedItem);
                break;
            }
        }
    }

    public List<Item> getAllItems() {
        return Items;
    }

    public void deleteItemById(int ItemID) {
        for (int i = 0; i < Items.size(); i++) {
            if (ItemID == Items.get(i).getItemID()) {
                Items.remove(i);
                break;
            }
        }
    }

}
