/**
 * @author Rick
 * Unit test for authentaication controller 
 */
package controller;

import javax.swing.JPanel;
import library.Key;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import view.View;


public class AuthenticationControllerTest
{
    private AuthenticationController controller;
    private View myView;
    
    @Before 
    public void createNewFreshObject()
    {
        myView = new View();
        controller = new AuthenticationController(myView);
    }
    /**
     * Test of validateKey method, of class AuthenticationController.
     * Test if the key is valid key expected true;
     */
    @Test
    public void testValidateKeyValid()
    {
        JPanel view = new JPanel();
        Key myKey = new Key("hello");
        boolean expected = true;
        boolean result = controller.validateKey(myKey, view);
        assertEquals(expected, result);
    }
    
    
    /**
     * Test of validateKey method, of class AuthenticationController.
     * Test if the key is invalid
     */
    @Test
    public void testValidateKeyUserExist()
    {
        JPanel view = new JPanel();
        Key myKey = new Key("NOTREAL");
        boolean expected = false;
        boolean result = controller.validateKey(myKey, view);
        assertEquals(expected, result);
    }
    
    
    /**
     * Test of testValidateKeyIvalidKey method, of class AuthenticationController.
     * Test if the user is invalid
     */
    @Test
    public void testValidateKeyIvalidUser()
    {
        JPanel view = new JPanel();
        Key myKey = new Key("parlevu");
        boolean expected = true;
        boolean result = controller.validateKey(myKey, view);
        assertEquals(expected, result);
    }
    
    
        
    /**
     * Test of testValidateKeyIvalidKey method, of class AuthenticationController.
     * Test if the user is valid
     */
    @Test
    public void testValidateKeyValidUser()
    {
        JPanel view = new JPanel();
        Key myKey = new Key("hello");
        boolean expected = true;
        boolean result = controller.validateKey(myKey, view);
        assertEquals(expected, result);
    }
    
    /**
     * Test of validKey method, of class AuthenticationController.
     * Check if a key is invalid, if it is invalid expect back false
     */
    @Test
    public void testValidKeyInvalid()
    {
        Key myKey = new Key("NOTReaL");
        boolean expected = false;
        boolean result = controller.validKey(myKey);
        assertEquals(expected, result);
    }
    
    /**
     * Test of validKey method, of class AuthenticationController.
     * Check if a key is valid, if it is valid expect back true
     */
    @Test
    public void testValidKeyValid()
    {
        Key myKey = new Key("hello");
        boolean expected = true;
        boolean result = controller.validKey(myKey);
        assertEquals(expected, result);
    }
    
}
