/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.AbstractModel;
import model.AbstractModel;
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
public class AbstractModelTest
{
    
    public AbstractModelTest()
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
     * Test of closeConnection method, of class AbstractModel.
     */
    @Test
    public void testCloseConnection() throws Exception
    {
        System.out.println("closeConnection");
        AbstractModel instance = new AbstractModelImpl();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeInsertUpdateDeleteQuery method, of class AbstractModel.
     */
    @Test
    public void testExecuteInsertUpdateDeleteQuery()
    {
        System.out.println("executeInsertUpdateDeleteQuery");
        String sqlStatement = "";
        AbstractModel instance = new AbstractModelImpl();
        instance.executeInsertUpdateDeleteQuery(sqlStatement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSelectQuery method, of class AbstractModel.
     */
    @Test
    public void testExecuteSelectQuery()
    {
        System.out.println("executeSelectQuery");
        String sqlStatement = "";
        AbstractModel instance = new AbstractModelImpl();
        ResultSet expResult = null;
        ResultSet result = instance.executeSelectQuery(sqlStatement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractModelImpl extends AbstractModel
    {

        @Override
        public void loadRowByPrimaryKey(Object id) throws SQLException
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void loadConnection()
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}