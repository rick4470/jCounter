/**
 *
 * @author <Rick>
 * Static user that contains all the data
 * that a valid user should contain. This is used
 * all over the app to query by row.
 */
package library;

import java.util.ArrayList;


public class SUser
{
    private static int key;
    private static int userId;
    private static String currentFood;
    private static double currentFoodCalories;
    private static int count;
    private static ArrayList<FoodItem> list = new ArrayList<>();
    private static double sevenweekday;

    public static void setUserId(int id)
    {
        userId = id;
    }
    public static int getUserId()
    {
        return userId;
    }

    public static String getLastMeal()
    {
        return currentFood;
    }

    public static String getLastMealCalories()
    {
        return Integer.toString((int) currentFoodCalories);
    }

    public static void setLastMealAte(String foodName)
    {
        currentFood = foodName;
    }

    public static void setLastMealAteCalories(double calories)
    {
        currentFoodCalories = calories;
    }

    public static int getCurrentCalorieCount()
    {
        return count;
    }
    
    public static void setCurrentCalorieCount(int plus)
    {
        count += plus;
    }
    
    public static void addMeal(String foodName, double calories)
    {
        FoodItem myItem = new FoodItem(foodName, calories);
        list.add(myItem);
    }
    
    public static ArrayList<FoodItem> getArraylist()
    {
        return list;
    }

    public static String[] getList()
    {
        ArrayList<String> names = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++)
        {
            names.add(list.get(i).getFood());
        }
        
        String []nameArray = new String[names.size()];
        int index = 0;
        for(String name:names)
        {
            nameArray[index] = name;
            index++;
        }
        return nameArray;
    }

    public static void set7WeekDayCals(double d)
    {
       sevenweekday = d;
    }
    
    public static double get7WeekDayCals()
    {
       return sevenweekday;
    }
    
    private SUser(){}
    
    public static int getLicenseNumberId()
    {
        return key;
    }
    
    public static void setLicenseNumberId(int validKey)
    {
        key = validKey;
    }
    
    
}
