/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Model;
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
public class ModelTest
{
    
    public ModelTest()
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
     * Test of loadRowByPrimaryKey method, of class Model.
     */
    @Test
    public void testLoadRowByPrimaryKey() throws Exception
    {
        System.out.println("loadRowByPrimaryKey");
        Object id = null;
        Model instance = new Model();
        instance.loadRowByPrimaryKey(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadConnection method, of class Model.
     */
    @Test
    public void testLoadConnection()
    {
        System.out.println("loadConnection");
        Model instance = new Model();
        instance.loadConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}