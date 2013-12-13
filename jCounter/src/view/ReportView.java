/**
 *
 * @author Camille
 */
package view;

import controller.Controller;
import library.ReportActions;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public final class ReportView implements ActionListener
{

    private JPanel view;
    private  ReportActions controller;
    private String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
        "11", "12"};
    private String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] years = new String[101];

    public ReportView()
    {
        populateYearsArray();
        this.initView();
    }

    public void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        //buttons and labels
        JLabel lblReport = new JLabel("Reports");
        lblReport.setFont(new Font("Maiandra GD", Font.BOLD, 17));
        JLabel lblEnterDateRange = new JLabel("Enter date range: ");
        JComboBox m1 = new JComboBox(months);
        JComboBox d1 = new JComboBox(days);
        JComboBox y1 = new JComboBox(years);
        JLabel lblFrom = new JLabel("From: ");
        JLabel lblTo = new JLabel("To: ");
        JComboBox m2 = new JComboBox(months);
        JComboBox d2 = new JComboBox(days);
        JComboBox y2 = new JComboBox(years);
        JButton btnGenerate = new JButton("Generate");
        JLabel lblOrChoosePredefined = new JLabel("Or choose pre-defined date range: ");
        JButton btnLast14Days = new JButton("Last 14 Days");
        JButton btnLast30Days = new JButton("Last 30 Days");
        JButton btnLast60Days = new JButton("Last 60 Days");
        JButton btnLast180Days = new JButton("Last 180 Days");

        //place labels and buttons correctly
        GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(258)
					.addComponent(lblReport)
					.addContainerGap(258, Short.MAX_VALUE))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(232)
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLast14Days, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
						.addComponent(btnLast30Days, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
						.addComponent(btnLast60Days, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
						.addComponent(btnLast180Days, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
						//.addComponent(btnLast365Days, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    )
					.addGap(233))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(232)
					.addComponent(btnGenerate, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(233, Short.MAX_VALUE))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(239)
					.addComponent(lblEnterDateRange)
					.addContainerGap(246, Short.MAX_VALUE))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(147)
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblFrom, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTo))
					.addGap(18)
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
						.addComponent(m1, 0, 50, Short.MAX_VALUE)
						.addComponent(m2, 0, 50, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addComponent(d1, 0, 50, Short.MAX_VALUE)
						.addComponent(d2, 0, 50, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addComponent(y1, 0, 67, Short.MAX_VALUE)
						.addComponent(y2, 0, 67, Short.MAX_VALUE))
					.addGap(191))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(196)
					.addComponent(lblOrChoosePredefined)
					.addContainerGap(207, Short.MAX_VALUE))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblReport)
					.addGap(45)
					.addComponent(lblEnterDateRange)
					.addGap(37)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(m1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(d1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(y1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFrom))
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_view.createSequentialGroup()
								.addGap(43)
								.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
									.addComponent(m2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(d2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(y2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblTo)))
							.addGroup(gl_view.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addComponent(btnGenerate)
					.addGap(44)
					.addComponent(lblOrChoosePredefined)
					.addGap(27)
					.addComponent(btnLast14Days)
					.addGap(18)
					.addComponent(btnLast30Days)
					.addGap(18)
					.addComponent(btnLast60Days)
					.addGap(18)
					.addComponent(btnLast180Days)
					.addGap(18)
					//.addComponent(btnLast365Days)
					//.addGap(84)
                )
		);
		view.setLayout(gl_view);
        
        
        btnGenerate.addActionListener(this);
        btnGenerate.setActionCommand("custom");
        btnLast14Days.addActionListener(this);
        btnLast14Days.setActionCommand("14");
        btnLast30Days.addActionListener(this);
        btnLast30Days.setActionCommand("30");
        btnLast60Days.addActionListener(this);
        btnLast60Days.setActionCommand("60");
        btnLast180Days.addActionListener(this);
        btnLast180Days.setActionCommand("180");
        
        
    }//end initView()

    public JPanel getView()
    {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {      
        if(controller != null)
        {
            String buttonValue = ((JButton) e.getSource()).getActionCommand();
            
            if(buttonValue.contentEquals("custom"))
            {
                //controller.customReportView(); TODO get values of dropdown

            }
            if(buttonValue.contentEquals("14"))
            {
                controller.customReportView(14);
            }
            if(buttonValue.contentEquals("30"))
            {
                controller.customReportView(30);
            }
            if(buttonValue.contentEquals("60"))
            {
                controller.customReportView(60);
            }
            if(buttonValue.contentEquals("180"))
            {
                controller.customReportView(180);
            }
        }
    }

    public void addController(Controller action)
    {
        controller = (ReportActions) action;
    }
    
    private void populateYearsArray()
    {
        int year = 2013;

        for (int i = 0; i < 101; i++)
        {
            String yyear = "";
            yyear += year;
            years[i] = yyear;
            year--;
        }
    }
}
