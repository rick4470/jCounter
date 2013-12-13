/**
 * @author rick
 * 
 * 
 */

package view;

import controller.Controller;
import library.TabsActions;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabsView
{
    
    private javax.swing.JPanel dashboardView;
    private javax.swing.JPanel foodView;
    private javax.swing.JPanel reportView;
    private javax.swing.JPanel updateView;
    private javax.swing.JTabbedPane view;  
    private TabsActions actions;
    
    public TabsView()
    {
        initView();
    }
    
 
    private void initView()
    {
        view = new javax.swing.JTabbedPane();
        dashboardView = new javax.swing.JPanel();
        foodView = new javax.swing.JPanel();
        reportView = new javax.swing.JPanel();
        updateView = new javax.swing.JPanel();

        view.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(dashboardView);
        dashboardView.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(46, 46, 46)
                .addContainerGap(613, Short.MAX_VALUE))
        );

        view.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=50 marginheight=60>Dashboard</body></html>", dashboardView);
        
        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(foodView);
        foodView.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 679, Short.MAX_VALUE)
        );

        view.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=50 marginheight=60>Food</body></html>", foodView);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(reportView);
        reportView.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 651, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 679, Short.MAX_VALUE)
        );

        view.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=50 marginheight=60>Reports</body></html>", reportView);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(updateView);
        updateView.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 651, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 679, Short.MAX_VALUE)
        );

        view.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=50 marginheight=60>Update info</body></html>", updateView);
        
        view.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                if(actions != null)
                {
                    switch (view.getSelectedIndex()) {
                        case 0:
                            reloadDashboardTab();
                            break;
                        case 1:
                             reloadFoodTab();
                            break;
                        case 2:
                            reloadReportTab();
                            break;
                        case 3:
                            reloadUpdateTab();
                            break;
                    }
                }
            }
        });
    }
    
    public JTabbedPane getView()
    {
        return view;
    }
    
    public void addController(Controller action)
    {
        actions = (TabsActions) action;
        reloadDashboardTab();
    }
    
    private void reloadDashboardTab()
    {
        actions.dashboardTab();
        dashboardView.removeAll();
        
        setLayout(dashboardView);
    }
    
    
    private void reloadFoodTab()
    {
        actions.foodTab();
        foodView.removeAll();
        
        setLayout(foodView);
    }
    
    
    private void reloadReportTab()
    {
        actions.reportTab();
        reportView.removeAll();
        
        setLayout(reportView);
    }
    
    private void reloadUpdateTab()
    {
        actions.updateTab();
        updateView.removeAll();
        
        setLayout(updateView);
    }

    private void setLayout(JPanel layout)
    {
        
        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(layout);
        layout.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(499, Short.MAX_VALUE)
                        .add(actions.getSelectedTabView(), org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                        .add(46, 46, 46)
                        .add(actions.getSelectedTabView(), org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(613, Short.MAX_VALUE))
        );
    }
}
