

package controller;

import library.TabsActions;
import java.awt.Component;
import view.View;

public class TabsController extends Controller implements TabsActions
{
    private Component selectedTabView;
    
    public TabsController(View view)
    {
        super(view);
    }

    @Override
    public void dashboardTab()
    {
        DashboardController myDash = new DashboardController(this.getView());
        myDash.dashboardTab();
        selectedTabView = myDash.getDashboardView();
    }

    @Override
    public void foodTab()
    {
        FoodController food = new FoodController(this.getView());
        food.foodTab();
        selectedTabView = food.getFoodView();
    }

    @Override
    public void reportTab()
    {
        ReportController report = new ReportController(this.getView());
        report.reportTab();
        selectedTabView = report.getReportView();
    }
    
    @Override
    public void updateTab()
    {
        UpdateController update = new UpdateController(this.getView());
        update.updateTab();
        selectedTabView = update.getUpdateView();
    }

    @Override
    public Component getSelectedTabView() 
    {
        return selectedTabView;
    }

}
