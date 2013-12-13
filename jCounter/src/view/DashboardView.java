/**
 * @author rick
 * @author Camille
 * DashboardView class creates the dashboard window which displays the user's information
 * and current progress. This view will never call a controller only the controller will 
 * pass data to it.
 * 
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import library.DashboardData;
import library.SUser;

public final class DashboardView implements ActionListener
{
    private JPanel view;
    private JTextField age, weight, bodyFatPercentage, poundsLost, poundsToGo, gender, heightFeet,
        heightInches, BMI, todaysCalories, thisWeeksCalories, lastMeal, lastMealCalories, 
        todaysAllowedCalories, thisWeeksAllowedCalories;
    private JLabel firstName, lastName, difference;
        
    /**
     * No-argument constructor calls initView() to initialize the current view.
     */
    public DashboardView()
    {
        initView();
    }

    /**
     * Initializes the view by declaring necessary components for the window and placing them
     * correctly in the window boundaries.
     */
    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        firstName = new JLabel("First Name");
        firstName.setHorizontalAlignment(SwingConstants.RIGHT);
                
        lastName = new JLabel("Last Name");
	lastName.setHorizontalAlignment(SwingConstants.LEFT);
		
	JLabel lblDashboard = new JLabel("Dashboard");
	lblDashboard.setFont(new Font("Maiandra GD", Font.BOLD, 17));
		
	JLabel lblGender = new JLabel("Gender: ");
		
	JLabel lblAge = new JLabel("Age: ");
		
		JLabel lblWeight_1 = new JLabel("Weight: ");
		
		JLabel lblBodyFat_1 = new JLabel("Activity Level: ");
		
		JLabel lblBMI = new JLabel("BMI: ");
		
		JLabel lblHeight_1 = new JLabel("Height: ");
		
		JLabel lblTodaysCalories = new JLabel("Today's Calories: ");
		
		JLabel lblThisWeeksCalories = new JLabel("This Week's Calories: ");
		
		JLabel lblLastMealAte_1 = new JLabel("Last Meal Eaten: ");
                
                JLabel lblProgress_1 = new JLabel("You have lost");
		
		difference = new JLabel("");
		
		JLabel lblProgress_2 = new JLabel("pounds.  Only");
		
		JLabel lblWeight_2 = new JLabel("lbs.");
		
		JLabel lblBodyFat_2 = new JLabel("");
		
		JLabel lblHeight_2 = new JLabel("ft.");
		
		JLabel lblHeight_3 = new JLabel("in.");
		
		age = new JTextField();
		age.setEditable(false);
		age.setHorizontalAlignment(SwingConstants.CENTER);
		age.setColumns(10);
		
		weight = new JTextField();
		weight.setHorizontalAlignment(SwingConstants.CENTER);
		weight.setEditable(false);
		weight.setColumns(10);
		
		bodyFatPercentage = new JTextField();
		bodyFatPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		bodyFatPercentage.setEditable(false);
		bodyFatPercentage.setColumns(10);
		
		poundsLost = new JTextField();
		poundsLost.setEditable(false);
		poundsLost.setHorizontalAlignment(SwingConstants.CENTER);
		poundsLost.setColumns(10);
		
		poundsToGo = new JTextField();
		poundsToGo.setHorizontalAlignment(SwingConstants.CENTER);
		poundsToGo.setEditable(false);
		poundsToGo.setColumns(10);
		
		gender = new JTextField();
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setEditable(false);
		gender.setColumns(10);
		
		heightFeet = new JTextField();
		heightFeet.setEditable(false);
		heightFeet.setHorizontalAlignment(SwingConstants.CENTER);
		heightFeet.setColumns(10);
		
		heightInches = new JTextField();
		heightInches.setHorizontalAlignment(SwingConstants.CENTER);
		heightInches.setEditable(false);
		heightInches.setColumns(10);
		
		BMI = new JTextField();
		BMI.setHorizontalAlignment(SwingConstants.CENTER);
		BMI.setEditable(false);
		BMI.setColumns(10);
		
		todaysCalories = new JTextField();
		todaysCalories.setHorizontalAlignment(SwingConstants.CENTER);
		todaysCalories.setEditable(false);
		todaysCalories.setColumns(10);
		
		thisWeeksCalories = new JTextField();
		thisWeeksCalories.setEditable(false);
		thisWeeksCalories.setHorizontalAlignment(SwingConstants.CENTER);
		thisWeeksCalories.setColumns(10);
		
		lastMeal = new JTextField();
		lastMeal.setHorizontalAlignment(SwingConstants.CENTER);
		lastMeal.setEditable(false);
		lastMeal.setColumns(10);
		
		JLabel lblProgress_3 = new JLabel("to go!");
		
		lastMealCalories = new JTextField();
		lastMealCalories.setHorizontalAlignment(SwingConstants.CENTER);
		lastMealCalories.setEditable(false);
		lastMealCalories.setColumns(10);
		
		JLabel lblLastMealAte_2 = new JLabel("calories");
		JLabel lblTodaysCalories_2 = new JLabel("/");
		
		JLabel lblThisWeeksCalories_2 = new JLabel("/");
		
		todaysAllowedCalories = new JTextField();
		todaysAllowedCalories.setHorizontalAlignment(SwingConstants.CENTER);
		todaysAllowedCalories.setEditable(false);
		todaysAllowedCalories.setColumns(10);
		
		thisWeeksAllowedCalories = new JTextField();
		thisWeeksAllowedCalories.setEditable(false);
		thisWeeksAllowedCalories.setHorizontalAlignment(SwingConstants.CENTER);
		thisWeeksAllowedCalories.setColumns(10);
		
                GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addGap(238)
							.addComponent(lblDashboard))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(96)
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_view.createSequentialGroup()
									.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_view.createSequentialGroup()
											.addComponent(lblProgress_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(poundsLost, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblProgress_2))
										.addGroup(gl_view.createSequentialGroup()
											.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_view.createSequentialGroup()
													.addComponent(lblHeight_1)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(heightFeet, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblHeight_2, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
												.addGroup(gl_view.createSequentialGroup()
													.addGroup(gl_view.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_view.createSequentialGroup()
															.addComponent(lblGender)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(gender, 0, 0, Short.MAX_VALUE))
														.addGroup(gl_view.createSequentialGroup()
															.addComponent(lblWeight_1)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(weight, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblWeight_2)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(heightInches, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblHeight_3, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_view.createSequentialGroup()
											.addGap(46)
											.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_view.createSequentialGroup()
													.addComponent(lblAge)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(age, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_view.createSequentialGroup()
													.addComponent(lblBodyFat_1)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(bodyFatPercentage, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(lblBodyFat_2))
												.addGroup(gl_view.createSequentialGroup()
													.addComponent(lblBMI)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(BMI, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_view.createSequentialGroup()
											.addComponent(poundsToGo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblProgress_3)))
									.addGap(288))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblTodaysCalories)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(todaysCalories, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblTodaysCalories_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(todaysAllowedCalories, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblThisWeeksCalories)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(thisWeeksCalories, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblThisWeeksCalories_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(thisWeeksAllowedCalories, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(178)
							.addComponent(firstName, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lastName, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_view.createSequentialGroup()
							.addGap(147)
							.addComponent(lblLastMealAte_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lastMealCalories, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblLastMealAte_2))
								.addComponent(lastMeal, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(31)
					.addComponent(lblDashboard)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lastName)
						.addComponent(firstName))
					.addGap(41)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGender)
						.addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAge)
						.addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWeight_1)
						.addComponent(weight, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblWeight_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBodyFat_1)
						.addComponent(bodyFatPercentage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBodyFat_2))
					.addGap(62)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHeight_1)
						.addComponent(heightFeet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHeight_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(heightInches, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHeight_3)
						.addComponent(lblBMI)
						.addComponent(BMI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(88)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTodaysCalories)
						.addComponent(todaysCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTodaysCalories_2)
						.addComponent(todaysAllowedCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblThisWeeksCalories)
						.addComponent(thisWeeksCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblThisWeeksCalories_2)
						.addComponent(thisWeeksAllowedCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastMealAte_1)
						.addComponent(lastMeal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lastMealCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLastMealAte_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProgress_2)
						.addComponent(lblProgress_1)
						.addComponent(poundsLost, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(poundsToGo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProgress_3))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		view.setLayout(gl_view);
    }
    
    /**
     * Returns the JPanel view.
     * @return view
     */
    public JPanel getView()
    {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent e){}// might not need this
    
    /**
     * Sets the text fields on the dashboard to display the user's information.
     * @param field the user's data
     */
    public void setTextFields(DashboardData field)
    {
        NumberFormat formatter = new DecimalFormat("#0.00");
        firstName.setText(field.getFirstName());
        lastName.setText(field.getLastName());
        weight.setText(""+field.getWeight());
        heightFeet.setText(""+field.getFeet());
        heightInches.setText(""+field.getInches());
        gender.setText(field.getGender());
        age.setText(""+field.getAge());
        BMI.setText(field.getBMI());
        poundsToGo.setText(""+field.getWeightToGo());
        poundsLost.setText(""+field.getWeightDifference());
        difference.setText(field.getDifferenceText());
        todaysAllowedCalories.setText(""+formatter.format(field.getBMR()));
        thisWeeksAllowedCalories.setText(""+formatter.format(field.getBMR()*7));
        SUser.set7WeekDayCals(field.getBMR()*7);
        lastMeal.setText(field.getLastMeal());
        lastMealCalories.setText(""+field.getLastMealCalories());
        todaysCalories.setText(""+field.getCalories());
        thisWeeksCalories.setText(""+SUser.getCurrentCalorieCount());
        bodyFatPercentage.setText(field.getActivityLevel().substring(0,field.getActivityLevel().indexOf("(")));
    }

    //is this being used?
    public void setLayout(JPanel view)
    {
    }

}
