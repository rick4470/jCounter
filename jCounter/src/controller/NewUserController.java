/**
 * @author rick
 * New users Controller that handles interactions with NewUserView
 */
package controller;
import library.NewUserActions;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import library.NewUserData;
import library.SUser;
import library.UserFactory;
import library.UserHelper;
import view.TabsView;
import view.View;

public class NewUserController extends Controller implements NewUserActions
{
    private Component currentWindow;
    
    public NewUserController(View view)
    {
        super(view);
    }
    
    /**
     * Add a new user to the database, with the valid data 
     * that gets passed in, set the licesense number relation
     * with the static user Suser.
     * @param data
     * @return 
     */
    @Override
    public boolean addNewUser(NewUserData data)
    {
        
        UserHelper user = UserFactory.CreateInstance();
        
        user.setLicenseNumber(SUser.getLicenseNumberId());
        user.setFirstName(data.getFirstName());
        user.setLastName(data.getLastName());
        user.setDOB(data.getDOB());
        user.setGender(data.getGender());
        user.setWeight(data.getWeight());
        user.setHeight(data.getHeight());
        user.setActivityLevel(data.getActivityLevel());
        user.setInitialWeight(data.getWeight());
        user.setTargetWeight(data.getTargeWeight());
        user.Save();
        
        try {
            UserHelper loadByLicenseID = UserFactory.CreateInstanceLoadByLicenseID(SUser.getLicenseNumberId());
            SUser.setUserId(loadByLicenseID.getUserId());
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(NewUserController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
                
    }

    /**
     * Users got added succesfully to the DB now send the user
     * over to the tabs view and set the default tab to be the
     * dashbaord.
     */
    @Override
    public void goToTabs()
    {
        this.removeView(currentWindow);
        TabsView tabView = new TabsView();
        TabsController controller = new TabsController(this.getView());
        tabView.addController(controller);
        this.addView(tabView.getView());
    }
    
    void curentView(JPanel view)
    {
        currentWindow = view;
    }
}
