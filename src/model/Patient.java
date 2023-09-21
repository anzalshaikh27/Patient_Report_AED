/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anzal
 */
public class Patient {
    
    private String patient_id;
    private String primary_doctor;
    private String last_visit;
    private String next_appointment;
    private String allergies;
    private String onMedication;
    private String insuranceCoverage;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPrimary_doctor() {
        return primary_doctor;
    }

    public void setPrimary_doctor(String primary_doctor) {
        this.primary_doctor = primary_doctor;
    }

    public String getLast_visit() {
        return last_visit;
    }

    public void setLast_visit(String last_visit) {
        this.last_visit = last_visit;
    }

    public String getNext_appointment() {
        return next_appointment;
    }

    public void setNext_appointment(String next_appointment) {
        this.next_appointment = next_appointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

   public String getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(String insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }
    
}
