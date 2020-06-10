/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Driver.*;
import static org.junit.Assert.*;

/**
 *
 * @author Irawansyah
 */
public class viewSignUpTest {
    
    public viewSignUpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showMessage method, of class viewSignUp.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        String message = "";
        String title = "";
        int type = 0;
        viewSignUp instance = new viewSignUp();
        instance.showMessage(message, title, type);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getBLogin method, of class viewSignUp.
     */
    @Test
    public void testGetBLogin() {
        System.out.println("getBLogin");
        viewSignUp instance = new viewSignUp();
        JButton expResult = null;
        JButton result = instance.getBLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getBSignUp method, of class viewSignUp.
     */
    @Test
    public void testGetBSignUp() {
        System.out.println("getBSignUp");
        viewSignUp instance = new viewSignUp();
        JButton expResult = null;
        JButton result = instance.getBSignUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCboxAgree method, of class viewSignUp.
     */
    @Test
    public void testGetCboxAgree() {
        System.out.println("getCboxAgree");
        viewSignUp instance = new viewSignUp();
        JCheckBox expResult = null;
        JCheckBox result = instance.getCboxAgree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTfEmail method, of class viewSignUp.
     */
    @Test
    public void testGetTfEmail() {
        System.out.println("getTfEmail");
        viewSignUp instance = new viewSignUp();
        String expResult = "";
        String result = instance.getTfEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of setTfEmail method, of class viewSignUp.
//     */
//    @Test
//    public void testSetTfEmail() {
//        System.out.println("setTfEmail");
//        String x = "";
//        viewSignUp instance = new viewSignUp();
//        instance.setTfEmail(x);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTfFullName method, of class viewSignUp.
//     */
//    @Test
//    public void testGetTfFullName() {
//        System.out.println("getTfFullName");
//        viewSignUp instance = new viewSignUp();
//        String expResult = "";
//        String result = instance.getTfFullName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTfFullName method, of class viewSignUp.
//     */
//    @Test
//    public void testSetTfFullName() {
//        System.out.println("setTfFullName");
//        String x = "";
//        viewSignUp instance = new viewSignUp();
//        instance.setTfFullName(x);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTfGender method, of class viewSignUp.
     */
    @Test
    public void testGetTfGender() {
        System.out.println("getTfGender");
        viewSignUp instance = new viewSignUp();
        String expResult = "";
        String result = instance.getTfGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of setTfGender method, of class viewSignUp.
//     */
//    @Test
//    public void testSetTfGender() {
//        System.out.println("setTfGender");
//        String x = "";
//        viewSignUp instance = new viewSignUp();
//        instance.setTfGender(x);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getTfPassword method, of class viewSignUp.
     */
    @Test
    public void testGetTfPassword() {
        System.out.println("getTfPassword");
        viewSignUp instance = new viewSignUp();
        String expResult = "";
        String result = instance.getTfPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of setTfPassword method, of class viewSignUp.
//     */
//    @Test
//    public void testSetTfPassword() {
//        System.out.println("setTfPassword");
//        String x = "";
//        viewSignUp instance = new viewSignUp();
//        instance.setTfPassword(x);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of addActionListener method, of class viewSignUp.
     */
    @Test
    public void testAddActionListener() {
        System.out.println("addActionListener");
        ActionListener e = null;
        viewSignUp instance = new viewSignUp();
        instance.addActionListener(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class viewSignUp.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        viewSignUp instance = new viewSignUp();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    public void testMain() throws Exception{
        System.out.println("main");
        String[] args = null;
        Driver.main(args);
    }
    
}
