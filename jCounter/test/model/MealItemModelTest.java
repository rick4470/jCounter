/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.List;
import model.MealItemModel;
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
public class MealItemModelTest
{
    
    public MealItemModelTest()
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
     * Test of getItemListByMealId method, of class MealItemModel.
     */
    @Test
    public void testGetItemListByMealId() throws Exception
    {
        System.out.println("getItemListByMealId");
        Integer id = null;
        MealItemModel instance = new MealItemModel();
        List expResult = null;
        List result = instance.getItemListByMealId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadRowByPrimaryKey method, of class MealItemModel.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Integer id = null;
        MealItemModel instance = new MealItemModel();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Save method, of class MealItemModel.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        MealItemModel instance = new MealItemModel();
        instance.Save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class MealItemModel.
     */
    @Test
    public void testGetData()
    {
        System.out.println("getData");
        MealItemModel instance = new MealItemModel();
        ResultSet expResult = null;
        ResultSet result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class MealItemModel.
     */
    @Test
    public void testSetData()
    {
        System.out.println("setData");
        ResultSet data = null;
        MealItemModel instance = new MealItemModel();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealItemID method, of class MealItemModel.
     */
    @Test
    public void testGetMealItemID()
    {
        System.out.println("getMealItemID");
        MealItemModel instance = new MealItemModel();
        int expResult = 0;
        int result = instance.getMealItemID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealItemID method, of class MealItemModel.
     */
    @Test
    public void testSetMealItemID()
    {
        System.out.println("setMealItemID");
        int mealItemID = 0;
        MealItemModel instance = new MealItemModel();
        instance.setMealItemID(mealItemID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealID method, of class MealItemModel.
     */
    @Test
    public void testGetMealID()
    {
        System.out.println("getMealID");
        MealItemModel instance = new MealItemModel();
        int expResult = 0;
        int result = instance.getMealID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealID method, of class MealItemModel.
     */
    @Test
    public void testSetMealID()
    {
        System.out.println("setMealID");
        int mealID = 0;
        MealItemModel instance = new MealItemModel();
        instance.setMealID(mealID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMealItemName method, of class MealItemModel.
     */
    @Test
    public void testGetMealItemName()
    {
        System.out.println("getMealItemName");
        MealItemModel instance = new MealItemModel();
        String expResult = "";
        String result = instance.getMealItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMealItemName method, of class MealItemModel.
     */
    @Test
    public void testSetMealItemName()
    {
        System.out.println("setMealItemName");
        String mealItemName = "";
        MealItemModel instance = new MealItemModel();
        instance.setMealItemName(mealItemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalWeight method, of class MealItemModel.
     */
    @Test
    public void testGetTotalWeight()
    {
        System.out.println("getTotalWeight");
        MealItemModel instance = new MealItemModel();
        double expResult = 0.0;
        double result = instance.getTotalWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalWeight method, of class MealItemModel.
     */
    @Test
    public void testSetTotalWeight()
    {
        System.out.println("setTotalWeight");
        double totalWeight = 0.0;
        MealItemModel instance = new MealItemModel();
        instance.setTotalWeight(totalWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFatWeight method, of class MealItemModel.
     */
    @Test
    public void testGetFatWeight()
    {
        System.out.println("getFatWeight");
        MealItemModel instance = new MealItemModel();
        double expResult = 0.0;
        double result = instance.getFatWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFatWeight method, of class MealItemModel.
     */
    @Test
    public void testSetFatWeight()
    {
        System.out.println("setFatWeight");
        double fatWeight = 0.0;
        MealItemModel instance = new MealItemModel();
        instance.setFatWeight(fatWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarbWeight method, of class MealItemModel.
     */
    @Test
    public void testGetCarbWeight()
    {
        System.out.println("getCarbWeight");
        MealItemModel instance = new MealItemModel();
        double expResult = 0.0;
        double result = instance.getCarbWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarbWeight method, of class MealItemModel.
     */
    @Test
    public void testSetCarbWeight()
    {
        System.out.println("setCarbWeight");
        double carbWeight = 0.0;
        MealItemModel instance = new MealItemModel();
        instance.setCarbWeight(carbWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProteinWeight method, of class MealItemModel.
     */
    @Test
    public void testGetProteinWeight()
    {
        System.out.println("getProteinWeight");
        MealItemModel instance = new MealItemModel();
        double expResult = 0.0;
        double result = instance.getProteinWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProteinWeight method, of class MealItemModel.
     */
    @Test
    public void testSetProteinWeight()
    {
        System.out.println("setProteinWeight");
        double proteinWeight = 0.0;
        MealItemModel instance = new MealItemModel();
        instance.setProteinWeight(proteinWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSodium method, of class MealItemModel.
     */
    @Test
    public void testGetSodium()
    {
        System.out.println("getSodium");
        MealItemModel instance = new MealItemModel();
        double expResult = 0.0;
        double result = instance.getSodium();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSodium method, of class MealItemModel.
     */
    @Test
    public void testSetSodium()
    {
        System.out.println("setSodium");
        double sodium = 0.0;
        MealItemModel instance = new MealItemModel();
        instance.setSodium(sodium);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}