/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author mattkirchner
 */
public abstract class Vehicle {
    private String manufacturerId;
    private String ownerName;
    
    public abstract void move();

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        if(manufacturerId.isEmpty()){
            throw new IllegalArgumentException("This is manditory");
        }
        this.manufacturerId = manufacturerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if(ownerName.isEmpty()){
            throw new IllegalArgumentException("This is manditory");
        }
        this.ownerName = ownerName;
    }
}
