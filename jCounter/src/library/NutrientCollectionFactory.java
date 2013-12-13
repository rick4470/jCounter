/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.sql.SQLException;
import java.util.List;
import model.MealItemModel;

public class NutrientCollectionFactory 
{

    public static NutrientCollectionHelper CreateInstance(int mealId) throws SQLException
    {
        NutrientCollectionHelper itemCollection = new NutrientCollectionHelper();
        MealItemModel data = new MealItemModel();

        List<Integer> itemList = data.getItemListByMealId(mealId);

        if (itemList.size() > 0)
        {
            for (Integer id : itemList)
            {
                NutrientHelper nutrient = NutrientFactory.CreateInstance(id);
                itemCollection.add(nutrient);
            }
        }

        return itemCollection;
    }
}
