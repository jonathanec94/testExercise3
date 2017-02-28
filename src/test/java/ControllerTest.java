/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class ControllerTest {

    public ControllerTest() {

    }

    /*@TestFactory
    public Collection<DynamicTest> dynamicTest()
    {
        int[] results = {28,29,30,31};
        int[] months = {2,2,4,1};
        int[] years = {2018,2016,2018,2018};
        
        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        for(int i =0; i< results.length; i++){
            int month = months[i];
            int year = years[i];
            int exResult = results[i];
            int result = controller.getNumDaysinMonth(month, year);
            
         Executable exec = () -> assertEquals(result, year);
            String testName = "Valid Months / leap - non leap" + i;
            DynamicTest dynamicTest = DynamicTest.dynamicTest(testName, exec);
            dynamicTests.add(dynamicTest);
        }
        
        return dynamicTests;
    }*/
    @Test
    public void hello() {
        Patient p = new Patient(true, true, 10);
        Patient p2 = new Patient(true, false, 10);
        Patient p3 = new Patient(false, true, 10);
        Patient p4 = new Patient(false, false, 10);

        assertTrue("p1", p.Reimburse() == 15);
        assertTrue("p2", p2.Reimburse() == 18);
        assertTrue("p3", p3.Reimburse() == -1.0);
        assertTrue("p4", p4.Reimburse() == -1.0);

    }
}
