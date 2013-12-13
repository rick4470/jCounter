/**
 * ExistingFoodView class creates the existing food page to allow the user to add a food that they've already added before.
 *
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class ExistingFoodView implements ActionListener
{

    private JPanel view;
    private JTextField numberOfServings;
    private FoodActions controller;
    private FoodController foodController;
    private JComboBox listOfFoods;

    /**
     * No-argument constructor calls initView() to initialize the current view.
     */
    public ExistingFoodView()
    {
        initView();
    }

    /**
     * Initializes the view by declaring necessary components for the window and placing them correctly in the window boundaries.
     */
    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));

        JLabel lblAddPreviouslySelected = new JLabel("Add Previously Selected Food");
        lblAddPreviouslySelected.setFont(new Font("Maiandra GD", Font.BOLD, 17));

        JLabel lblSelectFood = new JLabel("Select Food: ");

        foodController = new FoodController(null);
        String[] myStringArray = foodController.getListOfFoods();

        listOfFoods = new JComboBox(myStringArray);
        JLabel lblNumberOfServings = new JLabel("Number of Servings: ");

        numberOfServings = new JTextField();
        numberOfServings.setColumns(10);

        JButton btnAddFood = new JButton("Add Food");
        GroupLayout gl_contentPane = new GroupLayout(view);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addGroup(gl_contentPane.createSequentialGroup()
                                        .addGap(103)
                                        .addComponent(lblAddPreviouslySelected))
                                .addGroup(gl_contentPane.createSequentialGroup()
                                        .addGap(78)
                                        .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                                .addGroup(gl_contentPane.createSequentialGroup()
                                                        .addComponent(lblSelectFood)
                                                        .addGap(18)
                                                        .addComponent(listOfFoods, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(gl_contentPane.createSequentialGroup()
                                                        .addComponent(lblNumberOfServings)
                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                        .addComponent(numberOfServings, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                                        .addComponent(btnAddFood, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(74)))))
                        .addContainerGap(88, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddPreviouslySelected)
                        .addGap(70)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblSelectFood)
                                .addComponent(listOfFoods, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(78)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(lblNumberOfServings)
                                .addComponent(numberOfServings, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(94)
                        .addComponent(btnAddFood, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
        );
        view.setLayout(gl_contentPane);
        btnAddFood.addActionListener(this);
        btnAddFood.setActionCommand("add");

    }

    /**
     * Returns the JPanel view
     *
     * @return view
     */
    public JPanel getView()
    {
        return view;
    }

    /**
     * Handles the event in which the user clicks the Add Food button.
     *
     * @param e the event
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (controller != null) {
            String buttonValue = ((JButton) e.getSource()).getActionCommand();

            if (buttonValue.contentEquals("add")) {
                int servings = Integer.parseInt(numberOfServings.getText());
                controller.addExistingFood(servings, listOfFoods.getSelectedIndex());
                controller.resetToFoodView();
            }
        }
    }

    /**
     * Adds a controller
     *
     * @param aThis the FoodController
     */
    public void addController(FoodController aThis)
    {
        controller = aThis;
        controller.populateExistingFood();
    }
}
