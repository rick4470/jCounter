/**
 * @author Vlad
 * @author Rick
 */
package library;
import java.sql.SQLException;
import model.MealModel;

public class MealFactory
{
    public static MealHelper CreateInstance()
    {
        MealModel data = new MealModel();

        MealHelper meal = new MealHelper(data);

        return meal;
    }

    public static MealHelper CreateInstance(int weekDayId) throws SQLException
    {
        WeekdayHelper helper = WeekdayFactory.GetCurrentInstance(weekDayId);
        
        MealModel data = new MealModel();
        
        int mealId = data.getCurrentIdByWeekday(helper.getWeekDayId());

        if(mealId == 0)
        {
            data.setMealName("Default Meal");
            data.setWeekDayID(helper.getWeekDayId());
            data.Save(); //Save doesn't retrieve the id must re-query
            
            mealId = data.getCurrentIdByWeekday(helper.getWeekDayId());
        }

        MealHelper meal = new MealHelper(data);

        return meal;
    }
}
