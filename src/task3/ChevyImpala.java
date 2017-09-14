/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author mattkirchner
 */
public class ChevyImpala implements Car{
    private String manufacturerId;
    private String ownerName;

    @Override
    public void move() {
        System.out.println("Vehicle has moved");
    }

    @Override
    public String getManufacturerId() {
        return manufacturerId;
    }

    @Override
    public void setManufacturerId(String manufacturerId) {
        if(manufacturerId.isEmpty()){
            throw new IllegalArgumentException("This is manditory");
        }
        this.manufacturerId = manufacturerId;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        if(ownerName.isEmpty()){
            throw new IllegalArgumentException("This is manditory");
        }
        this.ownerName = ownerName;
    }
    
}
