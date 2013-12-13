/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import model.MealModel;
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
public class MealModelTest
{
    
    public MealModelTest()
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
     * Test of loadRowByPrimaryKey method, of class MealModel.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Integer id = null;
        MealModel instance = new MealModel();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Save method, of class MealModel.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        MealModel instance = new MealModel();
        instance.Save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class MealModel.
     */
    @Test
    public void testGetData()
    {
        System.out.println("getData");
        MealModel instance = new MealModel();
        ResultSet expResult = null;
        ResultSet result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class MealModel.
     */
    @Test
    public void testSetData()
    {
        System.out.println("setData");
        ResultSet data = null;
        MealModel instance = new MealModel();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealID method, of class MealModel.
     */
    @Test
    public void testGetMealID()
    {
        System.out.println("getMealID");
        MealModel instance = new MealModel();
        int expResult = 0;
        int result = instance.getMealID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealID method, of class MealModel.
     */
    @Test
    public void testSetMealID()
    {
        System.out.println("setMealID");
        int mealID = 0;
        MealModel instance = new MealModel();
        instance.setMealID(mealID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealDate method, of class MealModel.
     */
    @Test
    public void testGetMealDate()
    {
        System.out.println("getMealDate");
        MealModel instance = new MealModel();
        Date expResult = null;
        Date result = instance.getMealDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealDate method, of class MealModel.
     */
    @Test
    public void testSetMealDate()
    {
        System.out.println("setMealDate");
        Date mealDate = null;
        MealModel instance = new MealModel();
        instance.setMealDate(mealDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealName method, of class MealModel.
     */
    @Test
    public void testGetMealName()
    {
        System.out.println("getMealName");
        MealModel instance = new MealModel();
        String expResult = "";
        String result = instance.getMealName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealName method, of class MealModel.
     */
    @Test
    public void testSetMealName()
    {
        System.out.println("setMealName");
        String mealName = "";
        MealModel instance = new MealModel();
        instance.setMealName(mealName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekDayID method, of class MealModel.
     */
    @Test
    public void testGetWeekDayID()
    {
        System.out.println("getWeekDayID");
        MealModel instance = new MealModel();
        int expResult = 0;
        int result = instance.getWeekDayID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeekDayID method, of class MealModel.
     */
    @Test
    public void testSetWeekDayID()
    {
        System.out.println("setWeekDayID");
        int weekDayID = 0;
        MealModel instance = new MealModel();
        instance.setWeekDayID(weekDayID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}