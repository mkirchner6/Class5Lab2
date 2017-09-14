/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author mattkirchner
 */
public class Car extends Vehicle{
    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if(numberOfWheels < 0){
            throw new IllegalArgumentException("Must have Wheels!!!");
        }
        this.numberOfWheels = numberOfWheels;
    }
    
    public void putInDrive(){
        System.out.println("Car is in drive");
    }
}
