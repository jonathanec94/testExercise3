
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Controller {
    Patient p;
      public Controller() {
        p = new Patient(true,true, 100.00);
    }

    public int getNumDaysinMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1) {
            return -1;
        } else {
            LocalDate ld = LocalDate.of(month, year, 1);
            return ld.lengthOfMonth();
        }
    }
    
    public double Reimburse(){
       return p.Reimburse();
    }
}
