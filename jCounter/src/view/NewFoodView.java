/**
 * @author Camille
 */
package view;

import library.FoodActions;
import controller.FoodController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import library.NewFoodData;

public class NewFoodView implements ActionListener
{

    private JPanel view;
    private JTextField txtFieldFoodName;
    private JTextField txtFieldCalories;
    private JTextField txtFieldFat;
    private JTextField txtFieldSodium;
    private JTextField txtFieldProtein;
    //private JTextField txtFieldNumberOfServings;
    private FoodActions controller;

    public NewFoodView()
    {
        initView();
    }

    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        //labels that will not be altered
        JLabel lblAddNewFood = new JLabel("Add New Food");
        lblAddNewFood.setHorizontalAlignment(SwingConstants.CENTER);
	lblAddNewFood.setFont(new Font("Maiandra GD", Font.BOLD, 17));
        JLabel lblFoodName = new JLabel("Food Name: ");
        JLabel lblCalories = new JLabel("Calories: ");
        JLabel lblFat = new JLabel("Fat: ");
        JLabel lblSodium = new JLabel("Sodium:");
        JLabel lblProtein = new JLabel("Protein: ");
        //JLabel lblNumberOfServings = new JLabel("Number of Servings: ");
        JButton btnAddFood = new JButton("Add Food");
        JLabel lblFat_1 = new JLabel("g");
        JLabel lblSodium_1 = new JLabel("mg");
        JLabel lblProtein_1 = new JLabel("g");

        //text fields for user input
        txtFieldFoodName = new JTextField();
        txtFieldFoodName.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldFoodName.setColumns(10);
        txtFieldCalories = new JTextField();
        txtFieldCalories.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldCalories.setColumns(10);
        txtFieldFat = new JTextField();
        txtFieldFat.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldFat.setColumns(10);
        txtFieldSodium = new JTextField();
        txtFieldSodium.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldSodium.setColumns(10);
        txtFieldProtein = new JTextField();
        txtFieldProtein.setHorizontalAlignment(SwingConstants.CENTER);
        txtFieldProtein.setColumns(10);
        //txtFieldNumberOfServings = new JTextField();
        //txtFieldNumberOfServings.setColumns(10);

        //placing everything in the window correctly
        GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_view.createSequentialGroup()
					.addGap(129)
					.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_view.createSequentialGroup()
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblCalories)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFieldCalories, 0, 0, Short.MAX_VALUE)
									.addGap(93))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblSodium)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFieldSodium, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSodium_1)
									.addGap(77)))
							.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblProtein)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFieldProtein, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblProtein_1)
									.addGap(152))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(lblFat)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtFieldFat, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblFat_1)
									.addGap(176))))
						.addGroup(gl_view.createSequentialGroup()
							.addComponent(lblFoodName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_view.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_view.createSequentialGroup()
									.addComponent(lblAddNewFood, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
									.addGap(216))
								.addGroup(gl_view.createSequentialGroup()
									.addComponent(txtFieldFoodName, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))))
				.addGroup(Alignment.LEADING, gl_view.createSequentialGroup()
					.addGap(244)
					.addComponent(btnAddFood, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(244, Short.MAX_VALUE))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddNewFood)
					.addGap(65)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFoodName)
						.addComponent(txtFieldFoodName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCalories)
						.addComponent(txtFieldCalories, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFat)
						.addComponent(txtFieldFat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFat_1))
					.addGap(75)
					.addGroup(gl_view.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSodium)
						.addComponent(txtFieldSodium, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSodium_1)
						.addComponent(lblProtein)
						.addComponent(txtFieldProtein, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProtein_1))
					.addGap(151)
					.addComponent(btnAddFood, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		view.setLayout(gl_view);
        
        btnAddFood.setActionCommand("add");
        btnAddFood.addActionListener(this);
    }

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
            
            if(buttonValue.contentEquals("add"))
            {
                NewFoodData data = getNewFoodData();
                if(data.isValid())
                {
                    controller.addNewFood(data);
                    controller.resetToFoodView();
                }else{
                    JOptionPane.showMessageDialog(null, "It looks like you did not fill in one of the fields correctly\n              Please Try again.", "Invalid data", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
    public void addController(FoodController aThis)
    {
        controller = aThis;
    }
    
    private NewFoodData getNewFoodData()
    {
        NewFoodData data = new NewFoodData();
        
        if (//txtFieldNumberOfServings.getText().matches("[0-9]+")
            txtFieldFat.getText().matches("[0-9]+") 
            && txtFieldSodium.getText().matches("[0-9]+") 
            && txtFieldProtein.getText().matches("[0-9]+") 
            && txtFieldCalories.getText().matches("[0-9]+") 
            && txtFieldFoodName.getText() != null && !txtFieldFoodName.getText().isEmpty())
        {
            data.setFoodName(txtFieldFoodName.getText());
            data.setCalories(txtFieldCalories.getText());
            data.setProtien(txtFieldProtein.getText());
            data.setSodium(txtFieldSodium.getText());
            data.setFat(txtFieldFat.getText());
            //TODO maybe will take servings, but not now
            //data.setServings(txtFieldNumberOfServings.getText());
            data.setValid(true);
        }else{
            data.setValid(false);
        }
        
        return data;
    }
}
