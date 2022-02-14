package com.company;

import java.util.Arrays;

public class Warehouse {
    private int capacity;
    private String name;
    private int placesTaken = 0;
    private Box[] warehouseBoxes;

    public Warehouse(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.warehouseBoxes = new Box[this.capacity];
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public void addBox(Box box) {
        int counter = placesTaken + 1;
        if (counter < capacity) {
            warehouseBoxes[placesTaken] = box;
            placesTaken++;
        } else if (counter == capacity) {
            warehouseBoxes[placesTaken] = box;
            placesTaken++;
            System.out.println("\nThe warehouse " + getName() + " is full now, last box is: " + box.getName() + "\n");
        } else {
            System.out.println("Impossible to add " + box.getName() + ", no place left in " + getName());
        }
    }

    @Override
    public String toString(){
        String str = "";
        System.out.println("\n" + getName() + " contents:");
        for(int i = 0; i < warehouseBoxes.length; i++){
           str += warehouseBoxes[i].toString() + "\n";
        }
        return str;
    }
}
