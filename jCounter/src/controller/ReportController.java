/**
 *
 * @author rick
 */
package controller;

import library.ReportActions;
import java.awt.Component;
import javax.swing.JPanel;
import library.SUser;
import view.GeneratedReportView;
import view.ReportView;
import view.View;

public class ReportController extends Controller implements ReportActions
{
    private JPanel view;

    public ReportController(View view)
    {
        super(view);
    }


    @Override
    public void reportTab()
    {
        ReportView reportView = new ReportView(); 
        reportView.addController(this);
        view = reportView.getView();
    }
   
    @Override
    public Component getReportView()
    {
        return view;
    }

    @Override
    public void customReportView(int days) 
    {
        view.removeAll();
        GeneratedReportView genearted = new GeneratedReportView();
        genearted.addController(this);
        setLayout(genearted.getView());
        
        int consumed = SUser.getCurrentCalorieCount();
        int week = days / 7;
        
        System.out.println(week);
        int allowed = (int) (SUser.get7WeekDayCals() * week);
        int diffrence = allowed - consumed;
        genearted.setValuesForReport(consumed,allowed,diffrence);
    }

    private void setLayout(JPanel view)
    {
        org.jdesktop.layout.GroupLayout jPanelLayout = new org.jdesktop.layout.GroupLayout(this.view);
        this.view.setLayout(jPanelLayout);

        jPanelLayout.setHorizontalGroup(
                jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .add(view, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
                jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanelLayout.createSequentialGroup()
                        .add(46, 46, 46)
                        .add(view, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(613, Short.MAX_VALUE))
        );
    }

}
