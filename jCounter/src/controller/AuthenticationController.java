/**
 * @author rick
 * Check if the user belogs in this system
 * if the user inputs an invalid code send them
 * back with an error and not allowe them to enter 
 * the system
 * 
 */
package controller;

import library.AuthenticationActions;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.AuthenticationFactory;
import library.AuthenticationHelper;
import library.Key;
import library.SUser;
import view.NewUserView;
import view.TabsView;
import view.View;

public class AuthenticationController extends Controller implements AuthenticationActions
{
    public AuthenticationController(View view)
    {
        super(view);
    }
    
    /**
     * Check if it's a valid key, if it is then check if that users exist
     * if the users does not exist then add the new user view along with 
     * the proper controller. If none of those scenerios are met then return invalid key.
     * @param key 
     * @param view 
     * @return  boolean
     */
    @Override
    public boolean validateKey(Key key, Component view)
    {
        if(validKey(key))
        {
            this.removeView(view);
            try {
                AuthenticationHelper authHelper = AuthenticationFactory.CreateInstance();
                
                
                if(userExist(key))
                {
                    authHelper.findUserByLicense(key.getKey());
                    SUser.setUserId(authHelper.getUserID());
                    TabsView tabView = new TabsView();
                    TabsController controller = new TabsController(this.getView());
                    tabView.addController(controller);
                    this.addView(tabView.getView());
                    return true;
                }else{
                    authHelper.findLicenseID(key.getKey());
                    SUser.setLicenseNumberId(authHelper.getLicenseID());
                    NewUserView newUserView = new NewUserView();
                    NewUserController controller = new NewUserController(this.getView());
                    newUserView.addController(controller);
                    controller.curentView(newUserView.getView());
                    this.addView(newUserView.getView());
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(AuthenticationController.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }else{
            return false;
        }
    }
    
    public Boolean validKey(Key e)
    {
        AuthenticationHelper authHelper = AuthenticationFactory.CreateInstance();
        try {
            return authHelper.findLicenseID(e.getKey());
        } catch (SQLException ex) {
            Logger.getLogger(AuthenticationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private boolean userExist(Key e) throws SQLException
    {
        AuthenticationHelper authHelper = AuthenticationFactory.CreateInstance();
        return authHelper.findUserByLicense(e.getKey());
    }
   
}
