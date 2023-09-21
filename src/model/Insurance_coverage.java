/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anzal
 */
public class Insurance_coverage {
    
    private String corporate_id;
    private String insurance_addr;
    private String premium;
    private String deductable;
    private String benefits;

    public String getCorporate_id() {
        return corporate_id;
    }

    public void setCorporate_id(String corporate_id) {
        this.corporate_id = corporate_id;
    }

    public String getInsurance_addr() {
        return insurance_addr;
    }

    public void setInsurance_addr(String insurance_addr) {
        this.insurance_addr = insurance_addr;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getDeductable() {
        return deductable;
    }

    public void setDeductable(String deductable) {
        this.deductable = deductable;
    }
    
    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    
}
