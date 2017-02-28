/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Patient {
    private boolean deductible;
    //false Hospital 
    private boolean doctorsOffice;
    private double rate;

    public Patient(boolean deductible, boolean doctorsOffice, double rate) {
        this.deductible = deductible;
        this.doctorsOffice = doctorsOffice;
        this.rate = rate;
    }

    public double Reimburse(){
        if(!deductible)
            return -1;
        if(doctorsOffice)
            return (rate * 1.5);
        else
        return (rate * 1.8);
    }

    public void setDeductible(boolean deductible) {
        this.deductible = deductible;
    }

    public void setDoctorsOffice(boolean doctorsOffice) {
        this.doctorsOffice = doctorsOffice;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
}
