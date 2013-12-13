/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;
import model.WeekdayModel;
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
public class WeekdayModelTest
{
    
    public WeekdayModelTest()
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
     * Test of loadRowByPrimaryKey method, of class WeekdayModel.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Object id = null;
        WeekdayModel instance = new WeekdayModel();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastSevenIdsByUserId method, of class WeekdayModel.
     */
    @Test
    public void testGetLastSevenIdsByUserId() throws Exception
    {
        System.out.println("getLastSevenIdsByUserId");
        Integer userId = null;
        WeekdayModel instance = new WeekdayModel();
        List expResult = null;
        List result = instance.getLastSevenIdsByUserId(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Save method, of class WeekdayModel.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        WeekdayModel instance = new WeekdayModel();
        instance.Save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class WeekdayModel.
     */
    @Test
    public void testGetData()
    {
        System.out.println("getData");
        WeekdayModel instance = new WeekdayModel();
        ResultSet expResult = null;
        ResultSet result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class WeekdayModel.
     */
    @Test
    public void testSetData()
    {
        System.out.println("setData");
        ResultSet data = null;
        WeekdayModel instance = new WeekdayModel();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekDayId method, of class WeekdayModel.
     */
    @Test
    public void testGetWeekDayId()
    {
        System.out.println("getWeekDayId");
        WeekdayModel instance = new WeekdayModel();
        int expResult = 0;
        int result = instance.getWeekDayId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeekDayId method, of class WeekdayModel.
     */
    @Test
    public void testSetWeekDayId()
    {
        System.out.println("setWeekDayId");
        int weekDayId = 0;
        WeekdayModel instance = new WeekdayModel();
        instance.setWeekDayId(weekDayId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class WeekdayModel.
     */
    @Test
    public void testGetDateCreated()
    {
        System.out.println("getDateCreated");
        WeekdayModel instance = new WeekdayModel();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class WeekdayModel.
     */
    @Test
    public void testSetDateCreated()
    {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        WeekdayModel instance = new WeekdayModel();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppUserId method, of class WeekdayModel.
     */
    @Test
    public void testGetAppUserId()
    {
        System.out.println("getAppUserId");
        WeekdayModel instance = new WeekdayModel();
        int expResult = 0;
        int result = instance.getAppUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppUserId method, of class WeekdayModel.
     */
    @Test
    public void testSetAppUserId()
    {
        System.out.println("setAppUserId");
        int appUserId = 0;
        WeekdayModel instance = new WeekdayModel();
        instance.setAppUserId(appUserId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}