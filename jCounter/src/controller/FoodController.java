/**
 * @author rick
 */
package controller;
import java.awt.Component;
import library.FoodActions;
import library.NewFoodData;
import library.NutrientFactory;
import library.NutrientHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import library.FoodItem;
import library.MealFactory;
import library.MealHelper;
import library.SUser;
import library.WeekdayFactory;
import library.WeekdayHelper;
import view.ExistingFoodView;
import view.FoodView;
import view.NewFoodView;
import view.View;

public class FoodController extends Controller implements FoodActions
{
    private JPanel tabView;
    
    public FoodController(View view) 
    {
        super(view);
    }
    
    @Override
    public void setNewFoodView() 
    {
        tabView.removeAll();
        
        NewFoodView foodView = new NewFoodView();   
        foodView.addController(this);
        setLayout(foodView.getView());
        tabView = foodView.getView();
    }

    @Override
    public void setExistingFoodView() 
    {
        tabView.removeAll();
        
        ExistingFoodView existingFoodView = new ExistingFoodView();   
        existingFoodView.addController(this);
        setLayout(existingFoodView.getView());
        tabView = existingFoodView.getView();
    }
    

    
    @Override
    public void foodTab()
    {   
        FoodView foodView = new FoodView();   
        foodView.addController(this);
        tabView = foodView.getView();
    }
    
    @Override
    public boolean newFood(NewFoodData food)
    {
        WeekdayHelper weekday = WeekdayFactory.CreateInstance();
        MealHelper meal = MealFactory.CreateInstance(); //.CreateInstance();
        NutrientHelper nutrient = NutrientFactory.CreateInstance();
        
        meal.setMealName(food.getFoodName());
        nutrient.setSodium(food.getProtien());
        nutrient.setTotalCalories(food.getCalories());
        nutrient.setFat(food.getFat());
        nutrient.setSodium(food.getSodium());
        weekday.setAppUserId(SUser.getUserId());
        meal.setWeekDayID(weekday.getWeekDayId());

        return true;
    }

    @Override
    public void addNewFood(NewFoodData data) 
    {                
//        NutrientHelper nutrient = NutrientFactory.CreateInstance();
//        nutrient.setName(data.getFoodName());
//        nutrient.setCarb(data.getCarbs());
//        nutrient.setFat(data.getFat());
//        nutrient.setProtein(data.getProtien());
//        nutrient.setSodium(data.getSodium());
//        nutrient.setTotalCalories(data.getCalories());      
        
        SUser.setLastMealAte(data.getFoodName());
        SUser.setLastMealAteCalories(data.getCalories());
        SUser.setCurrentCalorieCount((int) data.getCalories());
        SUser.addMeal(data.getFoodName(), data.getCalories());
    }

    @Override
    public void addExistingFood(int servings, int selection) 
    {
         ArrayList<FoodItem> list = SUser.getArraylist();
         FoodItem found = list.get(selection);
         SUser.setCurrentCalorieCount(found.getCals() * servings);
         SUser.setLastMealAte(found.getFood());
    }

    @Override
    public void populateExistingFood()
    {
         MealHelper mealHelper;
        try
        {
            mealHelper = MealFactory.CreateInstance(SUser.getUserId());
            String mealName = mealHelper.getMealName();            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(FoodController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public String[] getListOfFoods()
    {
        return SUser.getList();
    }

    @Override
    public void resetToFoodView()
    {
        tabView.removeAll();
        FoodView foodView = new FoodView();   
        foodView.addController(this);
        setLayout(foodView.getView());
        tabView = foodView.getView();
    }
    
    private void setLayout(JPanel view)
    {
        org.jdesktop.layout.GroupLayout jPanelLayout = new org.jdesktop.layout.GroupLayout(tabView);
        tabView.setLayout(jPanelLayout);

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

    public Component getFoodView()
    {
        return tabView;
    }
    
}
