/**
 *
 * @author Rick
 */

package controller;

import library.UpdateActions;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import library.DashboardData;
import library.NewUserData;
import library.SUser;
import library.UpdateInfoData;
import library.UserFactory;
import library.UserHelper;
import view.PersonalInfoView;
import view.UpdateInformationView;
import view.View;

public class UpdateController extends Controller implements UpdateActions
{
    private JPanel tabView;
    

    public UpdateController(View view)
    {
        super(view);
    }

    public Component getUpdateView()
    {
         return tabView;
    }

    public void updateTab()
    {
        try
        {
            UserHelper user = UserFactory.CreateInstance(SUser.getUserId());
            DashboardData data = new DashboardData();
            data.setWeight(user.getWeight());
            data.setFeet(user.getHeight());
            data.setInches(user.getHeight());
            data.setActivityLevel(user.getActivityLevel());
            
            UpdateInformationView foodView = new UpdateInformationView();   
            foodView.addController(this);
            foodView.setTextFields(data);
            tabView = foodView.getView();
        }catch (SQLException ex)
          {
              Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
   
    public void updateUser(UpdateInfoData data, String weight, String feet, String inches, String activity) throws SQLException
    {
        
        UserHelper user = UserFactory.CreateInstance(SUser.getUserId());
        if(!"".equals(weight))
        {
            user.setWeight(data.getWeight());
        }
        if(!"".equals(feet) && !"".equals(inches))
        {
            user.setHeight(data.getHeight());
        }
        if(!"".equals(activity))
        {
            user.setActivityLevel(data.getActivityLevel());
        }
        user.Save();
         
    }

    @Override
    public void update()
    {
        
    }

    @Override
    public void setPersonalInfoView()
    {
        
        tabView.removeAll();
        
        PersonalInfoView personalInfo = new PersonalInfoView();   
        personalInfo.addController(this);
        setLayout(personalInfo.getView());
        tabView = personalInfo.getView();
    }

    private void setLayout(JPanel view)
    {
        org.jdesktop.layout.GroupLayout jPanelLayout = new org.jdesktop.layout.GroupLayout(tabView);
        tabView.setLayout(jPanelLayout);

        jPanelLayout.setHorizontalGroup(
                jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLayout.createSequentialGroup()
                        .add(view, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                ) );
        jPanelLayout.setVerticalGroup(
                jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanelLayout.createSequentialGroup()
                        .add(view, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                ));
    }
}
