/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.List;
import java.sql.SQLException;
import library.*;
import model.*;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vlad
 */
public class FactoryTests
{

    @Before
    public void setupObject()
    {
//do nothing for now
    }

    /**
     * Test of addNewUser method, of class NewUserController.
     */
    @Test
    public void testAuthFactory() throws SQLException
    {
        AuthenticationHelper auth = AuthenticationFactory.CreateInstance();

        assertNotNull(auth);

        int test = auth.getLicenseID();

        assertEquals("authid on empty", 0, test);

        auth = AuthenticationFactory.CreateInstance(2);

        assertNotNull(auth);

        test = auth.getLicenseID();

        assertEquals("authid on loaded", 2, test);

        Boolean hasLicense = auth.findLicenseID("apple");

        assertEquals("LicNumber", hasLicense, true);
    }

    @Test
    public void testNutrientCollectionFactory() throws SQLException
    {
        NutrientCollectionHelper coll = NutrientCollectionFactory.CreateInstance(1);

        assertNotNull(coll);

        assertEquals("coll size", 1, coll.size());

    }

    @Test
    public void testNutrientFactory() throws SQLException
    {
        NutrientHelper help = NutrientFactory.CreateInstance();

        assertNotNull(help);

        help = NutrientFactory.CreateInstance(1);

        assertNotNull(help);

        assertEquals(100, help.getWeight(), 0);
    }

    @Test
    public void testMealFactory() throws SQLException
    {
        MealHelper help = MealFactory.CreateInstance();

        assertNotNull(help);

        help = MealFactory.CreateInstance(3);

        assertNotNull(help);

        assertEquals("meal id", "Default Meal", help.getMealName());
    }

    @Test
    public void testUserFactory() throws SQLException
    {
        UserHelper help = UserFactory.CreateInstance();

        assertNotNull(help);

        help = UserFactory.CreateInstance(3);

        assertNotNull(help);

        assertEquals("user name", "test", help.getFirstName());
    }

    @Test
    public void testWeekdayFactory() throws SQLException
    {
        WeekdayHelper help = WeekdayFactory.CreateInstance();

        assertNotNull(help);

        help = WeekdayFactory.CreateInstance(1);

        assertNotNull(help);

        assertEquals("app user id", 3, help.getAppUserId());

        List<WeekdayHelper> coll = WeekdayFactory.CreateCollectionInstance(3);

        assertNotNull(coll);

        assertNotSame("Number of days", 0, coll.size());

        for (WeekdayHelper helper : coll)
        {
            assertNotSame("week day id", 0, helper.getWeekDayId());
        }
    }
    
    @Test
    public void testLastMealItem() throws SQLException
    {
        MealItemModel model = new MealItemModel();
        
        model.loadLastMealItemByUserId(3);
        
        assertNotSame(model.getMealItemName(), "");
        
        
    }
}
