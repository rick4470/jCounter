/**
 * @author Vlad
 * @author Rick
 */

package library;

import java.sql.SQLException;
import model.MealItemModel;

public class NutrientFactory 
{
    public static NutrientHelper CreateInstance()
    {
        MealItemModel data = new MealItemModel();

        NutrientHelper meal = new NutrientHelper(data);

        return meal;
    }

    public static NutrientHelper CreateInstance(int mealItemId) throws SQLException
    {
        MealItemModel data = new MealItemModel();

        data.loadRowByPrimaryKey(mealItemId);

        NutrientHelper meal = new NutrientHelper(data);

        return meal;
    }

}
