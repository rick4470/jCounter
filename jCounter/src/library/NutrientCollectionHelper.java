/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.util.ArrayList;
import java.util.List;

public class NutrientCollectionHelper extends NutrientHelper
{

    private double totalWeight; //total weight is not calculated correctly. Do not use!
    private List<NutrientHelper> nutrientList;

    public NutrientCollectionHelper()
    {
        nutrientList = new ArrayList<>();
    }

    public void add(NutrientHelper nutrient)
    {
        nutrientList.add(nutrient);

        totalWeight += nutrient.getWeight();
    }

    public void remove(int nutrientId)
    {
        NutrientHelper toRemove = getItem(nutrientId);

        if (null != toRemove)
        {
            totalWeight -= toRemove.getWeight();
            nutrientList.remove(toRemove);
        }
    }

    public NutrientHelper getItem(int nutrientId)
    {
        int index = nutrientList.indexOf(nutrientId);

        if (index >= 0)
        {
            return nutrientList.get(index);
        }

        return null;
    }

    /**
     * @return the totalWeight
     */
    public double getTotalWeight()
    {
        return totalWeight;
    }

    /**
     * @param totalWeight the totalWeight to set
     */
    private void setTotalWeight(double totalWeight)
    {
        this.totalWeight = totalWeight;
    }
    
    public int size()
    {
        return this.nutrientList.size();
    }
}
