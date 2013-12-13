/**
 *
 * @author Camille
 * @author Rick
 * 
 * Update main view
 */
package view;

import controller.Controller;
import controller.UpdateController;
import library.UpdateActions;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import library.DashboardData;
import library.NewUserData;
import library.UpdateInfoData;


public final class UpdateInformationView implements ActionListener
{

    private JPanel view;
    private JTextField currentWeight, newWeight, currentHeightFeett, currentHeightInches, currentActivityLevel;
    private UpdateActions controller;
    private UpdateController myConroller;
    private JComboBox newActivityLevel, newHeightFeet, newHeightInches;
    
    private String[] feetIntegers = {"","1","2","3","4","5","6","7","8"};
    private String[] inchesIntegers = {"","0","1","2","3","4","5","6","7","8","9","10","11"};
    
    private String[] activityLevels = {"","Low (less than 30 min/day)",
        "Moderate (about 30 min/day)",
        "High (2 or more hrs/day)"};

    public UpdateInformationView()
    {
        initView();
    }

    public void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        JLabel lblUpdateInformation = new JLabel("Update Information");
        lblUpdateInformation.setFont(new Font("Maiandra GD", Font.BOLD, 17));

        JLabel lblCurrentWeight = new JLabel("Current Weight: ");

        currentWeight = new JTextField();
        currentWeight.setHorizontalAlignment(SwingConstants.CENTER);
        currentWeight.setEditable(false);
        currentWeight.setColumns(10);

        JLabel lblCurrentWeight_2 = new JLabel("lbs.");

        JLabel lblNewWeight = new JLabel("New Weight: ");

        newWeight = new JTextField();
        newWeight.setHorizontalAlignment(SwingConstants.CENTER);
        newWeight.setColumns(10);

        JLabel lblNewWeight_2 = new JLabel("lbs.");

        JLabel lblCurrentHeight = new JLabel("Current Height: ");

        currentHeightFeett = new JTextField();
        currentHeightFeett.setHorizontalAlignment(SwingConstants.CENTER);
        currentHeightFeett.setEditable(false);
        currentHeightFeett.setColumns(10);

        JLabel lblCurrentHeight_2 = new JLabel("ft. ");

        currentHeightInches = new JTextField();
        currentHeightInches.setHorizontalAlignment(SwingConstants.CENTER);
        currentHeightInches.setEditable(false);
        currentHeightInches.setColumns(10);

        JLabel lblCurrentHeight_3 = new JLabel("in. ");

        JLabel lblNewHeight = new JLabel("New Height: ");

        newHeightFeet = new JComboBox(feetIntegers);

        JLabel lblNewHeight_2 = new JLabel("ft. ");

        newHeightInches = new JComboBox(inchesIntegers);

        JLabel lblNewHeight_3 = new JLabel("in. ");

        JLabel lblCurrentActivityLevel = new JLabel("Current Activity Level: ");

        currentActivityLevel = new JTextField();
        currentActivityLevel.setEditable(false);
        currentActivityLevel.setColumns(10);

        JLabel lblNewActivityLevel = new JLabel("New Activity Level: ");

        newActivityLevel = new JComboBox(activityLevels);

        JButton btnUpdate = new JButton("Update");
        JButton btnChangePersonalInfo = new JButton("Change Personal Info");
        btnChangePersonalInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        /*GroupLayout gl_view = new GroupLayout(view);
        gl_view.setHorizontalGroup(
                gl_view.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_view.createSequentialGroup()
                        .addGap(67)
                        .addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
                                .addComponent(lblNewActivityLevel)
                                .addComponent(lblCurrentActivityLevel))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_view.createParallelGroup(Alignment.TRAILING, false)
                                .addComponent(newActivityLevel, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(currentActivityLevel, Alignment.LEADING))
                        .addContainerGap(156, Short.MAX_VALUE))
                .addGroup(gl_view.createSequentialGroup()
                        .addContainerGap(99, Short.MAX_VALUE)
                        .addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
                                .addComponent(lblNewHeight)
                                .addComponent(lblCurrentHeight)
                                .addComponent(lblNewWeight)
                                .addComponent(lblCurrentWeight))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_view.createParallelGroup(Alignment.LEADING)
                                .addGroup(gl_view.createSequentialGroup()
                                        .addGroup(gl_view.createParallelGroup(Alignment.LEADING, false)
                                                .addComponent(newWeight, 0, 0, Short.MAX_VALUE)
                                                .addComponent(currentWeight, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(gl_view.createParallelGroup(Alignment.LEADING)
                                                .addComponent(lblCurrentWeight_2)
                                                .addComponent(lblNewWeight_2)))
                                .addGroup(gl_view.createSequentialGroup()
                                        .addGroup(gl_view.createParallelGroup(Alignment.LEADING)
                                                .addGroup(gl_view.createSequentialGroup()
                                                        .addComponent(currentHeightFeett, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(lblCurrentHeight_2))
                                                .addComponent(newHeightFeet, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(ComponentPlacement.RELATED)
                                        .addGroup(gl_view.createParallelGroup(Alignment.LEADING)
                                                .addGroup(gl_view.createSequentialGroup()
                                                        .addComponent(lblNewHeight_2)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(newHeightInches, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(gl_view.createSequentialGroup()
                                                        .addComponent(currentHeightInches, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                        .addComponent(lblCurrentHeight_3)))))
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(lblNewHeight_3)
                        .addGap(89))
                .addGroup(Alignment.TRAILING, gl_view.createSequentialGroup()
                        .addContainerGap(152, Short.MAX_VALUE)
                        .addComponent(lblUpdateInformation)
                        .addGap(128))
                .addGroup(Alignment.TRAILING, gl_view.createSequentialGroup()
                        .addGap(164)
                        .addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(174))
                .addGroup(gl_view.createSequentialGroup()
                        .addGap(127)
                        .addComponent(btnChangePersonalInfo)
                        .addContainerGap(132, Short.MAX_VALUE))
        );
        gl_view.setVerticalGroup(
                gl_view.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_view.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUpdateInformation)
                        .addGap(38)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblCurrentWeight)
                                .addComponent(currentWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCurrentWeight_2))
                        .addGap(18)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblNewWeight)
                                .addComponent(newWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewWeight_2))
                        .addGap(28)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblCurrentHeight)
                                .addComponent(currentHeightFeett, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCurrentHeight_2)
                                .addComponent(currentHeightInches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCurrentHeight_3))
                        .addGap(18)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblNewHeight)
                                .addComponent(newHeightFeet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewHeight_2)
                                .addComponent(newHeightInches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNewHeight_3))
                        .addGap(39)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblCurrentActivityLevel)
                                .addComponent(currentActivityLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(31)
                        .addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblNewActivityLevel)
                                .addComponent(newActivityLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(35)
                        .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnChangePersonalInfo, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addGap(49))
        );
        view.setLayout(gl_view);*/
        
        GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap(199, Short.MAX_VALUE)
					.addComponent(lblUpdateInformation)
					.addGap(208))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(208)
					.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(214, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_view.createSequentialGroup()
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_view.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnChangePersonalInfo, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(139)
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblNewWeight)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(newWeight, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewWeight_2))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCurrentWeight)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentWeight, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCurrentWeight_2))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCurrentActivityLevel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentActivityLevel, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCurrentHeight)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentHeightFeett, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCurrentHeight_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentHeightInches, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCurrentHeight_3))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblNewHeight)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(newHeightFeet, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewHeight_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(newHeightInches, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewHeight_3))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblNewActivityLevel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(newActivityLevel, 0, 159, Short.MAX_VALUE)))))
					.addGap(177))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUpdateInformation)
					.addGap(53)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentWeight)
						.addComponent(currentWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCurrentWeight_2))
					.addGap(29)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewWeight)
						.addComponent(newWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewWeight_2))
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentHeight)
						.addComponent(currentHeightFeett, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCurrentHeight_2)
						.addComponent(currentHeightInches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCurrentHeight_3))
					.addGap(17)
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_view.createSequentialGroup()
							.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewActivityLevel)
								.addComponent(newActivityLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(13))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewHeight)
								.addComponent(newHeightFeet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewHeight_2)
								.addComponent(newHeightInches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewHeight_3))
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
							.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCurrentActivityLevel)
								.addComponent(currentActivityLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(60)))
					.addGap(37)
					.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(btnChangePersonalInfo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(100))
		);
		view.setLayout(gl_view);
        
        btnUpdate.setActionCommand("update");
        btnUpdate.addActionListener(this);
        
        btnChangePersonalInfo.setActionCommand("change");
        btnChangePersonalInfo.addActionListener(this);
    }

    public JPanel getView()
    {
        return view;
    }

    public void addController(Controller aThis)
    {
        controller = (UpdateActions) aThis;
        myConroller = (UpdateController) aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(controller != null)
        {
            String buttonValue = ((JButton) e.getSource()).getActionCommand();
            
            if(buttonValue.contentEquals("update"))
            {
                try {
                    myConroller.updateUser(getUpdateInfoData(), newWeight.getText(),
                            newHeightFeet.getSelectedItem().toString(),
                            newHeightInches.getSelectedItem().toString(),
                            newActivityLevel.getSelectedItem().toString());
                    //controller.update();
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateInformationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(buttonValue.contentEquals("change"))
            {
                controller.setPersonalInfoView();
            }
        }
        
    }
    
    public void setTextFields(DashboardData field)
    {
        currentWeight.setText(""+field.getWeight());
        currentHeightFeett.setText(""+field.getFeet());
        currentHeightInches.setText(""+field.getInches());
        currentActivityLevel.setText(field.getActivityLevel());
    }
    
    private UpdateInfoData getUpdateInfoData()
    {
        
        UpdateInfoData data = new UpdateInfoData();
        if(!"".equals(newWeight.getText()))
        {
            data.setWeight(newWeight.getText());
        }
        if(!"".equals(newHeightFeet.getSelectedItem().toString()) && !"".equals(newHeightInches.getSelectedItem().toString()))
        {
            data.setHeight(newHeightFeet.getSelectedItem().toString(), newHeightInches.getSelectedItem().toString());
        }
        if(!"".equals(newActivityLevel.getSelectedItem().toString()))
        {
            data.setActivityLevel(newActivityLevel.getSelectedItem().toString());
        }
        
        return data;
        
    }
}
