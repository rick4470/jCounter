/**
 *
 * @author Camille
 * @author Rick
 * 
 * Food view that shows two options 
 * add new a food or add previously Selected food
 * 
 */
package view;

import controller.Controller;
import library.FoodActions;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public final class FoodView implements ActionListener
{

    private JPanel view;
    private FoodActions controller;
    private JLabel lblAddFood;
    private JButton btnAddPreexistingFood;
    private JButton btnAddNewFood;
    private JButton btnSelectDay;
    private JButton btnNewDay;
    private JButton btnNewMeal;
    private JButton btnExistingMeal;
    

    public FoodView()
    {
        initView();
    }

    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        //buttons and labels
        lblAddFood= new JLabel("Add Food");
        lblAddFood.setFont(new Font("Maiandra GD", Font.BOLD, 17));
        
        btnNewDay = new JButton("Start New Day");
        btnSelectDay = new JButton("Select Existing Day");
        
        btnNewMeal = new JButton("Start New Meal");
        btnExistingMeal = new JButton("Select Existing Meal");
        
        btnAddPreexistingFood= new JButton("Add Previously Selected Food");
        btnAddNewFood = new JButton("Add New Food");

        //placing everything correctly in window
        GroupLayout gl_view = new GroupLayout(view);
		gl_view.setHorizontalGroup(
			gl_view.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap(197, Short.MAX_VALUE)
					.addGroup(gl_view.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAddPreexistingFood, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(btnAddNewFood, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
					.addGap(187))
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap(251, Short.MAX_VALUE)
					.addComponent(lblAddFood)
					.addGap(241))
		);
		gl_view.setVerticalGroup(
			gl_view.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_view.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddFood)
					.addGap(140)
					.addComponent(btnAddPreexistingFood, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addComponent(btnAddNewFood, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(299, Short.MAX_VALUE))
		);
		view.setLayout(gl_view);
        
        btnSelectDay.setActionCommand("existingDay");
        btnSelectDay.addActionListener(this);
        
        btnNewDay.setActionCommand("newDay");
        btnNewDay.addActionListener(this);
        
        btnExistingMeal.setActionCommand("existingMeal");
        btnExistingMeal.addActionListener(this);
        
        btnNewMeal.setActionCommand("newMeal");
        btnNewMeal.addActionListener(this);
        
        btnAddPreexistingFood.setActionCommand("existingFood");
        btnAddPreexistingFood.addActionListener(this);
        
        btnAddNewFood.setActionCommand("newFood");
        btnAddNewFood.addActionListener(this);
    }

    public JPanel getView()
    {
        return view;
    }

    public void addController(Controller action)
    {
        controller = (FoodActions) action;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(controller != null)
        {
            String buttonValue = ((JButton) e.getSource()).getActionCommand();
            
            if(buttonValue.contentEquals("existingFood"))
            {
                controller.setExistingFoodView();
            }
            if(buttonValue.contentEquals("newFood"))
            {
                controller.setNewFoodView();
            }
        }
    }

}
