/**
 *
 * @author Eatough
 */

package library;


public interface FoodActions extends Actions
{

    public void setNewFoodView();
    public void setExistingFoodView();
    public void foodTab();
    public boolean newFood(NewFoodData food);
    public void addNewFood(NewFoodData data);
    public void addExistingFood(int text, int selection);
    public void populateExistingFood();
    public void resetToFoodView();
}
