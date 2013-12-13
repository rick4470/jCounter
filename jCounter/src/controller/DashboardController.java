/**
 * @author rick
 * Dashboard controller, that returns back users helper to the view.
 * Only has one method getUsersHelper that returns to the view an
 * instance of UserHelper.
 * 
 */
package controller;

import library.DashboardActions;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.DashboardData;
import library.SUser;
import library.UserFactory;
import library.UserHelper;
import view.DashboardView;
import view.View;

public class DashboardController extends Controller implements DashboardActions
{
    private Component view;
    
    public DashboardController(View view)
    {
        super(view);
    }
    @Override
    public void dashboardTab()
    {
          try
          {
              UserHelper user = UserFactory.CreateInstance(SUser.getUserId());
              DashboardView dashboardView = new DashboardView();
              DashboardData data = new DashboardData();
              data.setFirstName(user.getFirstName());
              data.setLastName(user.getLastName());
              data.setGender(user.getGender());
              data.setAge(user.getDOB());
              data.setWeight(user.getWeight());
              data.setFeet(user.getHeight());
              data.setInches(user.getHeight());
              data.setBMI(user.getHeight(), user.getWeight());
              data.setWeightToGo(user.getWeight(), user.getTargetWeight());
              data.setWeightDifference(user.getWeight(), user.getInitialWeight());
              data.setBMR(user.getHeight(), user.getWeight(),
                      user.getActivityLevel(), user.getGender(), data.getAge());
              data.setActivityLevel(user.getActivityLevel());
              

              data.setLastMeal(SUser.getLastMeal());
              data.setLastMealCalories(SUser.getLastMealCalories());
              data.setCalories(SUser.getCurrentCalorieCount());

              dashboardView.setTextFields(data);
              view = dashboardView.getView();
          } catch (SQLException ex)
          {
              Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    public Component getDashboardView()
    {
        return view;
    }
    
}
