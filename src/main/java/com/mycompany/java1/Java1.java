/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java1;

import com.mycompany.java1.models.*;
import java.util.List;
import java.util.Scanner;
import com.mycompany.java1.services.InventoryServices;
import java.util.ArrayList;

/**
 *
 * @author omen
 */
public class Java1 {

    public static Scanner inp = new Scanner(System.in);
    public static InventoryServices is = new InventoryServices();
    public static Section section = new Section();

    public static int warehouseID, capacity, currentQuantity; //warehouse variables
    public static String location; //warehouse variable
    public static List<Section> sections;  //warehouse vatiable

    public static int sectionID, maxCapacity, currentOccupancy, inWarehouseID; //section variables
    public static String aisleName; //section variable
    public static List<StorageBin> storageBins; //section variables

    public static int binID, inSectionID, maxCapacitys; //storagebin variables
    public static List<Item> items; //storagebin variable

    public static int itemID, quantity, inStorageBinID; //item variables
    public static String name, description; //item variables
    public static double price; // itemvvariable

    public static void addWarehouse() {

        Warehouse warehouse = new Warehouse();

        System.out.println(" ---------------    Warehouse Creation Site     --------------------------- ");
        System.out.println("|                                                                          |");
        System.out.print("|---------------         Warehouse Id        : ");
        warehouseID = inp.nextInt();
        warehouse.setWarehouseId(warehouseID);
        inp.nextLine();
        System.out.print("|---------------         Warehouse Location  : ");
        location = inp.nextLine();
        warehouse.setLocation(location);
        System.out.print("|---------------         Warehouse Capacity  : ");
        capacity = inp.nextInt();
        warehouse.setCapacity(capacity);
        System.out.print("|---------------         Warehouse Occupancy : ");
        currentQuantity = inp.nextInt();
        warehouse.setCurrentQuantity(currentQuantity);
        inp.nextLine();
//        Warehouse warehouse = new Warehouse(warehouseID,location,capacity,currentQuantity,sections);
        is.addWarehouse(warehouse);

    }

    private static void addSection() {

        System.out.println(" ---------------     Section Creation Site      --------------------------- ");
        System.out.println("|                                                                          |");
        System.out.print("|---------------         Section Id           :        ");
        sectionID = inp.nextInt();
        section.setSectionID(sectionID);
        inp.nextLine();

        System.out.print("|---------------         Aisle Name           :        ");
        aisleName = inp.nextLine();
        section.setAisleName(aisleName);

        System.out.print("|---------------         Maximum Capacity     :  ");
        maxCapacity = inp.nextInt();
        section.setMaxCapacity(maxCapacity);

        System.out.print("|---------------         Current occupancy    : ");
        currentOccupancy = inp.nextInt();
        section.setCurrentQuantity(currentQuantity);

        System.out.print("|---------------         Warehouse Id         :      ");
        inWarehouseID = inp.nextInt();
        section.setShelfNumber(inWarehouseID);
        
        is.addSection(section, is.getWarehouseById(inWarehouseID));

    }

    private static void addStorageBin() {
        //binid, insectionid, maxcapacitys,
//        
//        StorageBin sb = new StorageBin();
//
//        System.out.println(" ---------------     StorageBin Creation Site      --------------------------- ");
//        System.out.println("|                                                                          |");
//        System.out.print("|---------------         Bin Id           :        ");
//        binID = inp.nextInt();
//        sb.setBinID(binID);
//        
//        System.out.print("|---------------         Section ID           :        ");
//        inSectionID = inp.nextInt();
//        sb.setSectionID(inSectionID);
//        
//        System.out.print("|---------------         Maximum Capacity     :  ");
//        maxCapacitys = inp.nextInt();
//        sb.setMaxCapacity(maxCapacity);
//        
//        is.addStorageBin(is.getSectionById(inSectionID, ), sb);
//        
    }

