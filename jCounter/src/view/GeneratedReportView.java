/**
 *
 * @author Camille
 */
package view;

import controller.ReportController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import library.ReportActions;

public class GeneratedReportView implements ActionListener
{

    private JPanel view;
    private JTextField caloriesConsumed;
    private JTextField caloriesAllowed;
    private JTextField calorieDifference;
    private ReportActions controller;

    public GeneratedReportView()
    {
        initView();
    }

    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        //items that will not be altered
        JLabel lblGeneratedReport = new JLabel("Generated Report");
        lblGeneratedReport.setFont(new Font("Maiandra GD", Font.BOLD, 17));
        JLabel lblCalConsumedAllowed = new JLabel("Calories Consumed / Allowed: ");
        JLabel slash = new JLabel("/");
        JLabel lblDifference = new JLabel("Difference: ");
        JButton btnDone = new JButton("Done");

        //fields to be altered (they are uneditable text fields)
        caloriesConsumed = new JTextField();
        caloriesAllowed = new JTextField();
        calorieDifference = new JTextField();

        caloriesConsumed.setEditable(false);
        caloriesConsumed.setColumns(10);
        caloriesAllowed.setEditable(false);
        caloriesAllowed.setColumns(10);
        calorieDifference.setEditable(false);
        calorieDifference.setColumns(10);

        GroupLayout gl_view = new GroupLayout(view);
        gl_view.setHorizontalGroup(
                gl_view.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_view.createSequentialGroup()
                        .addContainerGap(148, Short.MAX_VALUE)
                        .addComponent(lblGeneratedReport)
                        .addGap(144))
                .addGroup(Alignment.LEADING, gl_view.createSequentialGroup()
                        .addGap(46)
                        .addComponent(lblCalConsumedAllowed)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(caloriesConsumed, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(slash)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(caloriesAllowed, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                .addGroup(Alignment.LEADING, gl_view.createSequentialGroup()
                        .addGap(131)
                        .addComponent(lblDifference)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(calorieDifference, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(154, Short.MAX_VALUE))
                .addGroup(gl_view.createSequentialGroup()
                        .addContainerGap(179, Short.MAX_VALUE)
                        .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                        .addGap(174))
        );
        gl_view.setVerticalGroup(
                gl_view.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_view.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGeneratedReport)
                        .addGap(76)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblCalConsumedAllowed)
                                .addComponent(caloriesConsumed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(slash)
                                .addComponent(caloriesAllowed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(76)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(calorieDifference, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDifference))
                        .addGap(81)
                        .addComponent(btnDone, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(141, Short.MAX_VALUE))
        );
        view.setLayout(gl_view);
    }

    public JPanel getView()
    {
        return view;
    }

    //for done button
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }

    public void addController(ReportController aThis)
    {
         controller = (ReportActions) aThis;
    }

    public void setValuesForReport(int cosumed, int allowed, int diff)
    {
        caloriesConsumed.setText(Integer.toString(cosumed));
        caloriesAllowed.setText(Integer.toString(allowed));
        calorieDifference.setText(Integer.toString(diff));
    }
}
