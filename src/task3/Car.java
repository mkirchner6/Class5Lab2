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
public interface Car extends Vehicle{
    public abstract void move();

    public abstract String getManufacturerId();

    public abstract void setManufacturerId(String manufacturerId);

    public abstract String getOwnerName();

    public abstract void setOwnerName(String ownerName);
}
