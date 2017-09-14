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
public class ChevyImpala extends Vehicle{
    private String dealership;
    private String license;

    public String getDealership() {
        return dealership;
    }

    public void setDealership(String dealership) {
        if(dealership.isEmpty()){
            throw new IllegalArgumentException("Must be entered");
        }
        this.dealership = dealership;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        if(license.isEmpty()){
            throw new IllegalArgumentException("Must be entered");
        }
        this.license = license;
    }
    
    
}
