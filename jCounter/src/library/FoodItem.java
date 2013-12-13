package library;

public class FoodItem
{
    private String food;
    private int cals;
    
    FoodItem(String foodName, double calories)
    {
        food = foodName;
        cals = (int) calories;
    }

    /**
     * @return the food
     */
    public String getFood()
    {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food)
    {
        this.food = food;
    }

    /**
     * @return the cals
     */
    public int getCals()
    {
        return cals;
    }

    /**
     * @param cals the cals to set
     */
    public void setCals(int cals)
    {
        this.cals = cals;
    }
    
    
    
}
