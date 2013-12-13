/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.AuthenticationModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JS
 */
public class AuthenticationModelTest
{
    
    public AuthenticationModelTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of loadRowByPrimaryKey method, of class AuthenticationModel.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Integer id = null;
        AuthenticationModel instance = new AuthenticationModel();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class AuthenticationModel.
     */
    @Test
    public void testGetID()
    {
        System.out.println("getID");
        AuthenticationModel instance = new AuthenticationModel();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserByLicense method, of class AuthenticationModel.
     */
    @Test
    public void testFindUserByLicense() throws Exception
    {
        System.out.println("findUserByLicense");
        String key = "";
        AuthenticationModel instance = new AuthenticationModel();
        boolean expResult = false;
        boolean result = instance.findUserByLicense(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLicenseNumber method, of class AuthenticationModel.
     */
    @Test
    public void testFindLicenseNumber() throws Exception
    {
        System.out.println("findLicenseNumber");
        String key = "";
        AuthenticationModel instance = new AuthenticationModel();
        boolean expResult = false;
        boolean result = instance.findLicenseNumber(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicenseNumber method, of class AuthenticationModel.
     */
    @Test
    public void testSetLicenseNumber()
    {
        System.out.println("setLicenseNumber");
        String licenseNumber = "";
        AuthenticationModel instance = new AuthenticationModel();
        instance.setLicenseNumber(licenseNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenseID method, of class AuthenticationModel.
     */
    @Test
    public void testGetLicenseID()
    {
        System.out.println("getLicenseID");
        AuthenticationModel instance = new AuthenticationModel();
        int expResult = 0;
        int result = instance.getLicenseID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenseNumber method, of class AuthenticationModel.
     */
    @Test
    public void testGetLicenseNumber()
    {
        System.out.println("getLicenseNumber");
        AuthenticationModel instance = new AuthenticationModel();
        String expResult = "";
        String result = instance.getLicenseNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersID method, of class AuthenticationModel.
     */
    @Test
    public void testGetUsersID()
    {
        System.out.println("getUsersID");
        AuthenticationModel instance = new AuthenticationModel();
        int expResult = 0;
        int result = instance.getUsersID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}