    private static void addItem() {
        System.out.println(" ---------------    New Item Inserting Site     --------------------------- ");
        System.out.println("|                                                                          |");
        System.out.print("|---------------         Item Id     :      ");
        itemID = inp.nextInt();
        inp.nextLine();
        System.out.print("|---------------         Item Name   :      ");
        name = inp.nextLine();
        System.out.print("|---------------         Description :      ");
        description = inp.nextLine();
        System.out.print("|---------------         Quantity    :      ");
        quantity = inp.nextInt();
        System.out.print("|---------------         Section Id  :      ");
        inSectionID = inp.nextInt();
        System.out.print("|---------------         Price       :      ");
        price = inp.nextDouble();
    }

    private static void displayAllWarehouse() {

        List<Warehouse> warehouses = new ArrayList<>();
        List<Integer> sectionsid = new ArrayList<>();
        int a = 5, b = 13, c = 5, d = 8, z = 10;
        String w_s = null;

        System.out.println("                                   Warehouse Site");
        System.out.println("");
        System.out.println(" --------------------------------------------------------------- ----------------------------- ");
        System.out.println("|    ID    |           Location           | Capacity |  Sections ID List  | Current Occupancy  |");
        System.out.println(" --------------------------------------------------------------- ----------------------------- ");

        warehouses = is.getAllWarehouses();
//        int i = 0;
        for (int i = 0; i < warehouses.size(); i++) {

            System.out.print("|");

            if (String.valueOf(warehouses.get(i).getWarehouseId()) != null) {
                for (int q = 0; q < 5 - (String.valueOf(warehouses.get(i).getWarehouseId()).length() / 2); q++) {
                    System.out.print(" ");
                }
                System.out.print(warehouses.get(i).getWarehouseId());
                for (int q = 0; q < 4 - (String.valueOf(warehouses.get(i).getWarehouseId()).length() / 2); q++) {
                    System.out.print(" ");
                }
                if (String.valueOf(warehouses.get(i).getWarehouseId()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("    " + warehouses.get(i).getWarehouseId() + "     |");
            }
            if (warehouses.get(i).getLocation() != null) {
                for (int q = 0; q < 15 - (warehouses.get(i).getLocation().length() / 2); q++) {
                    System.out.print(" ");
                }
                System.out.print(warehouses.get(i).getLocation());
                for (int q = 0; q < 14 - (warehouses.get(i).getLocation().length() / 2); q++) {
                    System.out.print(" ");
                }
                if (warehouses.get(i).getLocation().length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("    " + warehouses.get(i).getLocation() + "     |");
            }
            if (String.valueOf(warehouses.get(i).getCapacity()) != null) {
                for (int q = 0; q < 5 - (String.valueOf(warehouses.get(i).getCapacity()).length() / 2); q++) {
                    System.out.print(" ");
                }
                System.out.print(warehouses.get(i).getCapacity());
                for (int q = 0; q < 4 - (String.valueOf(warehouses.get(i).getCapacity()).length() / 2); q++) {
                    System.out.print(" ");
                }
                if (String.valueOf(warehouses.get(i).getCapacity()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("    " + warehouses.get(i).getCapacity() + "     |");
            }
            if (warehouses.get(i).getSections() != null) {
                for (int q = 0; q < 10 - (String.valueOf(warehouses.get(i).getSections()).length() / 2); q++) {
                    System.out.print(" ");
                }
                for (int o = 0; o < warehouses.get(i).getSections().size(); o++) {
                    sectionsid.add(warehouses.get(i).getSections().get(o).getSectionID());
                }
                System.out.print(sectionsid);
                for (int q = 0; q < 10 - (String.valueOf(warehouses.get(i).getSections()).length() / 2); q++) {
                    System.out.print(" ");
                }
                if (String.valueOf(warehouses.get(i).getSections()).length() % 2 != 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("        " + warehouses.get(i).getSections() + "        |");
            }
            if (String.valueOf(warehouses.get(i).getCurrentQuantity()) != null) {
                for (int q = 0; q < 10 - (String.valueOf(warehouses.get(i).getCurrentQuantity()).length() / 2); q++) {
                    System.out.print(" ");
                }
                System.out.print(warehouses.get(i).getCurrentQuantity());
                for (int q = 0; q < 9 - (String.valueOf(warehouses.get(i).getCurrentQuantity()).length() / 2); q++) {
                    System.out.print(" ");
                }
                if (String.valueOf(warehouses.get(i).getCurrentQuantity()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("    " + warehouses.get(i).getCurrentQuantity() + "    |");
            }
            System.out.println("");
            System.out.println(" --------------------------------------------------------------- ----------------------------- ");
        }
    }

    private static void displayAllSections(int id) {
        InventoryServices is = new InventoryServices();
        List<Section> sections = new ArrayList<>();
        sections = is.getWarehouseById(id).getSections();

        System.out.println("                     Section view Site");
        System.out.println("");
        System.out.println(" ---------------------------------------------------------------------------------------------------------- ");
        System.out.println("|    ID    |    Aisle Name    |  Maximum Capacity  |  Current Occupancy | Warehouse ID |   StorageBin List  |");
        System.out.println(" ---------------------------------------------------------------------------------------------------------- ");

        for (Section section : sections) {
            System.out.print("|");

            if (String.valueOf(section.getSectionID()) != null) {
                for (int r = 0; r < 5 - String.valueOf(section.getSectionID()).length() / 2; r++) {
                    System.out.print(" ");
                }
                System.out.print(section.getSectionID());
                for (int r = 0; r < 4 - String.valueOf(section.getSectionID()).length() / 2; r++) {
                    System.out.print(" ");
                }
                if (String.valueOf(section.getSectionID()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.println("    " + section.getSectionID() + "    |");
            }
            if (section.getAisleName() != null) {
                for (int r = 0; r < 9 - section.getAisleName().length() / 2; r++) {
                    System.out.print(" ");
                }
                System.out.print(section.getAisleName());
                for (int r = 0; r < 8 - section.getAisleName().length() / 2; r++) {
                    System.out.print(" ");
                }
                if (section.getAisleName().length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.println("    " + section.getAisleName() + "    |");
            }
            if (String.valueOf(section.getMaxCapacity()) != null) {
                for (int r = 0; r < 10 - String.valueOf(section.getMaxCapacity()).length() / 2; r++) {
                    System.out.print(" ");
                }
                System.out.print(section.getMaxCapacity());
                for (int r = 0; r < 9 - String.valueOf(section.getMaxCapacity()).length() / 2; r++) {
                    System.out.print(" ");
                }
                if (String.valueOf(section.getMaxCapacity()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.println("    " + section.getMaxCapacity() + "    |");
            }
            if (String.valueOf(section.getCurrentQuantity()) != null) {
                for (int r = 0; r < 10 - String.valueOf(section.getCurrentQuantity()).length() / 2; r++) {
                    System.out.print(" ");
                }
                System.out.print(section.getCurrentQuantity());
                for (int r = 0; r < 9 - String.valueOf(section.getCurrentQuantity()).length() / 2; r++) {
                    System.out.print(" ");
                }
                if (String.valueOf(section.getCurrentQuantity()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.println("    " + section.getCurrentQuantity() + "    |");
            }
            if (String.valueOf(section.getShelfNumber()) != null) {
                for (int r = 0; r < 7 - String.valueOf(section.getShelfNumber()).length() / 2; r++) {
                    System.out.print(" ");
                }
                System.out.print(section.getShelfNumber());
                for (int r = 0; r < 6 - String.valueOf(section.getShelfNumber()).length() / 2; r++) {
                    System.out.print(" ");
                }
                if (String.valueOf(section.getShelfNumber()).length() % 2 == 0) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.println("    " + section.getShelfNumber() + "    |");
            }
            if (String.valueOf(section.getStorageBins()) != null) {
                System.out.println("        " + section.getStorageBins() + "        |");
            }
        }
    }

    private static void displayAllItem() {
        int j = 5, k = 13, l = 13, m = 5, n = 6, o = 5;
        String i_i_i = "" + itemID;
        String i_q = "" + quantity;
        String i_s_i = "" + inSectionID;
        String i_p = "" + price;

        if (i_i_i != null) {
            j = (10 - i_i_i.length()) / 2;
        }
        if (name != null) {
            k = (30 - name.length()) / 2;
        }
        if (description != null) {
            l = (30 - description.length()) / 2;
        }
        if (i_q != null) {
            m = (10 - i_q.length()) / 2;
        }
        if (i_s_i != null) {
            n = (12 - i_s_i.length()) / 2;
        }
        if (i_p != null) {
            o = (10 - i_p.length()) / 2;
        }

        System.out.println("                     Item Site");
        System.out.println("");
        System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
        System.out.println("|    ID    |             Name             |         Description          | Quantity | In Section |  Price   |");
        System.out.println(" ----------------------------------------------------------------------------------------------------------- ");
        System.out.print("|");

        //item id section
        for (int i = 0; i < j; i++) {
            System.out.print(" ");
        }
        System.out.print(i_i_i);
        for (int i = 0; i < j; i++) {
            System.out.print(" ");
        }
        //end of item id section
        if (i_i_i != null && i_i_i.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("|");
        //item name section
        for (int i = 0; i < k; i++) {
            System.out.print(" ");
        }
        System.out.print(name);
        for (int i = 0; i < k; i++) {
            System.out.print(" ");
        }
        //end of item name section
        if (name != null && name.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("|");

        //description section
        for (int i = 0; i < l; i++) {
            System.out.print(" ");
        }
        System.out.print(description);
        for (int i = 0; i < l; i++) {
            System.out.print(" ");
        }
        //end of description section
        if (description != null && description.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("|");

        // quality section
        for (int i = 0; i < m; i++) {
            System.out.print(" ");
        }
        System.out.print(i_q);
        for (int i = 0; i < m; i++) {
            System.out.print(" ");
        }
        //end of quality section
        if (i_q != null && i_q.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("|");

        // section id section
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.print(i_s_i);
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        //end of section id section
        if (i_s_i != null && i_s_i.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("|");

        // price section
        for (int i = 0; i < o; i++) {
            System.out.print(" ");
        }
        System.out.print(i_p);
        for (int i = 0; i < o; i++) {
            System.out.print(" ");
        }
        //end of price section
        if (i_p != null && i_p.length() % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.println(" ----------------------------------------------------------------------------------------------------------- ");

    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" -----------------------     Inverntory System     -------------------------- ");
            System.out.println("|                                                                            |");
            System.out.println("|-----------------------         MAIN MENU         --------------------------|");
            System.out.println("|                                                                            |");
            System.out.println("|-----------------------   WAREHOUSE PAGE   [1]    --------------------------|");
            System.out.println("|-----------------------   SECTION PAGE     [2]    --------------------------|");
            System.out.println("|-----------------------   STORAGE BIN      [3]    --------------------------|");
            System.out.println("|-----------------------   ITEM PAGE        [4]    --------------------------|");
            System.out.println("|-----------------------   EXIT    [Any Letter]    --------------------------|");

            for (int i = 0; i < 4; i++) {
                System.out.println("");
            }

            int menu;
            if (in.hasNextInt()) {
                menu = in.nextInt();
                switcher(menu);
            } else {
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
                break;
            }
        }
    }

    public static void switcher(int casee) {
        switch (casee) {
            case 1:
                warehouseMenu();
                break;
            case 2:
                sectionMenu();
                break;
            case 3:
                storageBinMenu();
            case 4:
                itemMenu();
                break;
            default:
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
        }
    }

    private static void warehouseMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" -----------------------            WAREHOUSE MENU                   -------------------------- ");
            System.out.println("|                                                                                              |");
            System.out.println("|-----------------------   CREATE NEW WAREHOUSE                [1]   --------------------------|");
            System.out.println("|-----------------------   DELETE WAREHOUSE BY ID              [2]   --------------------------|");
            System.out.println("|-----------------------   UPDATE WAREHOUSE ATTRIBUTES         [3]   --------------------------|");
            System.out.println("|-----------------------   SEARCH WAREHOUSE BY ID              [4]   --------------------------|");
            System.out.println("|-----------------------   SHOW ALL EXISTING WAREHOUSES        [5]   --------------------------|");
            System.out.println("|-----------------------   PRESS ANY LETTER TO GO TO MANI MENU [Ltr] --------------------------|");

            for (int i = 0; i < 4; i++) {
                System.out.println("");
            }

            int menu;
            if (in.hasNextInt()) {
                menu = in.nextInt();
                warehouseSwitcher(menu);
            } else {
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
                break;
            }

        }
    }

    private static void sectionMenu() {
        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(" -----------------------            WAREHOUSE MENU                   -------------------------- ");
            System.out.println("|                                                                                              |");
            System.out.println("|-----------------------   CREATE NEW SECTION                  [1]   --------------------------|");
            System.out.println("|-----------------------   DELETE SECTION BY ID                [2]   --------------------------|");
            System.out.println("|-----------------------   UPDATE SECTION ATTRIBUTES           [3]   --------------------------|");
            System.out.println("|-----------------------   SEARCH SECTION BY ID                [4]   --------------------------|");
            System.out.println("|-----------------------   SHOW ALL EXISTING SECTIONS          [5]   --------------------------|");
            System.out.println("|-----------------------   PRESS ANY LETTER TO GO TO MANI MENU [Ltr] --------------------------|");

            for (int i = 0; i < 4; i++) {
                System.out.println("");
            }

            int menu;
            if (inp.hasNextInt()) {
                menu = inp.nextInt();
                sectionSwitcher(menu);
            } else {
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
                break;
            }

        }
    }

    private static void storageBinMenu() {

    }

    private static void itemMenu() {

    }

    private static void warehouseSwitcher(int menu) {

        switch (menu) {
            case 1:
                addWarehouse();
                System.out.println("Sussessful Entery");
                System.out.println("");
                System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                inp.nextLine();
                break;
            case 2:
                System.out.println("Enter the ID of the Warehouse to be Deleted:");
                if (inp.hasNextInt()) {
                    is.deleteWarehouseById(inp.nextInt());

                    System.out.println("Warehouse Deleted Sussessfully");
                } else {
                    System.out.println("ID number is numerical not Words");
                }

                System.out.println("");
                System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                inp.nextLine();
                inp.nextLine();

                break;
            case 3:
                updateWarehouse();
                System.out.println("Warehouse Deleted Sussessfully");
                System.out.println("");
                System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                inp.nextLine();
                break;
            case 4:
                System.out.println("Enter the ID of the Warehouse to be Searched:");
                if (inp.hasNextInt()) {
                    Warehouse result = is.getWarehouseById(inp.nextInt());
                    if (result == null) {
                        System.out.println("Warehouse Doesnot Exit by this ID");
                        System.out.println("");
                        System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                        inp.nextLine();
                        inp.nextLine();
                        break;
                    } else {
                        System.out.println("Result Warehouse ID                : " + result.getWarehouseId());
                        System.out.println("Result Warehouse Location          : " + result.getLocation());
                        System.out.println("Result Warehouse Capacity          : " + result.getCapacity());
                        System.out.println("Result Warehouse Current Occupancy : " + result.getCurrentQuantity());
                        System.out.println("Result Warehouse Sections List     : " + result.getSections());
                        System.out.println("");
                        System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                        inp.nextLine();
                        inp.nextLine();
                    }
                } else {
                    System.out.println("ID number is numerical not Words");
                    System.out.println("");
                    System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                    inp.nextLine();
                    inp.nextLine();
                    break;
                }
                break;
            case 5:

                displayAllWarehouse();

                System.out.println("");
                System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                inp.nextLine();
                break;
            default:
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
        }

    }

    private static void updateWarehouse() {

        Warehouse warehouse = new Warehouse();

        System.out.println(" ---------------    Warehouse Update Site     --------------------------- ");
        System.out.println("|                                                                          |");
        System.out.print("|---------------         Warehouse Id       : ");
        warehouseID = inp.nextInt();
        warehouse.setWarehouseId(warehouseID);
        inp.nextLine();
        System.out.print("|---------------         Warehouse Location : ");
        location = inp.nextLine();
        warehouse.setLocation(location);
        System.out.print("|---------------         Warehouse Capacity : ");
        capacity = inp.nextInt();
        System.out.print("|---------------         Warehouse Sections : ");
        currentQuantity = inp.nextInt();
        warehouse.setCurrentQuantity(currentQuantity);
        inp.nextLine();
//        Warehouse warehouse = new Warehouse(warehouseID,location,capacity,currentQuantity,sections);
        is.updateWarehouse(warehouse);
    }

    private static void sectionSwitcher(int menu) {

        switch (menu) {
            case 1:
                addSection();
                System.out.println("Sussessful Entery");
                System.out.println("");
                System.out.println("     Press Enter to Go Back To Section Menu       ");
                inp.nextLine();
                break;
            case 2:
                System.out.println("Enter the ID of the Section to be Deleted:");
                if (inp.hasNextInt()) {
                    int sid = inp.nextInt();
                    System.out.println("Enter the ID of Warehouse the Section is found in : ");
                    if (inp.hasNextInt()) {
                        int wint = inp.nextInt();
                        is.deleteSectionById(sid, is.getWarehouseById(wint));
                    }
                    System.out.println("Section Deleted Sussessfully");
                } else {
                    System.out.println("ID number is numerical not Words");
                }

                System.out.println("");
                System.out.println("     Press Enter to Go Back To Section Menu       ");
                inp.nextLine();
                inp.nextLine();

                break;

            case 3:
                updateSection();

                System.out.println("");
                System.out.println("     Press Enter to Go Back To Warehouse Menu       ");
                inp.nextLine();
                break;
            case 4:
                System.out.println("Enter the ID of the Section to be Searched:");
                if (inp.hasNextInt()) {
                    int sid = inp.nextInt();
                    System.out.println("Enter the ID of the Warehouse the Section is found in");
                    if (inp.hasNextInt()) {
                        int wid = inp.nextInt();
                        Section result = is.getSectionById(sid, is.getWarehouseById(wid));
                        if (result == null) {
                            System.out.println("Section Doesnot Exist by this ID");
                            System.out.println("");
                            System.out.println("     Press Enter to Go Back To Sections Menu       ");
                            inp.nextLine();
                            inp.nextLine();
                            break;
                        } else {
                            System.out.println("Result Section ID                  : " + result.getSectionID());
                            System.out.println("Result Section Aisle Name          : " + result.getAisleName());
                            System.out.println("Result Section Maximum Capacity    : " + result.getMaxCapacity());
                            System.out.println("Result Section Current Occupancy   : " + result.getCurrentQuantity());
                            System.out.println("Result Section Warehouse ID        : " + result.getShelfNumber());
                            System.out.println("Result Section StoragBins List     : " + result.getStorageBins());
                            System.out.println("");
                            System.out.println("     Press Enter to Go Back To Sections Menu       ");
                            inp.nextLine();
                            inp.nextLine();
                        }
                    }
                } else {
                    System.out.println("ID number is numerical not Words");
                    System.out.println("");
                    System.out.println("     Press Enter to Go Back To Sections Menu       ");
                    inp.nextLine();
                    inp.nextLine();
                    break;
                }
                break;
            case 5:
                System.out.println("Enter The Id of Warehouse You Want to List Sections of");
                if (inp.hasNextInt()) {
                    displayAllSections(inp.nextInt());
                }

                System.out.println("");
                System.out.println("     Press Enter to Go Back To Sections Menu       ");
                inp.nextLine();
                break;
            default:
                System.out.println("!!!!!!Enter Your Choice From Menu Numbers!!!!!");
        }

    }

    private static void updateSection() {
        System.out.println(" ---------------     Section Update Site      --------------------------- ");
        System.out.println("|                                                                          |");
        System.out.print("|---------------         Section Id           :        ");
        sectionID = inp.nextInt();
        section.setSectionID(sectionID);
        inp.nextLine();

        System.out.print("|---------------         Aisle Name           :        ");
        aisleName = inp.nextLine();
        section.setAisleName(aisleName);

        System.out.print("|---------------         Maximum Capacity     :  ");
        maxCapacity = inp.nextInt();
        section.setMaxCapacity(maxCapacity);

        System.out.print("|---------------         Current occupancy    : ");
        currentOccupancy = inp.nextInt();
        section.setCurrentQuantity(currentQuantity);

        System.out.print("|---------------         Warehouse Id         :      ");
        inWarehouseID = inp.nextInt();
        section.setShelfNumber(sectionID);
        is.updateSection(is.getWarehouseById(warehouseID), section);

    }

}
