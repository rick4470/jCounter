/**
 *
 * @author Camille
 * @author Rick
 * 
 * Update second view
 */
package view;

import library.UpdateActions;
import controller.UpdateController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public final class PersonalInfoView implements ActionListener
{

    private JPanel view;
    private JTextField currentFirstName;
    private JTextField currentLastName;
    private JTextField newFirstName;
    private JTextField newLastName;
    private JTextField currentGender;
    private JTextField currentTargetWeight;
    private JTextField newTargetWeight;
    private String[] genders = {"M", "F"};
    private UpdateActions controller;

    public PersonalInfoView()
    {
        initView();
    }

    public void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));
      
        
        JLabel lblPersonalInformation = new JLabel("Change Personal Information");
		lblPersonalInformation.setFont(new Font("Maiandra GD", Font.BOLD, 17));
		
		currentFirstName = new JTextField();
		currentFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		currentFirstName.setEditable(false);
		currentFirstName.setColumns(10);
		
		JLabel lblCurrentName = new JLabel("Current name: ");
		
		currentLastName = new JTextField();
		currentLastName.setHorizontalAlignment(SwingConstants.CENTER);
		currentLastName.setEditable(false);
		currentLastName.setColumns(10);
		
		JLabel lblNewName = new JLabel("New name: ");
		
		JLabel lblFirst = new JLabel("First: ");
		
		newFirstName = new JTextField();
		newFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		newFirstName.setColumns(10);
		
		JLabel lblLast = new JLabel("Last: ");
		
		newLastName = new JTextField();
		newLastName.setHorizontalAlignment(SwingConstants.CENTER);
		newLastName.setColumns(10);
		
		JLabel lblCurrentGender = new JLabel("Current gender: ");
		
		currentGender = new JTextField();
                currentGender.setHorizontalAlignment(SwingConstants.CENTER);
		currentGender.setEditable(false);
		currentGender.setColumns(10);
		
		JLabel lblNewGender = new JLabel("New gender: ");
		
		JComboBox newGender = new JComboBox(genders);
		
		JLabel lblCurrentTargetWeight = new JLabel("Current target weight: ");
		
		currentTargetWeight = new JTextField();
                currentTargetWeight.setHorizontalAlignment(SwingConstants.CENTER);
		currentTargetWeight.setEditable(false);
		currentTargetWeight.setColumns(10);
		
		JLabel lblCurrentTargetWeight_2 = new JLabel("lbs.");
		
		JLabel lblNewTargetWeight = new JLabel("New target weight: ");
		
		newTargetWeight = new JTextField();
                newTargetWeight.setHorizontalAlignment(SwingConstants.CENTER);
		newTargetWeight.setColumns(10);
		
		JLabel lblNewTargetWeight_2 = new JLabel("lbs.");
		
		JButton btnUpdate = new JButton("Update");
		GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(160)
					.addComponent(lblPersonalInformation)
					.addContainerGap(172, Short.MAX_VALUE))
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap(96, Short.MAX_VALUE)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addGap(67)
							.addComponent(lblFirst)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(newFirstName, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLast)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(newLastName, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCurrentGender)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentGender, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(lblNewGender)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(newGender, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewName)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCurrentName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentFirstName, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(currentLastName, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
					.addGap(135))
				.addGroup(gl_view.createSequentialGroup()
					.addGap(149)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addComponent(lblCurrentTargetWeight)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(currentTargetWeight, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCurrentTargetWeight_2))
						.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.LEADING, gl_view.createSequentialGroup()
								.addComponent(lblNewTargetWeight)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(newTargetWeight, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewTargetWeight_2))))
					.addContainerGap(240, Short.MAX_VALUE))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPersonalInformation)
					.addGap(67)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(currentLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(currentFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCurrentName))
					.addGap(55)
					.addComponent(lblNewName)
					.addGap(18)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(newLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(newFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFirst)
						.addComponent(lblLast))
					.addGap(78)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(newGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewGender)
						.addComponent(lblCurrentGender)
						.addComponent(currentGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(71)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentTargetWeight)
						.addComponent(currentTargetWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCurrentTargetWeight_2))
					.addGap(44)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewTargetWeight)
						.addComponent(newTargetWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewTargetWeight_2))
					.addGap(63)
					.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		view.setLayout(gl_view);
    }

    public JPanel getView()
    {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    public void addController(UpdateController aThis)
    {
        controller = aThis;
    }
}
