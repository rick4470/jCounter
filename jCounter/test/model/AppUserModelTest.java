/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import model.AppUserModel;
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
public class AppUserModelTest
{
    
    public AppUserModelTest()
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
     * Test of getFirstName method, of class AppUserModel.
     */
    @Test
    public void testGetFirstName()
    {
        System.out.println("getFirstName");
        AppUserModel instance = new AppUserModel();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class AppUserModel.
     */
    @Test
    public void testSetFirstName()
    {
        System.out.println("setFirstName");
        String firstName = "";
        AppUserModel instance = new AppUserModel();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class AppUserModel.
     */
    @Test
    public void testGetUserId()
    {
        System.out.println("getUserId");
        AppUserModel instance = new AppUserModel();
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class AppUserModel.
     */
    @Test
    public void testSetUserId()
    {
        System.out.println("setUserId");
        int userId = 0;
        AppUserModel instance = new AppUserModel();
        instance.setUserId(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class AppUserModel.
     */
    @Test
    public void testGetLastName()
    {
        System.out.println("getLastName");
        AppUserModel instance = new AppUserModel();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class AppUserModel.
     */
    @Test
    public void testSetLastName()
    {
        System.out.println("setLastName");
        String lastName = "";
        AppUserModel instance = new AppUserModel();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class AppUserModel.
     */
    @Test
    public void testGetGender()
    {
        System.out.println("getGender");
        AppUserModel instance = new AppUserModel();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class AppUserModel.
     */
    @Test
    public void testSetGender()
    {
        System.out.println("setGender");
        String gender = "";
        AppUserModel instance = new AppUserModel();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class AppUserModel.
     */
    @Test
    public void testGetDOB()
    {
        System.out.println("getDOB");
        AppUserModel instance = new AppUserModel();
        Date expResult = null;
        Date result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDOB method, of class AppUserModel.
     */
    @Test
    public void testSetDOB()
    {
        System.out.println("setDOB");
        Date DOB = null;
        AppUserModel instance = new AppUserModel();
        instance.setDOB(DOB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class AppUserModel.
     */
    @Test
    public void testGetWeight()
    {
        System.out.println("getWeight");
        AppUserModel instance = new AppUserModel();
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class AppUserModel.
     */
    @Test
    public void testSetWeight()
    {
        System.out.println("setWeight");
        double weight = 0.0;
        AppUserModel instance = new AppUserModel();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class AppUserModel.
     */
    @Test
    public void testGetHeight()
    {
        System.out.println("getHeight");
        AppUserModel instance = new AppUserModel();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class AppUserModel.
     */
    @Test
    public void testSetHeight()
    {
        System.out.println("setHeight");
        double height = 0.0;
        AppUserModel instance = new AppUserModel();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityLevel method, of class AppUserModel.
     */
    @Test
    public void testGetActivityLevel()
    {
        System.out.println("getActivityLevel");
        AppUserModel instance = new AppUserModel();
        int expResult = 0;
        int result = instance.getActivityLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivityLevel method, of class AppUserModel.
     */
    @Test
    public void testSetActivityLevel()
    {
        System.out.println("setActivityLevel");
        int activityLevel = 0;
        AppUserModel instance = new AppUserModel();
        instance.setActivityLevel(activityLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTargetWeight method, of class AppUserModel.
     */
    @Test
    public void testGetTargetWeight()
    {
        System.out.println("getTargetWeight");
        AppUserModel instance = new AppUserModel();
        double expResult = 0.0;
        double result = instance.getTargetWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTargetWeight method, of class AppUserModel.
     */
    @Test
    public void testSetTargetWeight()
    {
        System.out.println("setTargetWeight");
        double targetWeight = 0.0;
        AppUserModel instance = new AppUserModel();
        instance.setTargetWeight(targetWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadRowByLicenseId method, of class AppUserModel.
     */
    @Test
    public void testLoadRowByLicenseId() throws Exception
    {
        System.out.println("loadRowByLicenseId");
        int id = 0;
        AppUserModel instance = new AppUserModel();
        instance.loadRowByLicenseId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadRowByPrimaryKey method, of class AppUserModel.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Integer id = null;
        AppUserModel instance = new AppUserModel();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Save method, of class AppUserModel.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        AppUserModel instance = new AppUserModel();
        instance.Save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicenceID method, of class AppUserModel.
     */
    @Test
    public void testGetLicenceID()
    {
        System.out.println("getLicenceID");
        AppUserModel instance = new AppUserModel();
        int expResult = 0;
        int result = instance.getLicenceID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicenceID method, of class AppUserModel.
     */
    @Test
    public void testSetLicenceID()
    {
        System.out.println("setLicenceID");
        int licenceID = 0;
        AppUserModel instance = new AppUserModel();
        instance.setLicenceID(licenceID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInitialWeight method, of class AppUserModel.
     */
    @Test
    public void testGetInitialWeight()
    {
        System.out.println("getInitialWeight");
        AppUserModel instance = new AppUserModel();
        double expResult = 0.0;
        double result = instance.getInitialWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInitialWeight method, of class AppUserModel.
     */
    @Test
    public void testSetInitialWeight()
    {
        System.out.println("setInitialWeight");
        double initialWeight = 0.0;
        AppUserModel instance = new AppUserModel();
        instance.setInitialWeight(initialWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}